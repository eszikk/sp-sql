package com.example.oraclestatuspagev2.web.dto.subscriber;

import com.example.oraclestatuspagev2.web.dto.BaseDto;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper=false)
@SuperBuilder
@Data
public class SubscriberReducedDto extends BaseDto {
     String email;
     String verifyCode;
}
