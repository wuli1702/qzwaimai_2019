package com.sankuai.meituan.qz.waimai.vo;

import java.util.List;

public class PagingQueryResult<T> {

    private Long totalCount;
    private Integer pageNum;
    private Integer pageSize;

    private List<T> content;

    public static <T> PagingQueryResult custom() {
        return new PagingQueryResult<T>();
    }

    public Long getTotalCount() {
        return totalCount;
    }

    public PagingQueryResult<T> setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public PagingQueryResult<T> setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public PagingQueryResult<T> setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public List<T> getContent() {
        return content;
    }

    public PagingQueryResult<T> setContent(List<T> content) {
        this.content = content;
        return this;
    }
}
