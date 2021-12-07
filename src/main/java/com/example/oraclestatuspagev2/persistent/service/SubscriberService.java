package com.example.oraclestatuspagev2.persistent.service;

import com.example.oraclestatuspagev2.web.dto.SubscriberDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubscriberService implements CrudService<SubscriberDto>{
    @Override
    public List<SubscriberDto> getAll() {
        return null;
    }

    @Override
    public SubscriberDto get(Long id) {
        return null;
    }

    @Override
    public SubscriberDto create(SubscriberDto subscriberDto) {
        return null;
    }

    @Override
    public void update(Long id, SubscriberDto subscriberDto) {

    }

    @Override
    public void delete(Long id) {

    }
}
