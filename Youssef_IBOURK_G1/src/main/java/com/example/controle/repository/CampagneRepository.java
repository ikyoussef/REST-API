package com.example.controle.repository;

import com.example.controle.Projection.CampagneResume;
import com.example.controle.entity.Campagne;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;

// CampagneRepository.java
public interface CampagneRepository extends JpaRepository<Campagne, Long> {
    @Query("SELECT c.id AS id, c.nom AS nom, c.objectifMontant AS objectifMontant " +
            "FROM Campagne c " +
            "WHERE c.dateDebut <= CURRENT_DATE AND c.dateFin >= CURRENT_DATE")
    List<CampagneResume> findActiveCampagnes();
}