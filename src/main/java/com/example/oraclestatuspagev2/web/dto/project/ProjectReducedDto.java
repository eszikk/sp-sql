package com.example.oraclestatuspagev2.web.dto.project;

import com.example.oraclestatuspagev2.web.dto.BaseDto;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper=false)
@SuperBuilder
@Data
public class ProjectReducedDto extends BaseDto {
    String name;
    String description;
}
