package com.example.oraclestatuspagev2.persistent.mapper;

import com.example.oraclestatuspagev2.persistent.entity.ComponentEntity;
import com.example.oraclestatuspagev2.web.dto.ComponentDto;
import org.mapstruct.Mapper;

@Mapper
public interface ComponentMapper {
    ComponentDto toDto(ComponentEntity entity);

    ComponentEntity toEntity(ComponentDto dto);
}
