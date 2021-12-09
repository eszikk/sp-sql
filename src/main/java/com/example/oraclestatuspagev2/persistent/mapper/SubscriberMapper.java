package com.example.oraclestatuspagev2.persistent.mapper;

import com.example.oraclestatuspagev2.persistent.entity.SubscriberEntity;
import com.example.oraclestatuspagev2.web.dto.subscriber.SubscriberReducedDto;
import com.example.oraclestatuspagev2.web.dto.subscriber.SubscriberFullDto;
import org.mapstruct.Mapper;

@Mapper
public interface SubscriberMapper extends MapperBase<SubscriberReducedDto, SubscriberFullDto, SubscriberEntity> {

}
