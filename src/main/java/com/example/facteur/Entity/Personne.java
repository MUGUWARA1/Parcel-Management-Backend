package com.example.facteur.Entity;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Personne {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom,prenom,ville ,quartier,rue;

    public Personne(String nom, String prenom, String ville, String quartier, String rue) {
        this.nom = nom;
        this.prenom = prenom;
        this.ville = ville;
        this.quartier = quartier;
        this.rue = rue;
    }
    public Personne(){}

    @Override
    public String toString() {
        return "Personne{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", ville='" + ville + '\'' +
                ", quartier='" + quartier + '\'' +
                ", rue='" + rue + '\'' +
                '}';
    }
}
