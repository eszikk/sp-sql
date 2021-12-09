package com.example.oraclestatuspagev2.persistent.service;

import com.example.oraclestatuspagev2.logging.LogExecutionTime;
import com.example.oraclestatuspagev2.persistent.mapper.PageRequestMapper;
import com.example.oraclestatuspagev2.persistent.mapper.ProjectMapper;
import com.example.oraclestatuspagev2.persistent.repository.ProjectRepository;
import com.example.oraclestatuspagev2.web.dto.page_reposne.PageResponseDto;
import com.example.oraclestatuspagev2.web.dto.project.ProjectCreateDto;
import com.example.oraclestatuspagev2.web.dto.project.ProjectFullDto;
import com.example.oraclestatuspagev2.web.dto.project.ProjectReducedDto;
import com.example.oraclestatuspagev2.web.exception.NotFoundException;
import org.mapstruct.factory.Mappers;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProjectService implements CrudService<ProjectFullDto, ProjectReducedDto, ProjectCreateDto> {

    private final ProjectRepository projectRepository;
    private final ProjectMapper projectMapper = Mappers.getMapper(ProjectMapper.class);
    private final PageRequestMapper<ProjectReducedDto> pageRequestMapper;

    public ProjectService(ProjectRepository projectRepository, PageRequestMapper<ProjectReducedDto> pageRequestMapper) {
        this.projectRepository = projectRepository;
        this.pageRequestMapper = pageRequestMapper;
    }

    @LogExecutionTime
    @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
    @Override
    public PageResponseDto<ProjectReducedDto> getAll(Pageable pageable) {
        return pageRequestMapper.map(projectRepository.findAll(pageable).map(projectMapper::toReducedDto));
    }

    @LogExecutionTime
    @Transactional
    @Override
    public ProjectFullDto get(Long id) {
        var projectEntity = projectRepository.findById(id).orElseThrow(() -> new NotFoundException(String.format("Entity %s with the given id (%d) not found.", "Project", id)));
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
        projectRepository.deleteById(id);
    }


}
