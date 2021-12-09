package com.example.oraclestatuspagev2.web.dto;

import lombok.Data;
import lombok.experimental.SuperBuilder;

import java.time.ZonedDateTime;

@SuperBuilder
@Data
public class BaseDto {
    Long id;
    ZonedDateTime createdAt;
    ZonedDateTime updatedAt;
}
