package com.example.oraclestatuspagev2.persistent.service;

import com.example.oraclestatuspagev2.persistent.mapper.ProjectMapper;
import com.example.oraclestatuspagev2.persistent.repository.ProjectRepository;
import com.example.oraclestatuspagev2.web.dto.ProjectDto;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProjectService implements CrudService<ProjectDto> {

    private final ProjectRepository projectRepository;
    private final ProjectMapper projectMapper = Mappers.getMapper(ProjectMapper.class);

    public ProjectService(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
    @Override
    public List<ProjectDto> getAll() {
        return projectRepository.findAll().stream()
                .map(projectMapper::toDto).collect(Collectors.toList());
    }

    @Override
    public ProjectDto get(Long id) {
        return null;
    }

    @Override
    public ProjectDto create(ProjectDto projectDto) {
        return null;
    }

    @Override
    public void update(Long id, ProjectDto projectDto) {

    }

    @Override
    public void delete(Long id) {

    }
}
