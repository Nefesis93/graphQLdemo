package com.example.grah_ql_demo.entity;

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
public class UtenteEntity {

    @Id
    private String matricola;

    private String nome;

    private String cognome;

    @Column(unique = true)
    private String email;

    @OneToMany(mappedBy = "ruolo")
    List<UtenteRuoloEntity> ruoli;
}
