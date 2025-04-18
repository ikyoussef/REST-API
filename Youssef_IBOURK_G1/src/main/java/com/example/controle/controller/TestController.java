package com.example.controle.controller;


import org.springframework.web.bind.annotation.RestController;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class TestController {
    @Operation(summary = "Test endpoint")
    @GetMapping("/test")
    public String test() {
        return "OK";
    }
}