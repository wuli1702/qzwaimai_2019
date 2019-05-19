package com.sankuai.meituan.qz.waimai.vo;

import com.google.common.base.Function;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.sankuai.meituan.qz.waimai.domain.WmCategory;
import com.sankuai.meituan.qz.waimai.domain.WmProduct;
import org.springframework.util.CollectionUtils;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class WmMenu {
    private List<CategoryVo> categoryVos;
    private int totalCount;

    public static WmMenu custom(List<WmCategory> categories, List<WmProduct> products) {
        WmMenu menu = new WmMenu();
        return menu.addCategories(categories)
                .addProduct(products);
    }

    private WmMenu addCategories(List<WmCategory> categories) {
        if (CollectionUtils.isEmpty(categories)) {
            return this.setCategoryVos(Collections.EMPTY_LIST);
        }

        return this.setCategoryVos(CategoryVo.trans(categories))
                .setTotalCount(categories.size());
    }

    private WmMenu addProduct(List<WmProduct> products) {
        if (CollectionUtils.isEmpty(products) || CollectionUtils.isEmpty(this.getCategoryVos())) {
            return this;
        }

        Map<Long, CategoryVo> categoryId = Maps.uniqueIndex(this.getCategoryVos(), new Function<CategoryVo, Long>() {
            public Long apply(CategoryVo input) {
                return input.getId();
            }
        });

        CategoryVo categoryVo;
        for (WmProduct product : products) {
            if ((categoryVo = categoryId.get(product.getCategoryId())) != null) {
                if (categoryVo.getProductVos() == null)
                    categoryVo.setProductVos(Lists.<ProductVo>newArrayList());

                categoryVo.getProductVos().add(ProductVo.trans(product));//todo check
            }
        }
        return this;
    }

    public List<CategoryVo> getCategoryVos() {
        return categoryVos;
    }

    public WmMenu setCategoryVos(List<CategoryVo> categoryVos) {
        this.categoryVos = categoryVos;
        return this;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public WmMenu setTotalCount(int totalCount) {
        this.totalCount = totalCount;
        return this;
    }
}
