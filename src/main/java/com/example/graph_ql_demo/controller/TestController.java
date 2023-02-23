package com.example.graph_ql_demo.controller;

import com.example.graph_ql_demo.entity.UtenteEntity;
import com.example.graph_ql_demo.mapper.GenericMapper;
import com.example.graph_ql_demo.mapper.UtenteMapper;
import com.example.graph_ql_demo.model.UtenteDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/prova")
public class TestController {

    @Autowired
    private UtenteMapper utenteMapper;

    @GetMapping("/utente")
    public ResponseEntity<UtenteDTO> getUtente(@RequestParam String matricola,
                                               @RequestParam String nome,
                                               @RequestParam String cognome,
                                               @RequestParam String email) {

        UtenteDTO utente = utenteMapper.entityToModel(UtenteEntity.builder()
                .matricola(matricola)
                .nome(nome)
                .cognome(cognome)
                .email(email)
                .build());

        System.out.println(utente);

        return ResponseEntity.ok(utente);
    }
}
