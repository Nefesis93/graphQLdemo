package com.example.graph_ql_demo.mapper;

import com.example.graph_ql_demo.dto.RuoloDTO;
import com.example.graph_ql_demo.entity.Ruolo;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RuoloMapper extends GenericMapper<Ruolo, RuoloDTO> {
}
