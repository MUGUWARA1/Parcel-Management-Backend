package com.example.facteur.Repo;

import com.example.facteur.Entity.Personne;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonneRepo extends JpaRepository<Personne,Long> {
}
