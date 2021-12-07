package com.example.oraclestatuspagev2.web.dto;

import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class ComponentGroupDto {
    private Long id;
    private String name;
    private int order;
    private boolean collapsed;
}
