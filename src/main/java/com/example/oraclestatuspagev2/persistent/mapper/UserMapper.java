package com.example.oraclestatuspagev2.persistent.mapper;

import com.example.oraclestatuspagev2.persistent.entity.UserEntity;
import com.example.oraclestatuspagev2.web.dto.UserDto;
import org.mapstruct.Mapper;

@Mapper
public interface UserMapper {
    UserDto toDto(UserEntity entity);

    UserEntity toEntity(UserDto dto);
}
