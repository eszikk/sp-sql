package com.example.oraclestatuspagev2.persistent.service;

import com.example.oraclestatuspagev2.web.dto.page_reposne.PageResponseDto;
import com.example.oraclestatuspagev2.web.dto.tag.TagCreateDto;
import com.example.oraclestatuspagev2.web.dto.tag.TagFullDto;
import com.example.oraclestatuspagev2.web.dto.tag.TagReducedDto;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class TagService implements CrudService<TagFullDto,TagReducedDto, TagCreateDto>{


    @Override
    public PageResponseDto<TagReducedDto> getAll(Pageable pageable) {
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
