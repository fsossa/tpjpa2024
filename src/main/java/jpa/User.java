package jpa;

import java.time.LocalDate;

public abstract class User {
    protected String lastName;
    protected String firstName;
    protected LocalDate dateOfBirth;
    protected String mail;
    protected String passWord;

    public User() {
    }

    public User(String lastName, String firstName, LocalDate dateOfBirth, String mail, String passWord) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.dateOfBirth = dateOfBirth;
        this.mail = mail;
        this.passWord = passWord;
    }

    public abstract Long getId();

    public abstract void setId(Long id);

    public String getlastName() {
        return lastName;
    }

    public void setlastName(String lastName) {
        this.lastName = lastName;
    }

    public String getfirstName() {
        return firstName;
    }

    public void setfirstName(String firstName) {
        this.firstName = firstName;
    }

    public LocalDate getdateOfBirth() {
        return dateOfBirth;
    }

    public void setdateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getmail() {
        return mail;
    }

    public void setmail(String mail) {
        this.mail = mail;
    }

    public String getpassWord() {
        return passWord;
    }

    public void setpassWord(String passWord) {
        this.passWord = passWord;
    }

    public void login(String mail, String passWord) {
        // Implémentation de la logique de connexion
    }
}
