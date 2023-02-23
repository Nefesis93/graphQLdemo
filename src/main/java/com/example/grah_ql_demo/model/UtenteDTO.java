package com.example.grah_ql_demo.model;

import com.example.grah_ql_demo.entity.UtenteRuoloEntity;

import javax.persistence.Column;
import javax.persistence.OneToMany;
import java.util.List;

public class UtenteDTO {
    private String matricola;

    private String nome;

    private String cognome;

    private String email;

}
