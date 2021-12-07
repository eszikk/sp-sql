package com.example.oraclestatuspagev2.persistent.mapper;

import com.example.oraclestatuspagev2.persistent.entity.SubscriberEntity;
import com.example.oraclestatuspagev2.web.dto.SubscriberDto;
import org.mapstruct.Mapper;

@Mapper
public interface SubscriberMapper {
    SubscriberDto toDto(SubscriberEntity entity);

    SubscriberEntity toEntity(SubscriberDto dto);
}
