package com.example.graph_ql_demo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@Setter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class BaseUtente {
    private String matricola;
    private String nome;
    private String cognome;
    private String email;
    private List<RuoloDTO> ruoli;
}
