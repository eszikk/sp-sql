package com.example.oraclestatuspagev2.web.dto;

import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class IncidentDto {
    private Long id;
    private String name;
    private int status;
    private String message;
    private boolean visible;
}
