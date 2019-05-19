package com.sankuai.meituan.qz.waimai.web;

import com.sankuai.meituan.qz.waimai.domain.WmOrder;
import com.sankuai.meituan.qz.waimai.service.WmOrderService;
import com.sankuai.meituan.qz.waimai.util.ResponseUtil;
import com.sankuai.meituan.qz.waimai.vo.PagingQueryResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/order")
public class WmOrderApi {

    private static final Logger LOGGER = LoggerFactory.getLogger(WmOrderApi.class);
    @Autowired
    private WmOrderService OrderService;

    @ResponseBody
    @RequestMapping(method = RequestMethod.GET )
    public Object getOrders(@RequestParam(required = false, defaultValue = "1") Integer pageNum,
                            @RequestParam(required = false, defaultValue = "20") Integer pageSize,
                            @RequestParam Long customerId) {
        PagingQueryResult<WmOrder> result;
        try {
            result = OrderService.pageQuery(pageNum, pageSize, customerId);
        } catch (Exception e) {
            LOGGER.warn("WmOrderApi.getOrders error, pageNum:{}, pageSize:{}, customerId:{}", pageNum, pageSize, customerId, e);
            return ResponseUtil.respErrOf("");
        }
        return ResponseUtil.respSuccessOf(result);
    }

    @ResponseBody
    @RequestMapping(method = RequestMethod.POST)
    public Object placeOrder(WmOrder wmOrder) {
        try {
            OrderService.placeOrder(wmOrder);
        } catch (Exception e) {
            LOGGER.warn("WmOrderApi.placeOrder error, wmOrder:{}", wmOrder, e);
            return ResponseUtil.respErrOf("");
        }
        return ResponseUtil.respSuccessOf("");
    }

}
