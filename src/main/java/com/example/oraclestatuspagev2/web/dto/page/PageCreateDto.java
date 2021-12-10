package com.example.oraclestatuspagev2.web.dto.page;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
public class PageCreateDto {

    @NotBlank
    @Size(min = 5, max = 50)
    String name;

    @Size(max = 255)
    String description;
}
