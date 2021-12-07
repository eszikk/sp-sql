package com.example.oraclestatuspagev2.persistent.service;

import com.example.oraclestatuspagev2.web.dto.UserDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements CrudService<UserDto>{
    @Override
    public List<UserDto> getAll() {
        return null;
    }

    @Override
    public UserDto get(Long id) {
        return null;
    }

    @Override
    public UserDto create(UserDto userDto) {
        return null;
    }

    @Override
    public void update(Long id, UserDto userDto) {

    }

    @Override
    public void delete(Long id) {

    }
}
