package com.example.oraclestatuspagev2.persistent.mapper;

import com.example.oraclestatuspagev2.persistent.entity.ComponentGroupEntity;
import com.example.oraclestatuspagev2.web.dto.ComponentGroupDto;
import org.mapstruct.Mapper;

@Mapper
public interface ComponentGroupMapper {
    ComponentGroupDto toDto(ComponentGroupEntity entity);

    ComponentGroupEntity toEntity(ComponentGroupDto dto);
}
