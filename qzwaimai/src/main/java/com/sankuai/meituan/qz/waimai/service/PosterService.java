package com.sankuai.meituan.qz.waimai.service;

import com.sankuai.meituan.qz.waimai.dao.WmPosterDao;
import com.sankuai.meituan.qz.waimai.domain.WmPoster;
import com.sankuai.meituan.qz.waimai.vo.PagingQueryResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PosterService {

    @Autowired
    private WmPosterDao posterDao;

    private static final int MAX_NUM = 5;

    public PagingQueryResult<WmPoster> getPosters() {
        return PagingQueryResult.custom()
                .setPageNum(0)
                .setPageSize(MAX_NUM)
                .setContent(posterDao.getAllPosters())
                .setTotalCount((long) posterDao.count());
    }

}
