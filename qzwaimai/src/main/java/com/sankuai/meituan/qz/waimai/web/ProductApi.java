package com.sankuai.meituan.qz.waimai.web;

import com.sankuai.meituan.qz.waimai.service.ProductService;
import com.sankuai.meituan.qz.waimai.util.ResponseUtil;
import com.sankuai.meituan.qz.waimai.vo.WmMenu;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/product")
public class ProductApi {
    private static final Logger LOGGER = LoggerFactory.getLogger(ProductApi.class);
    @Autowired
    private ProductService productService;

    @ResponseBody
    @RequestMapping(method = RequestMethod.GET)
    public Object getMenus() {
        WmMenu result;
        try {
            result = productService.getMenu();
        } catch (Exception e) {
            LOGGER.warn("ProductApi.getMenus error", e);
            return ResponseUtil.respErrOf("");
        }

        return ResponseUtil.respSuccessOf(result);
    }


}
