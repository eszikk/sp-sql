package com.example.oraclestatuspagev2.web.dto.scheduled_maintenance;

import lombok.EqualsAndHashCode;
import lombok.Value;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper=false)
@SuperBuilder
@Value
public class ScheduledMaintenanceFullDto extends ScheduledMaintenanceReducedDto {
}
