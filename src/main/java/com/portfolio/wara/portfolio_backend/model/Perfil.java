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
        // Dados estáticos do seu perfil
        this.nome = "Wara Pardo";
        this.profissao = "Desenvolvedor Java Full Stack";
        this.localizacao = "Limeira, São Paulo, Brasil";
        this.email = "waarapardo@gmail.com";
        this.telefone = "+55 19 982757007G";
        this.sobre = "Desenvolvedor especializado em Java e Spring Boot, com foco em arquitetura de software, APIs REST e boas práticas de desenvolvimento. Atualmente aprendendo e implementando projetos com as versões mais recentes do ecossistema Java.";
        
        this.habilidades = List.of(
            "Java 25",
            "Spring Boot 4.0", 
            "APIs REST",
            "Arquitetura MVVM",
            "Maven/Gradle",
            "Git/GitHub",
            "HTML/CSS/JavaScript",
            "MySQL/PostgreSQL"
        );
        
        this.redesSociais = Map.of(
            "github", "https://github.com/warapardo",
            "linkedin", "https://linkedin.com/in/warapardo",
            "portfolio", "https://warapardo.github.io/portfolio-wara/"
        );
        
        this.projetos = List.of(
            new Projeto("Portfolio Backend API", "API REST com Spring Boot 4.0 e Java 25", "https://github.com/warapardo/portfolio-backend"),
            new Projeto("Portfolio Frontend", "Site estático com HTML/CSS/JS", "https://warapardo.github.io/portfolio-wara/"),
            new Projeto("Outros Projetos", "Veja mais no meu GitHub", "https://github.com/warapardo")
        );
    }
    
    // Getters (Spring Boot usa para converter para JSON)
    public String getNome() { return nome; }
    public String getProfissao() { return profissao; }
    public String getLocalizacao() { return localizacao; }
    public String getEmail() { return email; }
    public String getTelefone() { return telefone; }
    public String getSobre() { return sobre; }
    public List<String> getHabilidades() { return habilidades; }
    public Map<String, String> getRedesSociais() { return redesSociais; }
    public List<Projeto> getProjetos() { return projetos; }
    
    // Classe interna para projetos
    public static class Projeto {
        private String nome;
        private String descricao;
        private String link;
        
        public Projeto(String nome, String descricao, String link) {
            this.nome = nome;
            this.descricao = descricao;
            this.link = link;
        }
        
        public String getNome() { return nome; }
        public String getDescricao() { return descricao; }
        public String getLink() { return link; }
    }
}