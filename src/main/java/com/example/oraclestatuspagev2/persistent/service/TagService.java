package com.example.oraclestatuspagev2.persistent.service;

import com.example.oraclestatuspagev2.web.dto.TagDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TagService implements CrudService<TagDto>{
    @Override
    public List<TagDto> getAll() {
        return null;
    }

    @Override
    public TagDto get(Long id) {
        return null;
    }

    @Override
    public TagDto create(TagDto tagDto) {
        return null;
    }

    @Override
    public void update(Long id, TagDto tagDto) {

    }

    @Override
    public void delete(Long id) {

    }
}
