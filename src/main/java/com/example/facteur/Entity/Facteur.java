package com.example.facteur.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Facteur extends Personne{


    @OneToMany(mappedBy = "facteur")
    private List<Colis>  colisList=new ArrayList<>();


    @ManyToOne
    private CentrePostal centrePostal;

    public Facteur(String nom, String prenom, String ville, String quartier, String rue, List<Colis> colisList, CentrePostal centrePostal) {
        super(nom, prenom, ville, quartier, rue);
        this.colisList = colisList;
        this.centrePostal = centrePostal;
    }

    public Facteur() {
    }
}
