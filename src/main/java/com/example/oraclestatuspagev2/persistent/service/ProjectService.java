package com.example.oraclestatuspagev2.persistent.service;

import com.example.oraclestatuspagev2.logging.LogExecutionTime;
import com.example.oraclestatuspagev2.persistent.mapper.ProjectMapper;
import com.example.oraclestatuspagev2.persistent.repository.ProjectRepository;
import com.example.oraclestatuspagev2.web.dto.project.ProjectCreateDto;
import com.example.oraclestatuspagev2.web.dto.project.ProjectFullDto;
import com.example.oraclestatuspagev2.web.dto.project.ProjectReducedDto;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProjectService implements CrudService<ProjectFullDto,ProjectReducedDto, ProjectCreateDto> {

    private final ProjectRepository projectRepository;
    private final ProjectMapper projectMapper = Mappers.getMapper(ProjectMapper.class);

    public ProjectService(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    @LogExecutionTime
    @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
    @Override
    public List<ProjectReducedDto> getAll() {
        return projectRepository.findAll().stream()
                .map(projectMapper::toReducedDto).collect(Collectors.toList());
    }

    @LogExecutionTime
    @Transactional
    @Override
    public ProjectFullDto get(Long id) {
        var projectEntity = projectRepository.findById(id).orElseThrow(() -> new RuntimeException("Notfound"));
        System.out.println("size: " + projectEntity.getPages().size());
        return projectMapper.toFullDto(projectEntity);
    }

    @Override
    public ProjectReducedDto create(ProjectCreateDto projectCreateDto) {
        return null;
    }

    @Override
    public void update(Long id, ProjectCreateDto projectCreateDto) {

    }

    @Override
    public void delete(Long id) {

    }


}
