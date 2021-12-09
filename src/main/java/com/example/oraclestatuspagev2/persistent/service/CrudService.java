package com.example.oraclestatuspagev2.persistent.service;

import com.example.oraclestatuspagev2.web.dto.page_reposne.PageResponseDto;
import org.springframework.data.domain.Pageable;

public interface CrudService<FullResponseDto, ReducedResponseDto, CreateRequestDto> {
    PageResponseDto<ReducedResponseDto> getAll(Pageable pageable);

    FullResponseDto get(final Long id);

    ReducedResponseDto create(final CreateRequestDto dto);

    void update(final Long id, final CreateRequestDto dto);

    void delete(final Long id);
}
