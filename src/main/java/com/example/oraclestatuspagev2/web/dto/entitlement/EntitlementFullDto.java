package com.example.oraclestatuspagev2.web.dto.entitlement;

import com.example.oraclestatuspagev2.web.dto.BaseDto;
import com.example.oraclestatuspagev2.web.dto.user.UserReducedDto;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

import java.util.Set;

@EqualsAndHashCode(callSuper=false)
@SuperBuilder
@Data
public class EntitlementFullDto extends BaseDto {
    private Set<UserReducedDto> users;
}
