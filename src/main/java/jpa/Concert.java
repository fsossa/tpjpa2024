package jpa;
import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Concert {
    
    private Long id;
    private String topic;
    private String place;
    private LocalDateTime date;
    private String description;
    private Organizer organizer;
    private List<Ticket> tickets;
    private List<String> artists;
    public Concert(String topic, String place, LocalDateTime date, String description, Organizer organizer) {
        this.topic = topic;
        this.place = place;
        this.date = date;
        this.description = description;
        this.organizer = organizer;
    }

    @Id
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
    public List<String> getArtists() { 
        return artists; 
    }
    public void addArtist(String artist) { 
        this.artists.add(artist);
    } 
    public void removeArtist(String artist) { 
        this.artists.remove(artist);
    } 
    public void setArtists(List<String> artists) { 
        this.artists = artists; 
    }
        
}