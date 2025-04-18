package com.example.controle.services;
// ServiceDon.java

import com.example.controle.DTO.DonDTO;
import com.example.controle.entity.Campagne;
import com.example.controle.entity.Donation;
import com.example.controle.repository.CampagneRepository;
import com.example.controle.repository.DonationRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class ServiceDon {
    @Autowired
    private DonationRepository donationRepo;

    @Autowired
    private CampagneRepository campagneRepo;

    public DonDTO enregistrerDon(Long campagneId, @Valid DonDTO dto) {
        Campagne campagne = campagneRepo.findById(campagneId)
                .orElseThrow(() -> new RuntimeException("Campagne non trouvée"));

        Donation don = new Donation();
        don.setCampagne(campagne);
        don.setNomDonateur(dto.getNomDonateur());
        don.setMontant(dto.getMontant());
        don.setDate(LocalDate.now());

        Donation saved = donationRepo.save(don);

        dto.setId(saved.getId());
        dto.setDate(saved.getDate());
        dto.setNomCampagne(campagne.getNom());

        return dto;
    }
}
