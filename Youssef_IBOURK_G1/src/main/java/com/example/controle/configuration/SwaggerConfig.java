package com.example.controle.configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "API de Gestion de Campagnes",
                version = "1.0",
                description = "Documentation pour l'API de dons et campagnes"
        )
)
public class SwaggerConfig {
    // Aucun code supplémentaire nécessaire si vous utilisez les annotations OpenAPI dans les contrôleurs.
}