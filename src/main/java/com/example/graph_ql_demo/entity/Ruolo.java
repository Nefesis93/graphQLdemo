package com.example.graph_ql_demo.entity;

import com.example.graph_ql_demo.enumeration.RuoloEnum;
import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity(name = "ruolo")
public class Ruolo {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @EqualsAndHashCode.Include
    @Enumerated(EnumType.STRING)
    private RuoloEnum nome;

    @Builder.Default
    @ManyToMany
    @JoinTable(
            name = "utente_ruolo",
            joinColumns = @JoinColumn(name = "id_ruolo"),
            inverseJoinColumns = @JoinColumn(name = "uuid_utente"))
    Set<Utente> utenti = new HashSet<>();
}
