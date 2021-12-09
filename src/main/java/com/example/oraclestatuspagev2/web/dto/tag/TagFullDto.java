package com.example.oraclestatuspagev2.web.dto.tag;

import lombok.EqualsAndHashCode;
import lombok.Value;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper=false)
@SuperBuilder
@Value
public class TagFullDto extends TagReducedDto {
}
