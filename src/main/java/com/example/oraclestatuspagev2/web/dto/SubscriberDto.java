package com.example.oraclestatuspagev2.web.dto;

import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class SubscriberDto {
    private Long id;
    private String email;
    private String verifyCode;
}
