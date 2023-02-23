package com.example.graph_ql_demo.mapper;

import com.example.graph_ql_demo.entity.UtenteEntity;
import com.example.graph_ql_demo.model.UtenteDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UtenteMapper extends GenericMapper<UtenteEntity, UtenteDTO>{
}
