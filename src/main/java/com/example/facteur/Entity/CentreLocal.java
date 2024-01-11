package com.example.facteur.Entity;

import jakarta.persistence.Entity;

import java.util.List;

@Entity
public class CentreLocal extends CentrePostal{
    public CentreLocal(String nom, int numero, String rue, String quartier, String ville, CentreRegional centreRegional, List<Habitant> habitants, List<Facteur> facteurs, List<Colis> colisList) {
        super(nom, numero, rue, quartier, ville, centreRegional, habitants, facteurs, colisList);
    }

    public CentreLocal() {
    }
}
