package com.example.oraclestatuspagev2.web.dto.incident;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper=false)
@SuperBuilder
@Data
public class IncidentFullDto extends IncidentReducedDto {
}
