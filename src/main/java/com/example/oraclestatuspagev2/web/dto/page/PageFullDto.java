package com.example.oraclestatuspagev2.web.dto.page;

import com.example.oraclestatuspagev2.web.dto.component.ComponentReducedDto;
import com.example.oraclestatuspagev2.web.dto.user.UserReducedDto;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

import java.util.Set;

@EqualsAndHashCode(callSuper=false)
@SuperBuilder
@Data
public class PageFullDto extends PageReducedDto {
    Set<UserReducedDto> users;
    Set<ComponentReducedDto> components;
}
