package com.sankuai.meituan.qz.waimai.domain;

public class Customer {
    private long id;
    private String name="";
    private String code;
    private String phone;
    private long ctime;
    private long utime;

    public long getId() {
        return id;
    }

    public Customer setId(long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Customer setName(String name) {
        this.name = name;
        return this;
    }

    public String getCode() {
        return code;
    }

    public Customer setCode(String code) {
        this.code = code;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public Customer setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public long getCtime() {
        return ctime;
    }

    public Customer setCtime(long ctime) {
        this.ctime = ctime;
        return this;
    }

    public long getUtime() {
        return utime;
    }

    public Customer setUtime(long utime) {
        this.utime = utime;
        return this;
    }
}
