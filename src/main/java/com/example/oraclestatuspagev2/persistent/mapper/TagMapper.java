package com.example.oraclestatuspagev2.persistent.mapper;

import com.example.oraclestatuspagev2.persistent.entity.TagEntity;
import com.example.oraclestatuspagev2.web.dto.tag.TagReducedDto;
import com.example.oraclestatuspagev2.web.dto.tag.TagFullDto;
import org.mapstruct.Mapper;

@Mapper
public interface TagMapper extends MapperBase<TagReducedDto, TagFullDto, TagEntity> {

}
