package com.example.oraclestatuspagev2.persistent.mapper;

public interface MapperBase<ReducedDto, FullDto, CreateDto, Entity> {
    ReducedDto toReducedDto(Entity entity);

    FullDto toFullDto(Entity entity);

    Entity ToEntity(CreateDto dto);
}
