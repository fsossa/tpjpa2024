package jpa;
import java.util.List;

public class Customer extends User {
    private Long id;
    private List<Ticket> ticketsAchetes;
    
    public Customer() {
    }

    public Customer(String nom, String prenom, String email, String motDePss) {
        super(nom, prenom, null, email, motDePss);
    }

    @Override
    public Long getId() {
        return id;
    }  

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public List<Ticket> getTicketsAchetes() {
        return ticketsAchetes;
    }

    public void addTicketAchete(Ticket ticket) {
        this.ticketsAchetes.add(ticket);
    }

    public void removeTicketAchete(Ticket ticket) {
        this.ticketsAchetes.remove(ticket);
    }

    public void setTicketsAchetes(List<Ticket> ticketsAchetes) {
        this.ticketsAchetes = ticketsAchetes;
    }
}
