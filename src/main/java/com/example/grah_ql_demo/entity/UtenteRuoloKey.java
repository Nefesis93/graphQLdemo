package com.example.grah_ql_demo.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class UtenteRuoloKey implements Serializable {

    @Column(name = "matricola")
    private String matricola;


    @Column(name = "id_ruolo")
    private Long idRuolo;
}