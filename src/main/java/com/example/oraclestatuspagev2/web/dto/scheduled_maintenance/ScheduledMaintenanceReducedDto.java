package com.example.oraclestatuspagev2.web.dto.scheduled_maintenance;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

import java.sql.Timestamp;

@EqualsAndHashCode(callSuper=false)
@SuperBuilder
@Data
public class ScheduledMaintenanceReducedDto {
    String name;
    int status;
    String message;
    Timestamp scheduledAt;
    boolean visible;
}
