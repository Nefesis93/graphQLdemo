package com.example.graph_ql_demo.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Builder
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "utente_ruolo")
public class UtenteRuoloEntity {

    @EmbeddedId
    private UtenteRuoloKey id;

    @ManyToOne
    @MapsId("idRuolo")
    @JoinColumn(name = "id_ruolo")
    private Ruolo ruolo;

    @ManyToOne
    @MapsId("matricola")
    @JoinColumn(name = "matricola")
    private Utente utente;
}
