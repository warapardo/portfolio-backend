package com.portfolio.wara.portfolio_backend.model;

import java.util.List;
import java.util.Map;

public class Perfil {
    private String nome;
    private String profissao;
    private String localizacao;
    private String email;
    private String telefone;
    private String sobre;
    private List<String> habilidades;
    private Map<String, String> redesSociais;
    private List<Projeto> projetos;
    
    // Construtor
    public Perfil() {
        this.nome = "Wara Pardo";
        this.profissao = "Desenvolvedor Java Full Stack";
        this.localizacao = "Limeira, São Paulo, Brasil";
        this.email = "waarapardo@gmail.com";
        this.telefone = "+55 19 982757007G";
        this.sobre = "Sou um entusiasta da tecnologia e do desenvolvimento web...";
        
        this.habilidades = List.of(
            "Fullstack", "Python", "Java 25", "Spring Boot 4.0", 
            "AWS", "Linux", "Git & GitHub", "HTML/CSS/JavaScript", "MySQL/PostgreSQL"
        );
        
        this.redesSociais = Map.of(
            "github", "https://github.com/warapardo",
            "linkedin", "https://linkedin.com/in/warapardo",
            "portfolio", "https://warapardo.github.io/portfolio-wara/"
        );
        
        this.projetos = List.of(
            new Projeto(
                "EPIC (Energy Production Innovation Center)", 
                "Desenvolvimento e manutenção de tema WordPress customizado para o EPIC/Unicamp...", 
                "https://github.com/portfolio-wara",
                List.of("HTML", "CSS", "JavaScript", "PHP")
            ),
            new Projeto(
                "Portfolio Backend API", 
                "API REST com Spring Boot 4.0 e Java 25...", 
                "https://github.com/portfolio-backend",
                List.of("Java 25", "Spring Boot 4.0", "Maven")
            )
        );
    }
    
    // Getters
    public String getNome() { return nome; }
    public String getProfissao() { return profissao; }
    public String getLocalizacao() { return localizacao; }
    public String getEmail() { return email; }
    public String getTelefone() { return telefone; }
    public String getSobre() { return sobre; }
    public List<String> getHabilidades() { return habilidades; }
    public Map<String, String> getRedesSociais() { return redesSociais; }
    public List<Projeto> getProjetos() { return projetos; }
    
    public static class Projeto {
        private String nome;
        private String descricao;
        private String link;
        private List<String> tecnologias;
        
        public Projeto(String nome, String descricao, String link, List<String> tecnologias) {
            this.nome = nome;
            this.descricao = descricao;
            this.link = link;
            this.tecnologias = tecnologias;
        }
        
        public String getNome() { return nome; }
        public String getDescricao() { return descricao; }
        public String getLink() { return link; }
        public List<String> getTecnologias() { return tecnologias; }
    }
}
