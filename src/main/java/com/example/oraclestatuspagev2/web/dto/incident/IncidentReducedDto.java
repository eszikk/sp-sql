package com.example.oraclestatuspagev2.web.dto.incident;

import com.example.oraclestatuspagev2.web.dto.BaseDto;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper=false)
@SuperBuilder
@Data
public class IncidentReducedDto extends BaseDto {
     String name;
     int status;
     String message;
     boolean visible;
}
