package com.example.oraclestatuspagev2.persistent.mapper;

public interface MapperBase<ReducedDto, FullDto, Entity> {
    ReducedDto toReducedDto(Entity entity);

    FullDto toFullDto(Entity entity);

//    Entity reducedToEntity(ReducedDto dto);
//
//    Entity fullToEntity(FullDto dto);
}
