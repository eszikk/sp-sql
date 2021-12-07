package com.example.oraclestatuspagev2.persistent.mapper;

import com.example.oraclestatuspagev2.persistent.entity.TagEntity;
import com.example.oraclestatuspagev2.web.dto.TagDto;
import org.mapstruct.Mapper;

@Mapper
public interface TagMapper {
    TagDto toDto(TagEntity entity);

    TagEntity toEntity(TagDto dto);
}
