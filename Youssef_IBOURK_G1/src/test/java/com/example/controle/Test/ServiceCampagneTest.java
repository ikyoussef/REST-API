package com.example.controle.Test;

import com.example.controle.Projection.CampagneResume;
import com.example.controle.services.ServiceCampagne;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class ServiceCampagneTest {
    @Autowired
    private ServiceCampagne service;

    @Test
    public void testGetCampagnesActives() {
        List<CampagneResume> campagnes = service.getCampagnesActives();
        Assertions.assertNotNull(campagnes);
    }
}
