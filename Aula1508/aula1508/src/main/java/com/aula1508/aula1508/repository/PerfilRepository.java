package com.aula1508.aula1508.repository;

import java.util.ArrayList;

import com.aula1508.aula1508.model.Perfil;

public class PerfilRepository {
    private static PerfilRepository repositorio;

    private ArrayList<Perfil> perfis;

    private PerfilRepository(){
        this.perfis = new ArrayList<>();

    }

    public static void init(){ //Estrutura para garantir que exista 1 objeto PerfilRepository
        if(PerfilRepository.repositorio == null){ //Testando se o banco tá vazio

            // 1.Vou criar uma instância/objeto de PerfilRepository em repositorio 

            PerfilRepository.repositorio = new PerfilRepository();
           // 2.Vou adicionar alguns Perfis iniciais
           PerfilRepository.add( new Perfil("Nome", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTN9K5nAHPYCdWJlF4gB6jqzCOGBUn7ngIQRQ&usqp=CAU", 13, 13, "Brasil", "Java Springboot teste"));
           PerfilRepository.add( new Perfil("Diluc lido", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRYWk3nx3S04XiBxGX5pd0Q4prAduanjkyMiw&usqp=CAU", 2000000, 200, "Genshin", "Rei"));
           PerfilRepository.add( new Perfil("Niki rei", "https://i.pinimg.com/originals/13/53/af/1353af5c1128f0bde78b26da1a2ee055.jpg", 9999999, 100, "Korea", "Meninos com febre"));
           PerfilRepository.add( new Perfil("Bities", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSDdhOBqtefL6ct6MteuVtxjam-PQmiBnE3gCWDAXxlpRU8WRUjrNTrTHu1DrAPZVz2UIU&usqp=CAU", 130, 132, "Brasil", "Dança gatinho dança"));

        }else{
            System.out.println("O banco já foi inicializado!");
        }
    }
    // Adicionar perfis
    public static void add(Perfil perfil) {
        PerfilRepository.repositorio.perfis.add(perfil);
    }

    // Criar novos perfis
    public static ArrayList<Perfil> all(){
        return PerfilRepository.repositorio.perfis;
    }

    // Recupera um perfil pelo seu id 
    public static Perfil getById(int id) {
        return PerfilRepository.repositorio.perfis.stream().filter((perfil) -> perfil.getId() == id).toList().get(0); //Usando a Collection Stream 
    }
}
