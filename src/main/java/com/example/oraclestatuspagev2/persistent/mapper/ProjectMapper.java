package com.example.oraclestatuspagev2.persistent.mapper;

import com.example.oraclestatuspagev2.persistent.entity.ProjectEntity;
import com.example.oraclestatuspagev2.web.dto.project.ProjectFullDto;
import com.example.oraclestatuspagev2.web.dto.project.ProjectReducedDto;
import org.mapstruct.Mapper;

@Mapper
public interface ProjectMapper extends MapperBase<ProjectReducedDto, ProjectFullDto, ProjectEntity> {
}
