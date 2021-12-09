package com.example.oraclestatuspagev2.web.dto.component;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;


@EqualsAndHashCode(callSuper=false)
@SuperBuilder
@Data
public class ComponentReducedDto {
     Long id;
     String name;
     String description;
     int status;
     Integer order;
     boolean enabled;
//    private Set<ScheduledMaintenanceDto> scheduledMaintenances;
//    private Set<IncidentDto> incidents;
//    private Set<SubscriberDto> subscribers;
}
