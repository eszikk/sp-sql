package com.example.oraclestatuspagev2.web.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ErrorDto {
    String timestamp;
    Integer status;
    String error;
    String path;
    String method;
}
