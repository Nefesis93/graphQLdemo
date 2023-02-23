package com.example.grah_ql_demo.mapper;

public interface GenericMapper<ENTITY, DTO> {

    DTO entityToModel(ENTITY entity);

    ENTITY modelToEntity(DTO dto);

}
