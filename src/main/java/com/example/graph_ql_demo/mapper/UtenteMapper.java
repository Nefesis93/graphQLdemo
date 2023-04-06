package com.example.graph_ql_demo.mapper;

import com.example.graph_ql_demo.dto.UtenteDTO;
import com.example.graph_ql_demo.entity.Utente;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UtenteMapper extends GenericMapper<Utente, UtenteDTO> {
}
