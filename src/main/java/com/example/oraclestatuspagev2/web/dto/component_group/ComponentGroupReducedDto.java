package com.example.oraclestatuspagev2.web.dto.component_group;

import com.example.oraclestatuspagev2.web.dto.BaseDto;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper=false)
@SuperBuilder
@Data
public class ComponentGroupReducedDto extends BaseDto {
    String name;
    int order;
    boolean collapsed;
}
