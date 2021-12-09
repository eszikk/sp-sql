package com.example.oraclestatuspagev2.web.dto.user;

import com.example.oraclestatuspagev2.web.dto.BaseDto;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = false)
@SuperBuilder
@Data
public class UserReducedDto extends BaseDto {
    String username;
    String password;
    String rememberToken;
    String email;
    String apiKey;
    Boolean active;
}
