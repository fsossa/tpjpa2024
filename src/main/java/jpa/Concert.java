package jpa;
import java.time.LocalDateTime;
import java.util.List;

public class Concert {
    
    private Long id;
    private String topic;
    private String lieu;
    private LocalDateTime date;
    private String description;
    private Organizer organizer;
    private List<Ticket> tickets;

    public Concert(String topic, String lieu, LocalDateTime date, String description, Organizer organizer) {
        this.topic = topic;
        this.lieu = lieu;
        this.date = date;
        this.description = description;
        this.organizer = organizer;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }  

    public String getTopic() {
        return topic;
    }

    public String getLieu() {
        return lieu;
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

    public void setLieu(String lieu) {
        this.lieu = lieu;
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
}