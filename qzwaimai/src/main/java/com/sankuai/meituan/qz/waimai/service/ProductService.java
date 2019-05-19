package com.sankuai.meituan.qz.waimai.service;

import com.sankuai.meituan.qz.waimai.dao.WmCategoryDao;
import com.sankuai.meituan.qz.waimai.dao.WmProductDao;
import com.sankuai.meituan.qz.waimai.domain.WmCategory;
import com.sankuai.meituan.qz.waimai.vo.WmMenu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private WmCategoryDao categoryDao;
    @Autowired
    private WmProductDao productDao;

    public WmMenu getMenu() {
        return WmMenu.custom(categoryDao.getAllCategories(),productDao.getAllProduct());
    }

}
