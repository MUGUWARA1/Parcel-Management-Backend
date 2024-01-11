package com.example.facteur.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;
@Entity
public class CentreRegional extends  CentrePostal{

    @OneToMany(mappedBy = "centreRegional")
    private List<CentrePostal> centrePostalList=new ArrayList<>();

    public CentreRegional(String nom, int numero, String rue, String quartier, String ville, CentreRegional centreRegional, List<Habitant> habitants, List<Facteur> facteurs, List<Colis> colisList, List<CentrePostal> centrePostalList) {
        super(nom, numero, rue, quartier, ville, centreRegional, habitants, facteurs, colisList);
        this.centrePostalList = centrePostalList;
    }

    public CentreRegional() {
    }
}
