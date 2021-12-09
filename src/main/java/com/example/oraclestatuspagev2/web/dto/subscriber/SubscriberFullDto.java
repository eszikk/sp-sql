package com.example.oraclestatuspagev2.web.dto.subscriber;

import lombok.EqualsAndHashCode;
import lombok.Value;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper=false)
@SuperBuilder
@Value
public class SubscriberFullDto extends SubscriberReducedDto {
}
