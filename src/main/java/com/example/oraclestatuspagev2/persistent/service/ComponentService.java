package com.example.oraclestatuspagev2.persistent.service;

import com.example.oraclestatuspagev2.web.dto.ComponentDto;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ComponentService  implements CrudService<ComponentDto>{
    @Override
    public List<ComponentDto> getAll() {
        return null;
    }

    @Override
    public ComponentDto get(Long id) {
        return null;
    }

    @Override
    public ComponentDto create(ComponentDto componentDto) {
        return null;
    }

    @Override
    public void update(Long id, ComponentDto componentDto) {

    }

    @Override
    public void delete(Long id) {

    }
}
