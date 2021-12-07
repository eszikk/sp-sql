package com.example.oraclestatuspagev2.persistent.mapper;

import com.example.oraclestatuspagev2.persistent.entity.ProjectEntity;
import com.example.oraclestatuspagev2.web.dto.ProjectDto;
import org.mapstruct.Mapper;

@Mapper
public interface ProjectMapper {
    ProjectDto toDto(ProjectEntity entity);

    ProjectEntity toEntity(ProjectDto dto);
}
