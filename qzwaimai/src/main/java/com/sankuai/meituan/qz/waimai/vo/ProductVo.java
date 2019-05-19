package com.sankuai.meituan.qz.waimai.vo;

import com.sankuai.meituan.qz.waimai.domain.WmProduct;

public class ProductVo {
    private long id;
    private String name;
    private int sequence;
    private String pic;
    private String desc;
    private double currentPrice;
    private double origPrice;

    public static ProductVo trans(WmProduct product) {
        return new ProductVo()
                .setId(product.getId())
                .setName(product.getName())
                .setSequence(product.getSequence())
                .setPic(product.getPic())
                .setDesc(product.getDesc())
                .setCurrentPrice(product.getCurrentPrice())
                .setOrigPrice(product.getOrigPrice());
    }

    public long getId() {
        return id;
    }

    public ProductVo setId(long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public ProductVo setName(String name) {
        this.name = name;
        return this;
    }

    public int getSequence() {
        return sequence;
    }

    public ProductVo setSequence(int sequence) {
        this.sequence = sequence;
        return this;
    }

    public String getPic() {
        return pic;
    }

    public ProductVo setPic(String pic) {
        this.pic = pic;
        return this;
    }

    public String getDesc() {
        return desc;
    }

    public ProductVo setDesc(String desc) {
        this.desc = desc;
        return this;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public ProductVo setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
        return this;
    }

    public double getOrigPrice() {
        return origPrice;
    }

    public ProductVo setOrigPrice(double origPrice) {
        this.origPrice = origPrice;
        return this;
    }

}
