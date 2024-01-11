package com.example.facteur.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;


@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class CentrePostal {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    private String nom;
    private int numero;
    private String rue;
    private String quartier;
    private String ville;

    @ManyToOne
    private CentreRegional centreRegional;

    @OneToMany(mappedBy = "centrePostal")
    private List<Habitant> habitants=new ArrayList<>();

    @OneToMany(mappedBy = "centrePostal")
    private List<Facteur> facteurs =new ArrayList<>();


    @ManyToMany(mappedBy = "postalList")
    private List<Colis> colisList=new ArrayList<>();

    public CentrePostal( String nom, int numero, String rue, String quartier, String ville, CentreRegional centreRegional, List<Habitant> habitants, List<Facteur> facteurs, List<Colis> colisList) {
        this.nom = nom;
        this.numero = numero;
        this.rue = rue;
        this.quartier = quartier;
        this.ville = ville;
        this.centreRegional = centreRegional;
        this.habitants = habitants;
        this.facteurs = facteurs;
        this.colisList = colisList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public String getQuartier() {
        return quartier;
    }

    public void setQuartier(String quartier) {
        this.quartier = quartier;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public CentreRegional getCentreRegional() {
        return centreRegional;
    }

    public void setCentreRegional(CentreRegional centreRegional) {
        this.centreRegional = centreRegional;
    }
    @JsonIgnore
    public List<Habitant> getHabitants() {
        return habitants;
    }

    public void setHabitants(List<Habitant> habitants) {
        this.habitants = habitants;
    }
    @JsonIgnore
    public List<Facteur> getFacteurs() {
        return facteurs;
    }

    public void setFacteurs(List<Facteur> facteurs) {
        this.facteurs = facteurs;
    }
    @JsonIgnore
    public List<Colis> getColisList() {
        return colisList;
    }

    public void setColisList(List<Colis> colisList) {
        this.colisList = colisList;
    }

    public CentrePostal(){}

    @Override
    public String toString() {
        return "CentrePostal{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", numero=" + numero +
                ", rue='" + rue + '\'' +
                ", quartier='" + quartier + '\'' +
                ", ville='" + ville + '\'' +
                '}';
    }
}
