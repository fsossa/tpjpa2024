package jpa;
import java.time.LocalDate;
import java.util.List;

public class Organizer extends User {
    private Long id;
    private List<Concert> concertsOrganised;
    
    public Organizer() {
    }

    public Organizer(String lastName, String firstName, LocalDate dateOfBirth, String mail, String passWord) {
        super(lastName, firstName, dateOfBirth, mail, passWord);
    }

    @Override
    public Long getId() {
        return id;
    }  

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public List<Concert> getconcertsOrganised() {
        return concertsOrganised;
    }

    public void addConcertOrganise(Concert concert) {
        this.concertsOrganised.add(concert);
    }

    public void removeConcertOrganise(Concert concert) {
        this.concertsOrganised.remove(concert);
    }

    public void setconcertsOrganised(List<Concert> concertsOrganised) {
        this.concertsOrganised = concertsOrganised;
    }
}