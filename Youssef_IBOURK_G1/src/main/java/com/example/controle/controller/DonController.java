package com.example.controle.controller;

import com.example.controle.DTO.DonDTO;
import com.example.controle.services.ServiceDon;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

// DonController.java
@RestController
@RequestMapping("/api/campagnes")
public class DonController {
    @Autowired
    private ServiceDon serviceDon;


    @Operation(summary = "Enregistrer un don", description = "Crée un don pour une campagne")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Succès"),
            @ApiResponse(responseCode = "400", description = "Don invalide"),
            @ApiResponse(responseCode = "404", description = "Campagne non trouvée")
    })
    @PostMapping("/{id}/dons")
    public ResponseEntity<DonDTO> createDon(@PathVariable Long id, @RequestBody @Valid DonDTO dto) {
        DonDTO saved = serviceDon.enregistrerDon(id, dto);
        return ResponseEntity.ok(saved);
    }
}

