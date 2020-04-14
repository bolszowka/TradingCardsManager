package com.bolszowka.mapper;

interface GenericMapper<ENTITY, DTO> {

    ENTITY toEntity(DTO dto);
    DTO toDto(ENTITY entity);
}
