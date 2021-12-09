package com.example.oraclestatuspagev2.web.dto.page_reposne;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class PageResponseDto<T> {
    List<T> content;
    PageDto page;
}




