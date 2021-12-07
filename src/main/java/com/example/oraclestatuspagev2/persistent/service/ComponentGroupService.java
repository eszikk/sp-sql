package com.example.oraclestatuspagev2.persistent.service;

import com.example.oraclestatuspagev2.web.dto.ComponentGroupDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComponentGroupService implements CrudService<ComponentGroupDto>{
    @Override
    public List<ComponentGroupDto> getAll() {
        return null;
    }

    @Override
    public ComponentGroupDto get(Long id) {
        return null;
    }

    @Override
    public ComponentGroupDto create(ComponentGroupDto componentGroupDto) {
        return null;
    }

    @Override
    public void update(Long id, ComponentGroupDto componentGroupDto) {

    }

    @Override
    public void delete(Long id) {

    }
}
