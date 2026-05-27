package com.portfolio.wara.portfolio_backend.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration  // Diz ao Spring: "esta é uma classe de configuração"
public class CorsConfig implements WebMvcConfigurer {
    /*
    implements WebMvcConfigurer: Implementa interface para configurar Spring MVC.
    */
    
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        /*
        Método que configura CORS (Cross-Origin Resource Sharing).
        CORS: Permite que sites em domínios diferentes acessem sua API.
        */
        
        registry.addMapping("/api/**")  // Aplica a todas rotas /api
                .allowedOrigins(
                    "https://warapardo.github.io",  // Seu portfólio GitHub
                    "http://localhost:8000",         // Frontend local
                    "http://localhost:5500"          // Live Server VSCode
                )
                .allowedMethods("GET", "POST", "OPTIONS")  // Métodos permitidos
                .allowedHeaders("*")  // Todos cabeçalhos
                .allowCredentials(false)  // Sem cookies
                .maxAge(3600);  // Cache por 1 hora
    }
}