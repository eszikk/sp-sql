package com.example.oraclestatuspagev2.persistent.service;

import com.example.oraclestatuspagev2.web.dto.ScheduledMaintenanceDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScheduledMaintenanceService implements CrudService<ScheduledMaintenanceDto>{
    @Override
    public List<ScheduledMaintenanceDto> getAll() {
        return null;
    }

    @Override
    public ScheduledMaintenanceDto get(Long id) {
        return null;
    }

    @Override
    public ScheduledMaintenanceDto create(ScheduledMaintenanceDto scheduledMaintenanceDto) {
        return null;
    }

    @Override
    public void update(Long id, ScheduledMaintenanceDto scheduledMaintenanceDto) {

    }

    @Override
    public void delete(Long id) {

    }
}
