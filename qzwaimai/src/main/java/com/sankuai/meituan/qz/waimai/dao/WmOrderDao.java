package com.sankuai.meituan.qz.waimai.dao;

import com.sankuai.meituan.qz.waimai.domain.WmOrder;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WmOrderDao {
    List<WmOrder> pageQuery(@Param("offset") int offset, @Param("pageSize") int pageSize, @Param("customerId") long customerId);

    int count(@Param("customerId") long customerId);

    long insert(WmOrder wmOrder);

}
