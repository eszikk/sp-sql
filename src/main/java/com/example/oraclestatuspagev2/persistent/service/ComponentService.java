package com.example.oraclestatuspagev2.persistent.service;

import com.example.oraclestatuspagev2.web.dto.page_reposne.PageResponseDto;
import com.example.oraclestatuspagev2.web.dto.component.ComponentCreateDto;
import com.example.oraclestatuspagev2.web.dto.component.ComponentFullDto;
import com.example.oraclestatuspagev2.web.dto.component.ComponentReducedDto;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ComponentService  implements CrudService<ComponentFullDto,ComponentReducedDto, ComponentCreateDto>{

    @Override
    public PageResponseDto<ComponentReducedDto> getAll(Pageable pageable) {
        return null;
    }

    @Override
    public ComponentFullDto get(Long id) {
        return null;
    }

    @Override
    public ComponentReducedDto create(ComponentCreateDto componentCreateDto) {
        return null;
    }

    @Override
    public void update(Long id, ComponentCreateDto componentCreateDto) {

    }

    @Override
    public void delete(Long id) {

    }
}
