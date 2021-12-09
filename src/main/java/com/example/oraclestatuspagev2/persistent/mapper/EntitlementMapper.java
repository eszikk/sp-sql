package com.example.oraclestatuspagev2.persistent.mapper;

import com.example.oraclestatuspagev2.persistent.entity.EntitlementEntity;
import com.example.oraclestatuspagev2.web.dto.entitlement.EntitlementReducedDto;
import com.example.oraclestatuspagev2.web.dto.entitlement.EntitlementFullDto;
import org.mapstruct.Mapper;

@Mapper
public interface EntitlementMapper  extends MapperBase<EntitlementReducedDto, EntitlementFullDto, EntitlementEntity> {
}
