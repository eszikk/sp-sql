package com.example.oraclestatuspagev2.persistent.mapper;

import com.example.oraclestatuspagev2.persistent.entity.PageEntity;
import com.example.oraclestatuspagev2.web.dto.page.PageCreateDto;
import com.example.oraclestatuspagev2.web.dto.page.PageFullDto;
import com.example.oraclestatuspagev2.web.dto.page.PageReducedDto;
import org.mapstruct.Mapper;

@Mapper
public interface PageMapper extends MapperBase<PageReducedDto, PageFullDto, PageCreateDto, PageEntity> {
}
