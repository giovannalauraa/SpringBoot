package com.aula1508.aula1508.model;

public class Perfil {
    private static int idCounter = 0; // Estará disponível para todos os objetos da classe

    private int id;
    private String nome;
    private String foto;
    private int seguidores;
    private int seguindo;
    private String localizacao;
    private String frase;
                                                                                                                                                                                                                           
    public Perfil(){
        this.id = ++Perfil.idCounter; //Contador de id
        this.nome = "Nome";

    }

    public Perfil(String nome, String foto, int seguidores, int seguindo, String localizacao, String frase) {
        this.id = ++Perfil.idCounter;
        this.nome = nome;
        this.foto = foto;
        this.seguidores = seguidores;
        this.seguindo = seguindo;
        this.localizacao = localizacao;
        this.frase = frase;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public int getSeguidores() {
        return seguidores;
    }

    public void setSeguidores(int seguidores) {
        this.seguidores = seguidores;
    }

    public int getSeguindo() {
        return seguindo;
    }

    public void setSeguindo(int seguindo) {
        this.seguindo = seguindo;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    
    
    
}
