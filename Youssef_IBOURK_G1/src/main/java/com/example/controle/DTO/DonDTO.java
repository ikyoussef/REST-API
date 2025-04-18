package com.example.controle.DTO;


import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

import java.math.BigDecimal;
import java.time.LocalDate;

// DonDTO.java
// DonDTO.java
public class DonDTO {
    private Long id;

    private LocalDate date;

    // Getters/setters


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomCampagne() {
        return nomCampagne;
    }

    public void setNomCampagne(String nomCampagne) {
        this.nomCampagne = nomCampagne;
    }

    public String getNomDonateur() {
        return nomDonateur;
    }

    public void setNomDonateur(String nomDonateur) {
        this.nomDonateur = nomDonateur;
    }

    public BigDecimal getMontant() {
        return montant;
    }

    public void setMontant(BigDecimal montant) {
        this.montant = montant;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }



    @Schema(description = "Nom de la campagne associée", example = "Aide aux réfugiés")
    private String nomCampagne;

    @Schema(description = "Nom du donateur", example = "Ahmed Benali")
    private String nomDonateur;

    @Schema(description = "Montant du don (doit être > 0)", example = "500.00")
    private BigDecimal montant;


}

