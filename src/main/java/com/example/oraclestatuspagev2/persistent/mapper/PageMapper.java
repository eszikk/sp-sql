package com.example.oraclestatuspagev2.persistent.mapper;

import com.example.oraclestatuspagev2.persistent.entity.PageEntity;
import com.example.oraclestatuspagev2.web.dto.PageDto;
import org.mapstruct.Mapper;

@Mapper
public interface PageMapper {
    PageDto toDto(PageEntity entity);

    PageEntity toEntity(PageDto dto);
}
