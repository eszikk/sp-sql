package com.example.oraclestatuspagev2.persistent.mapper;

import com.example.oraclestatuspagev2.persistent.entity.ScheduledMaintenanceEntity;
import com.example.oraclestatuspagev2.web.dto.scheduled_maintenance.ScheduledMaintenanceCreateDto;
import com.example.oraclestatuspagev2.web.dto.scheduled_maintenance.ScheduledMaintenanceFullDto;
import com.example.oraclestatuspagev2.web.dto.scheduled_maintenance.ScheduledMaintenanceReducedDto;
import org.mapstruct.Mapper;

@Mapper
public interface ScheduledMaintenanceMapper
        extends MapperBase<ScheduledMaintenanceReducedDto, ScheduledMaintenanceFullDto, ScheduledMaintenanceCreateDto, ScheduledMaintenanceEntity> {
}
