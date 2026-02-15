package jpa;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Artist {
    private Long id;
    private String name;
    private Concert concert;

    public Artist() {
    }

    public Artist(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ManyToMany
    public Concert getConcert() {
        return concert;
    }
    
    public void setConcert(Concert concert) {
        this.concert = concert;
    }   

}
