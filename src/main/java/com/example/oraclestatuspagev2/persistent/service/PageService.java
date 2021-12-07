package com.example.oraclestatuspagev2.persistent.service;

import com.example.oraclestatuspagev2.web.dto.PageDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PageService implements CrudService<PageDto>{
    @Override
    public List<PageDto> getAll() {
        return null;
    }

    @Override
    public PageDto get(Long id) {
        return null;
    }

    @Override
    public PageDto create(PageDto pageDto) {
        return null;
    }

    @Override
    public void update(Long id, PageDto pageDto) {

    }

    @Override
    public void delete(Long id) {

    }
}
