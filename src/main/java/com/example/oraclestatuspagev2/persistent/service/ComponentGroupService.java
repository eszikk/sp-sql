package com.example.oraclestatuspagev2.persistent.service;

import com.example.oraclestatuspagev2.web.dto.component_group.ComponentGroupCreateDto;
import com.example.oraclestatuspagev2.web.dto.component_group.ComponentGroupFullDto;
import com.example.oraclestatuspagev2.web.dto.component_group.ComponentGroupReducedDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComponentGroupService implements
        CrudService<ComponentGroupFullDto, ComponentGroupReducedDto, ComponentGroupCreateDto> {

    @Override
    public List<ComponentGroupReducedDto> getAll() {
        return null;
    }

    @Override
    public ComponentGroupFullDto get(Long id) {
        return null;
    }

    @Override
    public ComponentGroupReducedDto create(ComponentGroupCreateDto componentGroupCreateDto) {
        return null;
    }

    @Override
    public void update(Long id, ComponentGroupCreateDto componentGroupCreateDto) {

    }

    @Override
    public void delete(Long id) {

    }
}
