package com.example.oraclestatuspagev2.persistent.service;

import com.example.oraclestatuspagev2.web.dto.page_reposne.PageResponseDto;
import com.example.oraclestatuspagev2.web.dto.entitlement.EntitlementCreateDto;
import com.example.oraclestatuspagev2.web.dto.entitlement.EntitlementFullDto;
import com.example.oraclestatuspagev2.web.dto.entitlement.EntitlementReducedDto;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class EntitlementService implements CrudService<EntitlementFullDto,EntitlementReducedDto, EntitlementCreateDto>{


    @Override
    public PageResponseDto<EntitlementReducedDto> getAll(Pageable pageable) {
        return null;
    }

    @Override
    public EntitlementFullDto get(Long id) {
        return null;
    }

    @Override
    public EntitlementReducedDto create(EntitlementCreateDto entitlementCreateDto) {
        return null;
    }

    @Override
    public void update(Long id, EntitlementCreateDto entitlementCreateDto) {

    }

    @Override
    public void delete(Long id) {

    }
}
