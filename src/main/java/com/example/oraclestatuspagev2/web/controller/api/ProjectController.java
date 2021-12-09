package com.example.oraclestatuspagev2.web.controller.api;

import com.example.oraclestatuspagev2.persistent.service.ProjectService;
import com.example.oraclestatuspagev2.web.dto.page_reposne.PageResponseDto;
import com.example.oraclestatuspagev2.web.dto.project.ProjectCreateDto;
import com.example.oraclestatuspagev2.web.dto.project.ProjectFullDto;
import com.example.oraclestatuspagev2.web.dto.project.ProjectReducedDto;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;

@RestController
public class ProjectController {

    private final ProjectService projectService;

    public ProjectController(final ProjectService projectService) {
        this.projectService = projectService;
    }

    @GetMapping(value = "/projects", produces = MediaType.APPLICATION_JSON_VALUE)
    public PageResponseDto<ProjectReducedDto> getAll(
            @RequestParam(value = "page", defaultValue = "0", required = false) int page,
            @RequestParam(value = "count", defaultValue = "25", required = false) @Max(value = 25) int size
    ) {
        var pageable = PageRequest.of(page, size);
        return projectService.getAll(pageable);
    }

    @GetMapping(value = "/projects/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ProjectFullDto get(@PathVariable @NotBlank Long id) {
        return projectService.get(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(value = "/projects", produces = MediaType.APPLICATION_JSON_VALUE)
    public ProjectReducedDto create(@RequestBody ProjectCreateDto projectCreateDto) {
        return projectService.create(projectCreateDto);
    }
}
