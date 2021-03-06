package com.example.oraclestatuspagev2.persistent.service;

import com.example.oraclestatuspagev2.web.dto.page_reposne.PageResponseDto;
import com.example.oraclestatuspagev2.web.dto.incident.IncidentCreateDto;
import com.example.oraclestatuspagev2.web.dto.incident.IncidentFullDto;
import com.example.oraclestatuspagev2.web.dto.incident.IncidentReducedDto;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class IncidentService implements CrudService<IncidentFullDto,IncidentReducedDto, IncidentCreateDto>{

    @Override
    public PageResponseDto<IncidentReducedDto> getAll(Pageable pageable) {
        return null;
    }

    @Override
    public IncidentFullDto get(Long id) {
        return null;
    }

    @Override
    public IncidentReducedDto create(IncidentCreateDto incidentCreateDto) {
        return null;
    }

    @Override
    public void update(Long id, IncidentCreateDto incidentCreateDto) {

    }

    @Override
    public void delete(Long id) {

    }
}
