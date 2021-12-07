package com.example.oraclestatuspagev2.persistent.mapper;

import com.example.oraclestatuspagev2.persistent.entity.IncidentEntity;
import com.example.oraclestatuspagev2.web.dto.IncidentDto;
import org.mapstruct.Mapper;

@Mapper
interface IncidentMapper {
    IncidentDto toDto(IncidentEntity entity);

    IncidentEntity toEntity(IncidentDto dto);
}
