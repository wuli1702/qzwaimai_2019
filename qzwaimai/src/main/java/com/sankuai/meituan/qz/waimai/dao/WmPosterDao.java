package com.sankuai.meituan.qz.waimai.dao;

import com.sankuai.meituan.qz.waimai.domain.WmPoster;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WmPosterDao {
    List<WmPoster> getAllPosters();

    int count();

}
