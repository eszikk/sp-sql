package com.example.oraclestatuspagev2.persistent.service;

import java.util.List;

public interface CrudService<DTO> {
    List<DTO> getAll();

    DTO get(final Long id);

    DTO create(final DTO dto);

    void update(final Long id, final DTO dto);

    void delete(final Long id);
}
