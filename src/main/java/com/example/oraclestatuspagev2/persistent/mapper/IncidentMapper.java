package com.example.oraclestatuspagev2.persistent.mapper;

import com.example.oraclestatuspagev2.persistent.entity.IncidentEntity;
import com.example.oraclestatuspagev2.web.dto.incident.IncidentCreateDto;
import com.example.oraclestatuspagev2.web.dto.incident.IncidentFullDto;
import com.example.oraclestatuspagev2.web.dto.incident.IncidentReducedDto;
import org.mapstruct.Mapper;

@Mapper
interface IncidentMapper extends MapperBase<IncidentReducedDto, IncidentFullDto, IncidentCreateDto, IncidentEntity> {
}
