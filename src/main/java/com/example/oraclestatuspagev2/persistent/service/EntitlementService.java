package com.example.oraclestatuspagev2.persistent.service;

import com.example.oraclestatuspagev2.web.dto.EntitlementDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntitlementService implements CrudService<EntitlementDto>{
    @Override
    public List<EntitlementDto> getAll() {
        return null;
    }

    @Override
    public EntitlementDto get(Long id) {
        return null;
    }

    @Override
    public EntitlementDto create(EntitlementDto entitlementDto) {
        return null;
    }

    @Override
    public void update(Long id, EntitlementDto entitlementDto) {

    }

    @Override
    public void delete(Long id) {

    }
}
