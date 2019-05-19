package com.sankuai.meituan.qz.waimai.service;

import com.sankuai.meituan.qz.waimai.dao.CustomerDao;
import com.sankuai.meituan.qz.waimai.domain.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InfoService {
    @Autowired
    private CustomerDao customerDao;

    public Customer signIn(String phone, String code) {
        return customerDao.getCustomer(phone, code);
    }

    public void signUp(Customer customer) {
        customerDao.insert(customer);
    }

    public void resetCode(String phone, String code) {
        customerDao.updateCode(phone, code);
    }
}
