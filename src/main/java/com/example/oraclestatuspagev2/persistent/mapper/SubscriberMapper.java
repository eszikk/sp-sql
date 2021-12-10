package com.example.oraclestatuspagev2.persistent.mapper;

import com.example.oraclestatuspagev2.persistent.entity.SubscriberEntity;
import com.example.oraclestatuspagev2.web.dto.subscriber.SubscriberCreateDto;
import com.example.oraclestatuspagev2.web.dto.subscriber.SubscriberFullDto;
import com.example.oraclestatuspagev2.web.dto.subscriber.SubscriberReducedDto;
import org.mapstruct.Mapper;

@Mapper
public interface SubscriberMapper extends MapperBase<SubscriberReducedDto, SubscriberFullDto, SubscriberCreateDto, SubscriberEntity> {

}
