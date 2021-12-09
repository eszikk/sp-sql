package com.example.oraclestatuspagev2.web.dto.project;

import com.example.oraclestatuspagev2.web.dto.page.PageReducedDto;
import lombok.EqualsAndHashCode;
import lombok.Value;
import lombok.experimental.SuperBuilder;

import java.util.Set;

@EqualsAndHashCode(callSuper=false)
@SuperBuilder
@Value
public class ProjectFullDto extends ProjectReducedDto {
     Set<PageReducedDto> pages;
}
