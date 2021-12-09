package com.example.oraclestatuspagev2.web.controller.api;

import com.example.oraclestatuspagev2.persistent.service.ProjectService;
import com.example.oraclestatuspagev2.web.dto.project.ProjectFullDto;
import com.example.oraclestatuspagev2.web.dto.project.ProjectReducedDto;
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
    public List<ProjectReducedDto> getAll() {
        return projectService.getAll();
    }

    @GetMapping(value = "/projects/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ProjectFullDto get(@PathVariable Long id) {
        return projectService.get(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(value = "/projects", produces = MediaType.APPLICATION_JSON_VALUE)
    public ProjectReducedDto create(@RequestBody ProjectReducedDto projectReducedDto) {
        return projectService.create(projectReducedDto);
    }
}
