package com.example.oraclestatuspagev2.web.dto;

import com.example.oraclestatuspagev2.persistent.entity.UserEntity;
import lombok.Builder;
import lombok.Value;

import java.util.Set;

@Builder
@Value
public class EntitlementDto {
    private Long id;
    private String name;
    private Set<UserEntity> users;
}
