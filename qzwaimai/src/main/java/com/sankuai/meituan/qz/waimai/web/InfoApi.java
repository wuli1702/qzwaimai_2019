package com.sankuai.meituan.qz.waimai.web;

import com.sankuai.meituan.qz.waimai.domain.Customer;
import com.sankuai.meituan.qz.waimai.service.InfoService;
import com.sankuai.meituan.qz.waimai.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/info")
public class InfoApi {
    @Autowired
    private InfoService infoService;

    @ResponseBody
    @RequestMapping(method = RequestMethod.POST, value = "/login")
    public Object signIn(@RequestParam("phone") String phone, @RequestParam("code") String code) {
        Customer customer;
        if ((customer = infoService.signIn(phone, code)) != null) {
            return ResponseUtil.respOf(400, "注册手机或密码错误", "");
        }
        return ResponseUtil.respSuccessOf(customer);
    }

    @ResponseBody
    @RequestMapping(method = RequestMethod.POST, value = "/join")
    public Object signUp(Customer customer) {
        infoService.signUp(customer);
        return ResponseUtil.respSuccessOf("");
    }

    public Object resetCode(@RequestParam String phone, @RequestParam String code) {
        infoService.resetCode(phone, code);
        return ResponseUtil.respSuccessOf("");
    }

}
