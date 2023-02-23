package com.example.grah_ql_demo.entity;

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
    private RuoloEntity ruolo;

    @ManyToOne
    @MapsId("matricola")
    @JoinColumn(name = "matricola")
    private UtenteEntity utente;
}
