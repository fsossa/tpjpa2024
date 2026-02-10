package jpa;
import java.time.LocalDate;

public class Admin extends User {
    private Long id;

    public Admin() {
        super();
    }

    public Admin(String nom, String prenom, LocalDate dateNaissance, String email, String motDePss) {
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
}
