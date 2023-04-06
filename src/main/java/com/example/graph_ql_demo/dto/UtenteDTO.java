package com.example.graph_ql_demo.dto;

import com.example.graph_ql_demo.unions.UtenteExistsUnion;
import com.example.graph_ql_demo.unions.UtenteNotFoundUnion;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class UtenteDTO extends BaseUtente implements UtenteExistsUnion, UtenteNotFoundUnion {
    private String uuid;
}
