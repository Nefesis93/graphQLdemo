package com.example.grah_ql_demo.mapper;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface GenericMapper<ENTITY, DTO> {

    DTO entityToModel(ENTITY entity);

    ENTITY modelToEntity(DTO dto);

}
