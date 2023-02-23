package com.example.grah_ql_demo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UtenteDTO {
    private String matricola;
    private String nome;
    private String cognome;
    private String email;
}
