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
        registry.addMapping("/**") // Aplica a absolutamente todas as rotas da aplicação
                .allowedOrigins(
                        "https://warapardo.github.io", // Seu portfólio GitHub em produção
                        "http://localhost:3000", // Porta padrão do seu Next.js local
                        "http://localhost:8000",
                        "http://localhost:5500")
                .allowedMethods("GET", "POST", "OPTIONS")
                .allowedHeaders("*")
                .allowCredentials(false)
                .maxAge(3600);
    }
}
