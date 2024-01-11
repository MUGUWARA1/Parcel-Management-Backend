package com.example.facteur.Repo;

import com.example.facteur.Entity.Habitant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HabitantRepo extends JpaRepository<Habitant,Long> {
}
