package com.example.oraclestatuspagev2.persistent.mapper;

import com.example.oraclestatuspagev2.web.dto.page_reposne.PageDto;
import com.example.oraclestatuspagev2.web.dto.page_reposne.PageResponseDto;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

@Component
public class PageRequestMapper<T> {

    public PageResponseDto<T> map(Page<T> page) {
        return PageResponseDto.<T>builder().page(
                PageDto.builder()
                        .itemsPerPage(page.getSize())
                        .pageOffset(page.getNumber())
                        .currentPageSize(page.getNumberOfElements())
                        .totalPageSize(page.getTotalPages())
                        .build()
        ).content(page.getContent()).build();
    }
}
