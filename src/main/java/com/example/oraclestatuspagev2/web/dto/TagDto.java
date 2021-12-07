package com.example.oraclestatuspagev2.web.dto;

import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class TagDto {
    private Long id;
    private String name;
    private String slug;
}
