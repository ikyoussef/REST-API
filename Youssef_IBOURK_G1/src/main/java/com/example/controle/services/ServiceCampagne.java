package com.example.controle.services;

import com.example.controle.Projection.CampagneResume;
import com.example.controle.repository.CampagneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

// ServiceCampagne.java
@Service
public class ServiceCampagne {
    @Autowired
    private CampagneRepository campagneRepo;

    public List<CampagneResume> getCampagnesActives() {
        LocalDate today = LocalDate.now();
        return campagneRepo.findActiveCampagnes();
    }
}
