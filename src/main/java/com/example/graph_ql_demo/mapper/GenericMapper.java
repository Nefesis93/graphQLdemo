package com.example.graph_ql_demo.mapper;

public interface GenericMapper<ENTITY, DTO> {

    ENTITY toEntity(DTO dto);

    DTO toDTO(ENTITY entity);
}
