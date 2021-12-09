package com.example.oraclestatuspagev2.persistent.service;

import java.util.List;

public interface CrudService<FullResponseDto, ReducedResponseDto, CreateRequestDto> {
    List<ReducedResponseDto> getAll();

    FullResponseDto get(final Long id);

    ReducedResponseDto create(final CreateRequestDto dto);

    void update(final Long id, final CreateRequestDto dto);

    void delete(final Long id);
}
