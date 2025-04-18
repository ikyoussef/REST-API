package com.example.controle.controller;

import com.example.controle.Projection.CampagneResume;
import com.example.controle.services.ServiceCampagne;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// CampagneController.java
@RestController
@RequestMapping("/api/campagnes")
public class CampagneController {
    @Autowired
    private ServiceCampagne service;

    @Operation(
            summary = "Récupérer les campagnes actives",
            description = "Retourne la liste des campagnes dont la date est comprise entre aujourd'hui"
    )
    @GetMapping("/actives")
    public List<CampagneResume> getActives() {
        return service.getCampagnesActives();
    }
}

