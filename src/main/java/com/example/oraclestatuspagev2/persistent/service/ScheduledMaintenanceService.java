package com.example.oraclestatuspagev2.persistent.service;

import com.example.oraclestatuspagev2.web.dto.page_reposne.PageResponseDto;
import com.example.oraclestatuspagev2.web.dto.scheduled_maintenance.ScheduledMaintenanceCreateDto;
import com.example.oraclestatuspagev2.web.dto.scheduled_maintenance.ScheduledMaintenanceFullDto;
import com.example.oraclestatuspagev2.web.dto.scheduled_maintenance.ScheduledMaintenanceReducedDto;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ScheduledMaintenanceService implements
        CrudService<ScheduledMaintenanceFullDto,ScheduledMaintenanceReducedDto, ScheduledMaintenanceCreateDto>{


    @Override
    public PageResponseDto<ScheduledMaintenanceReducedDto> getAll(Pageable pageable) {
        return null;
    }

    @Override
    public ScheduledMaintenanceFullDto get(Long id) {
        return null;
    }

    @Override
    public ScheduledMaintenanceReducedDto create(ScheduledMaintenanceCreateDto scheduledMaintenanceCreateDto) {
        return null;
    }

    @Override
    public void update(Long id, ScheduledMaintenanceCreateDto scheduledMaintenanceCreateDto) {

    }

    @Override
    public void delete(Long id) {

    }
}
