package jpa;
import java.time.LocalDate;
import java.util.List;

public class Organizer extends User {
    private Long id;
    private List<Concert> concertsOrganises;
    
    public Organizer() {
    }

    public Organizer(String nom, String prenom, LocalDate dateNaissance, String email, String motDePss) {
        super(nom, prenom, dateNaissance, email, motDePss);
    }

    @Override
    public Long getId() {
        return id;
    }  

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public List<Concert> getConcertsOrganises() {
        return concertsOrganises;
    }

    public void addConcertOrganise(Concert concert) {
        this.concertsOrganises.add(concert);
    }

    public void removeConcertOrganise(Concert concert) {
        this.concertsOrganises.remove(concert);
    }

    public void setConcertsOrganises(List<Concert> concertsOrganises) {
        this.concertsOrganises = concertsOrganises;
    }
}