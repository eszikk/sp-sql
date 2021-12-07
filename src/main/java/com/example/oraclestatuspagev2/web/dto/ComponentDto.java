package com.example.oraclestatuspagev2.web.dto;

import lombok.Builder;
import lombok.Value;

import java.util.Set;

@Builder
@Value
public class ComponentDto {
    private Long id;
    private String name;
    private String description;
    private int status;
    private Integer order;
    private boolean enabled;
//    private Set<ScheduledMaintenanceDto> scheduledMaintenances;
//    private Set<IncidentDto> incidents;
//    private Set<SubscriberDto> subscribers;
}
