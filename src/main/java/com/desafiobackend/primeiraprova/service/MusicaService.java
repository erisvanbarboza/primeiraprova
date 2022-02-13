package com.desafiobackend.primeiraprova.service;

import java.util.List;

import com.desafiobackend.primeiraprova.model.Musica;
import com.desafiobackend.primeiraprova.repository.MusicaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MusicaService {
    @Autowired
    private MusicaRepository repositorio;
    
    public Musica salvar(Musica musica){
        return repositorio.save(musica);
    }

    public List<Musica> obterMusica(){
        return repositorio.findAll();
    }

    public void deletarMusica(String id){
        repositorio.deleteById(id);
    }
}
