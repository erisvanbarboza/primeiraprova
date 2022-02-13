package com.desafiobackend.primeiraprova.controller;

import java.util.List;

import com.desafiobackend.primeiraprova.model.Musica;
import com.desafiobackend.primeiraprova.service.MusicaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/musica")
public class MusicaController {
    
    @Autowired
    private MusicaService servico;

    @PostMapping
    public ResponseEntity<Musica> criarProduto(@RequestBody Musica musica){
        Musica musicaCriada = servico.salvar(musica);
        return new ResponseEntity<>(musicaCriada, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Musica>> obterMusica(){
        List<Musica> musica = servico.obterMusica();
        return new ResponseEntity<>(musica, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deletarMusica(@PathVariable String id){
        servico.deletarMusica(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
