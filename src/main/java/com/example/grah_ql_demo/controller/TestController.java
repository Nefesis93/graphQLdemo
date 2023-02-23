package com.example.grah_ql_demo.controller;

import com.example.grah_ql_demo.entity.UtenteEntity;
import com.example.grah_ql_demo.mapper.GenericMapper;
import com.example.grah_ql_demo.model.UtenteDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/prova")
public class TestController {

    @Autowired
    private GenericMapper<UtenteEntity, UtenteDTO> utenteMapper;

    @GetMapping("/utente")
    public ResponseEntity<Void> getUtente(@RequestParam String matricola) {

        System.out.println();

        return ResponseEntity.ok(null);
    }
}
