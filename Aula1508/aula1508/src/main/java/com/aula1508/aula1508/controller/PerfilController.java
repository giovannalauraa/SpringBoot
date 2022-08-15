package com.aula1508.aula1508.controller;

import java.util.List;

import com.aula1508.aula1508.model.Perfil;
import com.aula1508.aula1508.repository.PerfilRepository;

import org.apache.catalina.startup.ClassLoaderFactory.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PerfilController {
    // 1. Método para adicionar novo perfil

    // 2. Listar todos os perfis
    @GetMapping("/perfil")
    public List<Perfil> listaTodPerfils(){
        return PerfilRepository.all();
    }

    @GetMapping("/perfil/{id}")
    public Perfil recuperaPerfilById(@PathVariable("id") int idPerfil){ // O parametro precisa coincidir com a variável
        return PerfilRepository.getById(idPerfil);

    }

    @PostMapping("/perfil")
    public void addPerfil( @RequestBody Perfil perfil){
        PerfilRepository.add(perfil);
    }

}
