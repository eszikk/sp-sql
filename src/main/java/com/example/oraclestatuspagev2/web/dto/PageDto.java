package com.example.oraclestatuspagev2.web.dto;

import com.example.oraclestatuspagev2.persistent.entity.UserEntity;
import lombok.Builder;
import lombok.Value;

import java.util.Set;

@Builder
@Value
public class PageDto {
    private Long id;
    private String name;
    private String description;
    private String accessType;
    private String audience;
    private boolean published;
    private Set<UserEntity> users;
//    private Set<ComponentDto> components;
}
