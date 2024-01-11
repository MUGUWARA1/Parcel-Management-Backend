package com.example.facteur.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Habitant extends Personne {

    private String email;
    private String Telephone;

    @ManyToOne
    private CentrePostal centrePostal;

    @OneToMany(mappedBy = "emmeteur")
    private List<Colis> listcolisEmmetion =new ArrayList<>();


    @OneToMany(mappedBy = "recepteur")
    private List<Colis> listcolisReception = new ArrayList<>();


    public Habitant(String nom, String prenom, String ville, String quartier, String rue, String email, String telephone, CentrePostal centrePostal, List<Colis> listcolisEmmetion, List<Colis> listcolisReception) {
        super(nom, prenom, ville, quartier, rue);
        this.email = email;
        Telephone = telephone;
        this.centrePostal = centrePostal;
        this.listcolisEmmetion = listcolisEmmetion;
        this.listcolisReception = listcolisReception;
    }

    public Habitant(){}

    @Override
    public String toString() {
        return "Habitant{" +
                "email='" + email + '\'' +
                ", Telephone='" + Telephone + '\'' +
                '}';
    }
}
