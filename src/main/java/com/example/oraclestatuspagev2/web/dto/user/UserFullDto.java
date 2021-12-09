package com.example.oraclestatuspagev2.web.dto.user;

import com.example.oraclestatuspagev2.web.dto.entitlement.EntitlementReducedDto;
import com.example.oraclestatuspagev2.web.dto.page.PageReducedDto;
import lombok.EqualsAndHashCode;
import lombok.Value;
import lombok.experimental.SuperBuilder;

import java.util.Set;

@EqualsAndHashCode(callSuper=false)
@Value
@SuperBuilder
public class UserFullDto extends UserReducedDto {
    Set<EntitlementReducedDto> entitlements;
    Set<PageReducedDto> pages;
}
