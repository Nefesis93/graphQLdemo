package com.example.graph_ql_demo.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Builder
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "utente")
public class Utente {

    @Id
    private String matricola;

    private String nome;

    private String cognome;

    @Column(unique = true)
    private String email;

    @OneToMany(mappedBy = "ruolo")
    List<UtenteRuoloEntity> ruoli;
}
