package com.desafiobackend.primeiraprova.repository;

import com.desafiobackend.primeiraprova.model.Musica;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface MusicaRepository extends MongoRepository<Musica, String> {
    
}
