package jpa;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Customer extends User {
    private Long id;
    private List<Ticket> ticketsAchetes;
    
    public Customer() {
    }

    public Customer(String lastName, String firstName, String mail, String passWord) {
        super(lastName, firstName, null, mail, passWord);
    }

    @Id
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
