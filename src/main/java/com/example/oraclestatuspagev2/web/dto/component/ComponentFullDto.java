package com.example.oraclestatuspagev2.web.dto.component;

import com.example.oraclestatuspagev2.web.dto.incident.IncidentReducedDto;
import com.example.oraclestatuspagev2.web.dto.scheduled_maintenance.ScheduledMaintenanceReducedDto;
import com.example.oraclestatuspagev2.web.dto.subscriber.SubscriberReducedDto;
import lombok.EqualsAndHashCode;
import lombok.Value;
import lombok.experimental.SuperBuilder;

import java.util.Set;

@EqualsAndHashCode(callSuper=false)
@SuperBuilder
@Value
public class ComponentFullDto extends ComponentReducedDto {
     Set<ScheduledMaintenanceReducedDto> scheduledMaintenances;
     Set<IncidentReducedDto> incidents;
     Set<SubscriberReducedDto> subscribers;
}
