package com.example.oraclestatuspagev2.persistent.mapper;

import com.example.oraclestatuspagev2.persistent.entity.ComponentGroupEntity;
import com.example.oraclestatuspagev2.web.dto.component_group.ComponentGroupFullDto;
import com.example.oraclestatuspagev2.web.dto.component_group.ComponentGroupReducedDto;
import org.mapstruct.Mapper;

@Mapper
public interface ComponentGroupMapper
        extends MapperBase<ComponentGroupReducedDto, ComponentGroupFullDto, ComponentGroupEntity> {
}
