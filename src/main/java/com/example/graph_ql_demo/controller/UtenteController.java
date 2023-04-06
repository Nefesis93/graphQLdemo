package com.example.graph_ql_demo.controller;

import com.example.graph_ql_demo.dto.BaseUtente;
import com.example.graph_ql_demo.service.UtenteService;
import com.example.graph_ql_demo.unions.UtenteExistsUnion;
import com.example.graph_ql_demo.unions.UtenteNotFoundUnion;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Slf4j
@Controller
public class UtenteController {

    @Autowired
    private UtenteService service;

    @MutationMapping
    public UtenteExistsUnion insertUtente(@Argument BaseUtente utente) {
        return service.insertUtente(utente);
    }

    @QueryMapping
    public UtenteNotFoundUnion getUtente(@Argument String matricola) {
        return service.getUtente(matricola);
    }
}
