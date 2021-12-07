package com.example.oraclestatuspagev2.web.controller.api;

import com.example.oraclestatuspagev2.persistent.service.ProjectService;
import com.example.oraclestatuspagev2.web.dto.ProjectDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProjectController {

    private final ProjectService projectService;

    public ProjectController(final ProjectService projectService) {
        this.projectService = projectService;
    }

    @GetMapping(value = "/projects", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<ProjectDto> getAll() {
        return projectService.getAll();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(value = "/projects", produces = MediaType.APPLICATION_JSON_VALUE)
    public ProjectDto create(@RequestBody ProjectDto projectDto) {
        return projectService.create(projectDto);
    }
}
