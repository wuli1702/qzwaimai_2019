package com.sankuai.meituan.qz.waimai.dao;

import com.sankuai.meituan.qz.waimai.domain.WmProduct;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WmProductDao {

    List<WmProduct> getAllProduct();
}
