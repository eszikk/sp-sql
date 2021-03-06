package com.example.oraclestatuspagev2.persistent.service;

import com.example.oraclestatuspagev2.web.dto.page_reposne.PageResponseDto;
import com.example.oraclestatuspagev2.web.dto.user.UserCreateDto;
import com.example.oraclestatuspagev2.web.dto.user.UserFullDto;
import com.example.oraclestatuspagev2.web.dto.user.UserReducedDto;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class UserService implements CrudService<UserFullDto, UserReducedDto, UserCreateDto>{


    @Override
    public PageResponseDto<UserReducedDto> getAll(Pageable pageable) {
        return null;
    }

    @Override
    public UserFullDto get(Long id) {
        return null;
    }

    @Override
    public UserReducedDto create(UserCreateDto userCreateDto) {
        return null;
    }

    @Override
    public void update(Long id, UserCreateDto userCreateDto) {

    }

    @Override
    public void delete(Long id) {

    }
}
