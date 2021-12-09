package com.example.oraclestatuspagev2.persistent.service;

import com.example.oraclestatuspagev2.web.dto.page_reposne.PageResponseDto;
import com.example.oraclestatuspagev2.web.dto.subscriber.SubscriberCreateDto;
import com.example.oraclestatuspagev2.web.dto.subscriber.SubscriberFullDto;
import com.example.oraclestatuspagev2.web.dto.subscriber.SubscriberReducedDto;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class SubscriberService implements CrudService<SubscriberFullDto, SubscriberReducedDto, SubscriberCreateDto>{
    @Override
    public PageResponseDto<SubscriberReducedDto> getAll(Pageable pageable) {
        return null;
    }

    @Override
    public SubscriberFullDto get(Long id) {
        return null;
    }

    @Override
    public SubscriberReducedDto create(SubscriberCreateDto subscriberCreateDto) {
        return null;
    }

    @Override
    public void update(Long id, SubscriberCreateDto subscriberCreateDto) {

    }

    @Override
    public void delete(Long id) {

    }
}
