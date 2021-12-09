package com.example.oraclestatuspagev2.web.dto.page_reposne;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public
class PageDto {
    int itemsPerPage;
    int pageOffset;
    int currentPageSize;
    int totalPageSize;
}
