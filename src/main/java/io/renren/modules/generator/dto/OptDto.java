package io.renren.modules.generator.dto;

public class OptDto {
    private String jId;
    private String cId;
    private Double heat;
    private int love;
    private int hate;
    private int repost;

    public String getjId() {
        return jId;
    }

    public void setjId(String jId) {
        this.jId = jId;
    }

    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId;
    }

    public Double getHeat() {
        return heat;
    }

    public void setHeat(Double heat) {
        this.heat = heat;
    }

    public int getLove() {
        return love;
    }

    public void setLove(int love) {
        this.love = love;
    }

    public int getHate() {
        return hate;
    }

    public void setHate(int hate) {
        this.hate = hate;
    }

    public int getRepost() {
        return repost;
    }

    public void setRepost(int repost) {
        this.repost = repost;
    }
}
