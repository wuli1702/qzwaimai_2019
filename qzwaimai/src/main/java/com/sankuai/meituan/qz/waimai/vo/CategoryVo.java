package com.sankuai.meituan.qz.waimai.vo;

import com.google.common.collect.Lists;
import com.sankuai.meituan.qz.waimai.domain.WmCategory;
import org.springframework.util.CollectionUtils;

import java.util.Collections;
import java.util.List;

public class CategoryVo {
    private long id;
    private String name;
    private List<ProductVo> productVos;
    private int type;
    private int sequence;

    public static List<CategoryVo> trans(List<WmCategory> categories) {
        if (CollectionUtils.isEmpty(categories)) {
            return Collections.EMPTY_LIST;
        }
        List<CategoryVo> categoryVos = Lists.newArrayList();
        for (WmCategory category : categories) {
            categoryVos.add(trans(category));
        }
        return categoryVos;
    }

    public static CategoryVo trans(WmCategory category) {
        return new CategoryVo()
                .setId(category.getId())
                .setName(category.getName())
                .setProductVos(Lists.<ProductVo>newArrayList())
                .setType(category.getType())
                .setSequence(category.getSequence());
    }

    public long getId() {
        return id;
    }

    public CategoryVo setId(long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public CategoryVo setName(String name) {
        this.name = name;
        return this;
    }

    public List<ProductVo> getProductVos() {
        return productVos;
    }

    public CategoryVo setProductVos(List<ProductVo> productVos) {
        this.productVos = productVos;
        return this;
    }

    public int getType() {
        return type;
    }

    public CategoryVo setType(int type) {
        this.type = type;
        return this;
    }

    public int getSequence() {
        return sequence;
    }

    public CategoryVo setSequence(int sequence) {
        this.sequence = sequence;
        return this;
    }

}
