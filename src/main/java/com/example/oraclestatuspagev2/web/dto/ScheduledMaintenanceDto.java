package com.example.oraclestatuspagev2.web.dto;

import lombok.Builder;
import lombok.Value;

import java.sql.Timestamp;

@Builder
@Value
public class ScheduledMaintenanceDto {
    private Long id;
    private String name;
    private int status;
    private String message;
    private Timestamp scheduledAt;
    private boolean visible;
}
