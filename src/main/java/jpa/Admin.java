package jpa;
import java.time.LocalDate;

public class Admin extends User {
    private Long id;

    public Admin() {
        super();
    }

    public Admin(String lastName, String firstName, LocalDate dateOfBirth, String mail, String passWord) {
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
}
