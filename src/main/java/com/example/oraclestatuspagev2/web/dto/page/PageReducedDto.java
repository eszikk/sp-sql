package com.example.oraclestatuspagev2.web.dto.page;

import com.example.oraclestatuspagev2.web.dto.BaseDto;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper=false)
@SuperBuilder
@Data
public class PageReducedDto extends BaseDto {
     String name;
     String description;
     String accessType;
     String audience;
     boolean published;
}
