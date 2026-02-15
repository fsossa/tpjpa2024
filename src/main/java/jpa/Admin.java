package jpa;
import java.time.LocalDate;

import jakarta.persistence.Entity;

@Entity
public class Admin extends User {

    public Admin() {
        super();
    }

    public Admin(String lastName, String firstName, LocalDate dateOfBirth, String mail, String password) {
        super(lastName, firstName, dateOfBirth, mail, password);
    }
}
