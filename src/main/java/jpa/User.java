package jpa;

import java.time.LocalDate;

public abstract class User {
    protected String nom;
    protected String prenom;
    protected LocalDate dateNaissance;
    protected String email;
    protected String motDePss;

    public User() {
    }

    public User(String nom, String prenom, LocalDate dateNaissance, String email, String motDePss) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.email = email;
        this.motDePss = motDePss;
    }

    public abstract Long getId();

    public abstract void setId(Long id);

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public LocalDate getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(LocalDate dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMotDePss() {
        return motDePss;
    }

    public void setMotDePss(String motDePss) {
        this.motDePss = motDePss;
    }

    public void login(String email, String motDePss) {
        // Implémentation de la logique de connexion
    }
}
