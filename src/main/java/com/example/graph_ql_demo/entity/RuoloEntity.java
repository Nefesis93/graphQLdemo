package com.example.graph_ql_demo.entity;

import com.example.graph_ql_demo.enumeration.RuoloEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "ruolo")
public class RuoloEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Enumerated(EnumType.STRING)
    private RuoloEnum nome;

    @OneToMany(mappedBy = "utente")
    List<UtenteRuoloEntity> utenti;
}
