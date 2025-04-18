package com.example.controle.controller;

import com.example.controle.DTO.DonDTO;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.math.BigDecimal;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class DonControllerIntegrationTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testCreateDon() throws Exception {
        DonDTO dto = new DonDTO();
        dto.setNomDonateur("Alice");
        dto.setMontant(new BigDecimal("150"));
        dto.setNomCampagne("Campagne A");

        mockMvc.perform(post("/api/campagnes/1/dons")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(new ObjectMapper().writeValueAsString(dto)))
                .andExpect(status().isOk());
    }
}
