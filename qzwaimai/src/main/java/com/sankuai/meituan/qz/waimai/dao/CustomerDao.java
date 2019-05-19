package com.sankuai.meituan.qz.waimai.dao;

import com.sankuai.meituan.qz.waimai.domain.Customer;
import org.apache.ibatis.annotations.Param;

public interface CustomerDao {
    long insert(Customer customer);

    Customer getCustomer(@Param("phone") String phone, @Param("code") String code);

    int updateCode(@Param("phone") String phone, @Param("newCode") String newCode);

}
