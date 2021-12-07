package com.example.oraclestatuspagev2.web.dto;

import lombok.Builder;
import lombok.Value;

import java.time.ZonedDateTime;
import java.util.List;

@Builder
@Value
public class ProjectDto {
    private Long id;
    private String name;
    private String description;
    private List<PageDto> pages;
    private ZonedDateTime createdAt;
    private ZonedDateTime updatedAt;
}
