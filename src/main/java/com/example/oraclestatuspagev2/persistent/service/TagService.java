package com.example.oraclestatuspagev2.persistent.service;

import com.example.oraclestatuspagev2.web.dto.tag.TagCreateDto;
import com.example.oraclestatuspagev2.web.dto.tag.TagFullDto;
import com.example.oraclestatuspagev2.web.dto.tag.TagReducedDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TagService implements CrudService<TagFullDto,TagReducedDto, TagCreateDto>{

    @Override
    public List<TagReducedDto> getAll() {
        return null;
    }

    @Override
    public TagFullDto get(Long id) {
        return null;
    }

    @Override
    public TagReducedDto create(TagCreateDto tagCreateDto) {
        return null;
    }

    @Override
    public void update(Long id, TagCreateDto tagCreateDto) {

    }

    @Override
    public void delete(Long id) {

    }
}
