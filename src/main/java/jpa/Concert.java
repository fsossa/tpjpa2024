package jpa;
import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Concert {
    
    private Long id;
    private String topic;
    private String place;
    private LocalDateTime date;
    private String description;
    private Organizer organizer;
    private List<Ticket> tickets;
    private List<Artist> artists;

    public Concert(String topic, String place, LocalDateTime date, String description, Organizer organizer) {
        this.topic = topic;
        this.place = place;
        this.date = date;
        this.description = description;
        this.organizer = organizer;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public String getTopic() {
        return topic;
    }

    public String getPlace() {
        return place;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    @ManyToOne
    public Organizer getOrganizer() {
        return organizer;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setOrganizer(Organizer organizer) {
        this.organizer = organizer;
    }

    @OneToMany(mappedBy = "concert")
    public List<Ticket> getTickets() {
        return tickets;
    }

    public void addTicket(Ticket ticket) {
        this.tickets.add(ticket);
    }

    public void removeTicket(Ticket ticket) {
        this.tickets.remove(ticket);
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }

   @ManyToMany (mappedBy = "concerts")
    public List<Artist> getArtists() {
        return artists;
    }

    public void addArtist(Artist artist) {
        this.artists.add(artist);
    }

    public void removeArtist(Artist artist) {
        this.artists.remove(artist);
    }

    public void setArtists(List<Artist> artists) {
        this.artists = artists;     
    }
}