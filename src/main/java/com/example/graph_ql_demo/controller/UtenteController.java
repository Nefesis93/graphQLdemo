package com.example.graph_ql_demo.controller;

import com.example.graph_ql_demo.entity.Utente;
import com.example.graph_ql_demo.rerepository.UtenteRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Slf4j
@Controller
public class UtenteController {

    @Autowired
    private UtenteRepository repository;

//    @QueryMapping
//    public Utente utente(String matricola) {
//        log.info("prova");
//        return repository.getById(matricola);
//    }
}
