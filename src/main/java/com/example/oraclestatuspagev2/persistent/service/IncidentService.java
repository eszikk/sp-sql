package com.example.oraclestatuspagev2.persistent.service;

import com.example.oraclestatuspagev2.web.dto.IncidentDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IncidentService implements CrudService<IncidentDto>{
    @Override
    public List<IncidentDto> getAll() {
        return null;
    }

    @Override
    public IncidentDto get(Long id) {
        return null;
    }

    @Override
    public IncidentDto create(IncidentDto incidentDto) {
        return null;
    }

    @Override
    public void update(Long id, IncidentDto incidentDto) {

    }

    @Override
    public void delete(Long id) {

    }
}
