package com.example.facteur.Entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Colis {

        @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long numero;
        private LocalDate dateDepot;
        private LocalDate dateReception;

        @ManyToOne
        @JoinColumn
        private Habitant emmeteur;

        @ManyToOne
        @JoinColumn
        private Habitant recepteur;

        @ManyToOne
        @JoinColumn(name = "Facteur_id")
        private Facteur facteur;
        @ManyToMany
        @JoinTable(
                name="association_POST_colis",
                joinColumns = @JoinColumn(name = "Colis_id"),
                inverseJoinColumns = @JoinColumn(name = "CP_id")
        )
        private List<CentrePostal> postalList =new ArrayList<>();

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public LocalDate getDateDepot() {
        return dateDepot;
    }

    public void setDateDepot(LocalDate dateDepot) {
        this.dateDepot = dateDepot;
    }

    public LocalDate getDateReception() {
        return dateReception;
    }

    public void setDateReception(LocalDate dateReception) {
        this.dateReception = dateReception;
    }

    public Habitant getEmmeteur() {
        return emmeteur;
    }

    public void setEmmeteur(Habitant emmeteur) {
        this.emmeteur = emmeteur;
    }

    public Habitant getRecepteur() {
        return recepteur;
    }

    public void setRecepteur(Habitant recepteur) {
        this.recepteur = recepteur;
    }

    public Facteur getFacteur() {
        return facteur;
    }

    public void setFacteur(Facteur facteur) {
        this.facteur = facteur;
    }

    public List<CentrePostal> getPostalList() {
        return postalList;
    }

    public void setPostalList(List<CentrePostal> postalList) {
        this.postalList = postalList;
    }

    public Colis(LocalDate dateDepot, LocalDate dateReception, Habitant emmeteur, Habitant recepteur, Facteur facteur, List<CentrePostal> postalList) {
        this.dateDepot = dateDepot;
        this.dateReception = dateReception;
        this.emmeteur = emmeteur;
        this.recepteur = recepteur;
        this.facteur = facteur;
        this.postalList = postalList;
    }

    public Colis(LocalDate dateDepot, LocalDate dateReception) {
        this.dateDepot = dateDepot;
        this.dateReception = dateReception;
    }
    public Colis(){}

    @Override
    public String toString() {
        return "Colis{" +
                "numero=" + numero +
                ", dateDepot=" + dateDepot +
                ", dateReception=" + dateReception +
                '}';
    }
}
