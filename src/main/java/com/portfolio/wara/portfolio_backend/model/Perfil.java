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
        this.telefone = "+55 (19) 982757007";
        this.sobre = "Sou um entusiasta da tecnologia e desenvolvedor Java Full Stack em formação pela UNICAMP, focado em criar soluções web eficientes, escaláveis e alinhadas com as melhores práticas de mercado. Minha paixão pela programação nasceu da curiosidade de entender a engenharia por trás das aplicações cotidianas, transformando-se rapidamente em um compromisso com a resolução de problemas complexos por meio do código.Atualmente, possuo experiência prática no desenvolvimento e manutenção de sistemas, com destaque para a minha atuação no EPIC (Energy Production Innovation Center) na UNICAMP, onde implementei temas customizados, filtros interativos e consumo de APIs REST utilizando JavaScript e PHP. No ecossistema de backend, dedico meus estudos à arquitetura de software e construção de APIs robustas com Java 25 e Spring Boot 4.0.Estou em busca da minha primeira oportunidade profissional para integrar uma equipe colaborativa, onde eu possa aplicar de forma sólida meus conhecimentos em front e back-end, contribuir para projetos de impacto e continuar evoluindo continuamente como desenvolvedor.";
        
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
                "Desenvolvimento e manutenção de tema WordPress customizado para o EPIC/Unicamp, com implementação de filtros interativos, buscador com dropdown dinâmico via REST API e soluções para limitações de plugins usando JavaScript e PHP.", 
                "https://epicenergy.org.br/",
                "/img/epic_logo.jpg",
                List.of("HTML", "CSS", "JavaScript", "PHP")
            ),
            new Projeto(
                "Portfolio Backend API", 
                "API REST escalável desenvolvida em Java 25 e Spring Boot 4.0 para centralizar e servir as informações do portfólio. Utiliza boas práticas de arquitetura, CORS configurado e respostas em JSON.", 
                "https://github.com/warapardo/portfolio-backend",
                "/img/backend_logo.jpg",
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
        private String imagem;
        private List<String> tecnologias;
        
        public Projeto(String nome, String descricao, String link, String imagem, List<String> tecnologias) {
            this.nome = nome;
            this.descricao = descricao;
            this.link = link;
            this.imagem = imagem;
            this.tecnologias = tecnologias;
        }
        
        public String getNome() { return nome; }
        public String getDescricao() { return descricao; }
        public String getLink() { return link; }
        public String getImagem() {return imagem; }
        public List<String> getTecnologias() { return tecnologias; }
    }
}
