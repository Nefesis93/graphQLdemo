package com.example.graph_ql_demo.entity;

import com.example.graph_ql_demo.unions.UtenteExistsUnion;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@Builder
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "utente")
public class Utente {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private String uuid;

    @Column(nullable = false, unique = true)
    private String matricola;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String cognome;

    @Column(nullable = false, unique = true)
    private String email;

    @Builder.Default
    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(
            name = "utente_ruolo",
            joinColumns = @JoinColumn(name = "uuid_utente"),
            inverseJoinColumns = @JoinColumn(name = "id_ruolo"))
    Set<Ruolo> ruoli = new HashSet<>();
}
