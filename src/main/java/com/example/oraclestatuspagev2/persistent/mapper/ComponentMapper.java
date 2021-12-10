package com.example.oraclestatuspagev2.persistent.mapper;

import com.example.oraclestatuspagev2.persistent.entity.ComponentEntity;
import com.example.oraclestatuspagev2.web.dto.component.ComponentCreateDto;
import com.example.oraclestatuspagev2.web.dto.component.ComponentFullDto;
import com.example.oraclestatuspagev2.web.dto.component.ComponentReducedDto;
import org.mapstruct.Mapper;

@Mapper
public interface ComponentMapper extends MapperBase<ComponentReducedDto, ComponentFullDto, ComponentCreateDto, ComponentEntity> {
}
