package com.example.oraclestatuspagev2.persistent.mapper;

import com.example.oraclestatuspagev2.persistent.entity.EntitlementEntity;
import com.example.oraclestatuspagev2.web.dto.EntitlementDto;
import org.mapstruct.Mapper;

@Mapper
public interface EntitlementMapper {
    EntitlementDto toDto(EntitlementEntity entity);

    EntitlementEntity toEntity(EntitlementDto dto);
}
