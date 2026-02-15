package jpa;
import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

@Entity
@DiscriminatorValue("ORGANIZER")

public class Organizer extends User {
    private List<Concert> concertsOrganised;
    
    public Organizer() {
    }

    public Organizer(String lastName, String firstName, LocalDate dateOfBirth, String mail, String password) {
        super(lastName, firstName, dateOfBirth, mail, password);
    }

    @OneToMany(mappedBy = "organizer")
    public List<Concert> getconcertsOrganised() {
        return concertsOrganised;
    }

    public void addConcert(Concert concert) {
        this.concertsOrganised.add(concert);
    }

    public void removeConcert(Concert concert) {
        this.concertsOrganised.remove(concert);
    }

    public void setconcerts(List<Concert> concertsOrganised) {
        this.concertsOrganised = concertsOrganised;
    }
}