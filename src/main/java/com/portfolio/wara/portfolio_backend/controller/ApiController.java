package com.portfolio.wara.portfolio_backend.controller;

import com.portfolio.wara.portfolio_backend.model.Perfil;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import java.time.LocalDateTime;
import java.util.Map;
import java.util.HashMap;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "*") // Permite acesso do frontend
public class ApiController {
    
    // Endpoint de health check customizado
    @GetMapping("/health")
    public ResponseEntity<Map<String, Object>> healthCheck() {
        Map<String, Object> response = new HashMap<>();
        response.put("status", "UP");
        response.put("service", "portfolio-api");
        response.put("version", "1.0.0");
        response.put("javaVersion", "25");
        response.put("springBootVersion", "4.0.2");
        response.put("timestamp", LocalDateTime.now().toString());
        response.put("message", "API do portfólio do Wara Pardo está funcionando!");
        return ResponseEntity.ok(response);
    }
    
    // Endpoint principal - Retorna todos os dados do perfil
    @GetMapping("/perfil")
    public ResponseEntity<Perfil> getPerfilCompleto() {
        Perfil perfil = new Perfil();
        return ResponseEntity.ok(perfil);
    }
    
    // Endpoint somente com informações básicas
    @GetMapping("/perfil/basico")
    public ResponseEntity<Map<String, String>> getPerfilBasico() {
        Map<String, String> perfil = new HashMap<>();
        perfil.put("nome", "Wara Pardo");
        perfil.put("profissao", "Desenvolvedor Java Full Stack");
        perfil.put("localizacao", "São Paulo, Brasil");
        perfil.put("email", "contato@warapardo.dev");
        perfil.put("portfolio", "https://warapardo.github.io/portfolio-wara/");
        return ResponseEntity.ok(perfil);
    }
    
    // Endpoint somente com habilidades
    @GetMapping("/perfil/habilidades")
    public ResponseEntity<Map<String, Object>> getHabilidades() {
        Perfil perfil = new Perfil();
        Map<String, Object> response = new HashMap<>();
        response.put("quantidade", perfil.getHabilidades().size());
        response.put("habilidades", perfil.getHabilidades());
        response.put("tecnologiaPrincipal", "Java 25 + Spring Boot 4.0");
        return ResponseEntity.ok(response);
    }
    
    // Endpoint somente com projetos
    @GetMapping("/perfil/projetos")
    public ResponseEntity<Map<String, Object>> getProjetos() {
        Perfil perfil = new Perfil();
        Map<String, Object> response = new HashMap<>();
        response.put("quantidade", perfil.getProjetos().size());
        response.put("projetos", perfil.getProjetos());
        response.put("destaque", "Portfolio Backend API (este projeto)");
        return ResponseEntity.ok(response);
    }
    
    // Endpoint de "sobre mim"
    @GetMapping("/sobre")
    public ResponseEntity<Map<String, String>> getSobre() {
        Perfil perfil = new Perfil();
        Map<String, String> response = new HashMap<>();
        response.put("sobre", perfil.getSobre());
        response.put("autor", perfil.getNome());
        response.put("foco", "Java Backend e Arquitetura de Software");
        return ResponseEntity.ok(response);
    }
}