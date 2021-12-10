package com.example.oraclestatuspagev2.persistent.mapper;

import com.example.oraclestatuspagev2.persistent.entity.UserEntity;
import com.example.oraclestatuspagev2.web.dto.user.UserCreateDto;
import com.example.oraclestatuspagev2.web.dto.user.UserFullDto;
import com.example.oraclestatuspagev2.web.dto.user.UserReducedDto;
import org.mapstruct.Mapper;

@Mapper
public interface UserMapper extends MapperBase<UserReducedDto, UserFullDto, UserCreateDto, UserEntity> {

}
