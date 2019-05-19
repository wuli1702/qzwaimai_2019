package com.sankuai.meituan.qz.waimai.domain;

public class WmProduct {
    private long id;
    private long categoryId;
    private String categoryName;
    private String name;
    private int sequence;
    private String pic;
    private String desc;
    private double currentPrice;
    private double origPrice;
    private int displayStatus;
    private long ctime;
    private long utime;

    public long getId() {
        return id;
    }

    public WmProduct setId(long id) {
        this.id = id;
        return this;
    }

    public long getCategoryId() {
        return categoryId;
    }

    public WmProduct setCategoryId(long categoryId) {
        this.categoryId = categoryId;
        return this;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public WmProduct setCategoryName(String categoryName) {
        this.categoryName = categoryName;
        return this;
    }

    public String getName() {
        return name;
    }

    public WmProduct setName(String name) {
        this.name = name;
        return this;
    }

    public int getSequence() {
        return sequence;
    }

    public WmProduct setSequence(int sequence) {
        this.sequence = sequence;
        return this;
    }

    public String getPic() {
        return pic;
    }

    public WmProduct setPic(String pic) {
        this.pic = pic;
        return this;
    }

    public String getDesc() {
        return desc;
    }

    public WmProduct setDesc(String desc) {
        this.desc = desc;
        return this;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public WmProduct setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
        return this;
    }

    public double getOrigPrice() {
        return origPrice;
    }

    public WmProduct setOrigPrice(double origPrice) {
        this.origPrice = origPrice;
        return this;
    }

    public int getDisplayStatus() {
        return displayStatus;
    }

    public WmProduct setDisplayStatus(int displayStatus) {
        this.displayStatus = displayStatus;
        return this;
    }

    public long getCtime() {
        return ctime;
    }

    public WmProduct setCtime(long ctime) {
        this.ctime = ctime;
        return this;
    }

    public long getUtime() {
        return utime;
    }

    public WmProduct setUtime(long utime) {
        this.utime = utime;
        return this;
    }
}
