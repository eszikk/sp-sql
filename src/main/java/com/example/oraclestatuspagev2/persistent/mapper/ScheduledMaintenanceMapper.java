package com.example.oraclestatuspagev2.persistent.mapper;

import com.example.oraclestatuspagev2.persistent.entity.ScheduledMaintenanceEntity;
import com.example.oraclestatuspagev2.web.dto.ScheduledMaintenanceDto;
import org.mapstruct.Mapper;

@Mapper
public interface ScheduledMaintenanceMapper {
    ScheduledMaintenanceDto toDto(ScheduledMaintenanceEntity entity);

    ScheduledMaintenanceEntity toEntity(ScheduledMaintenanceDto dto);
}
