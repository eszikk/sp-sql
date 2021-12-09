package com.example.oraclestatuspagev2.persistent.service;

import com.example.oraclestatuspagev2.web.dto.page.PageCreateDto;
import com.example.oraclestatuspagev2.web.dto.page.PageFullDto;
import com.example.oraclestatuspagev2.web.dto.page.PageReducedDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PageService implements CrudService<PageFullDto,PageReducedDto, PageCreateDto>{
    @Override
    public List<PageReducedDto> getAll() {
        return null;
    }

    @Override
    public PageFullDto get(Long id) {
        return null;
    }

    @Override
    public PageReducedDto create(PageCreateDto pageCreateDto) {
        return null;
    }

    @Override
    public void update(Long id, PageCreateDto pageCreateDto) {

    }

    @Override
    public void delete(Long id) {

    }
}
