package com.sankuai.meituan.qz.waimai.domain;

public class WmOrder {
    private long id;
    private int type;
    private int status;
    private long customerId;
    private String addr = "";
    private String info = "";
    private String extendInfo = "";
    private double currentPrice;
    private double origPrice;
    private long ctime;

    public long getId() {
        return id;
    }

    public WmOrder setId(long id) {
        this.id = id;
        return this;
    }

    public int getType() {
        return type;
    }

    public WmOrder setType(int type) {
        this.type = type;
        return this;
    }

    public int getStatus() {
        return status;
    }

    public WmOrder setStatus(int status) {
        this.status = status;
        return this;
    }

    public long getCustomerId() {
        return customerId;
    }

    public WmOrder setCustomerId(long customerId) {
        this.customerId = customerId;
        return this;
    }

    public String getAddr() {
        return addr;
    }

    public WmOrder setAddr(String addr) {
        this.addr = addr;
        return this;
    }

    public String getInfo() {
        return info;
    }

    public WmOrder setInfo(String info) {
        this.info = info;
        return this;
    }

    public String getExtendInfo() {
        return extendInfo;
    }

    public WmOrder setExtendInfo(String extendInfo) {
        this.extendInfo = extendInfo;
        return this;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public WmOrder setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
        return this;
    }

    public double getOrigPrice() {
        return origPrice;
    }

    public WmOrder setOrigPrice(double origPrice) {
        this.origPrice = origPrice;
        return this;
    }

    public long getCtime() {
        return ctime;
    }

    public WmOrder setCtime(long ctime) {
        this.ctime = ctime;
        return this;
    }
}
