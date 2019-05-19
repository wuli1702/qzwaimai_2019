package com.sankuai.meituan.qz.waimai.domain;

public class WmPoster {
    private long id;
    private String name;
    private int sequence;
    private String coverPic;
    private String landingPic;
    private int displayStatus;
    private long ctime;
    private long utime;

    public long getId() {
        return id;
    }

    public WmPoster setId(long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public WmPoster setName(String name) {
        this.name = name;
        return this;
    }

    public int getSequence() {
        return sequence;
    }

    public WmPoster setSequence(int sequence) {
        this.sequence = sequence;
        return this;
    }

    public String getCoverPic() {
        return coverPic;
    }

    public WmPoster setCoverPic(String coverPic) {
        this.coverPic = coverPic;
        return this;
    }

    public String getLandingPic() {
        return landingPic;
    }

    public WmPoster setLandingPic(String landingPic) {
        this.landingPic = landingPic;
        return this;
    }

    public int getDisplayStatus() {
        return displayStatus;
    }

    public WmPoster setDisplayStatus(int displayStatus) {
        this.displayStatus = displayStatus;
        return this;
    }

    public long getCtime() {
        return ctime;
    }

    public WmPoster setCtime(long ctime) {
        this.ctime = ctime;
        return this;
    }

    public long getUtime() {
        return utime;
    }

    public WmPoster setUtime(long utime) {
        this.utime = utime;
        return this;
    }
}
