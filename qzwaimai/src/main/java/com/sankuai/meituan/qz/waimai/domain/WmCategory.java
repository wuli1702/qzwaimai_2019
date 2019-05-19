package com.sankuai.meituan.qz.waimai.domain;

public class WmCategory {
    private long id;
    private String name;
    private int type;
    private int sequence;
    private int displayStatus;
    private long ctime;
    private long utime;

    public long getId() {
        return id;
    }

    public WmCategory setId(long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public WmCategory setName(String name) {
        this.name = name;
        return this;
    }

    public int getType() {
        return type;
    }

    public WmCategory setType(int type) {
        this.type = type;
        return this;
    }

    public int getSequence() {
        return sequence;
    }

    public WmCategory setSequence(int sequence) {
        this.sequence = sequence;
        return this;
    }

    public int getDisplayStatus() {
        return displayStatus;
    }

    public WmCategory setDisplayStatus(int displayStatus) {
        this.displayStatus = displayStatus;
        return this;
    }

    public long getCtime() {
        return ctime;
    }

    public WmCategory setCtime(long ctime) {
        this.ctime = ctime;
        return this;
    }

    public long getUtime() {
        return utime;
    }

    public WmCategory setUtime(long utime) {
        this.utime = utime;
        return this;
    }
}
