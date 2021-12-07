package com.example.oraclestatuspagev2.web.dto;

import lombok.Builder;
import lombok.Value;

import java.util.Set;

@Value
@Builder
public class UserDto {
    private Long id;
    private String username;
    private String password;
    private String rememberToken;
    private String email;
    private String apiKey;
    private boolean active;
    private Set<EntitlementDto> entitlements;
    private Set<PageDto> pages;
}
