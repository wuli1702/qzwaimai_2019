package com.sankuai.meituan.qz.waimai.service;

import com.sankuai.meituan.qz.waimai.dao.WmOrderDao;
import com.sankuai.meituan.qz.waimai.domain.WmOrder;
import com.sankuai.meituan.qz.waimai.vo.PagingQueryResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WmOrderService {

    @Autowired
    private WmOrderDao wmOrderDao;

    public PagingQueryResult<WmOrder> pageQuery(int pageNum, int pageSize, long customerId) {

        return PagingQueryResult.custom()
                .setPageNum(pageNum)
                .setPageSize(pageSize)
                .setTotalCount((long) wmOrderDao.count(customerId))
                .setContent(wmOrderDao.pageQuery((pageNum - 1) * pageSize, pageSize, customerId));
    }

    public void placeOrder(WmOrder wmOrder){
        wmOrderDao.insert(wmOrder);
    }

}
