package io.renren.modules.generator.dto;

public class BestCondition {
    /**
     * 客户标识
     */
    private String cid;
    /**
     * 类型
     */
    private String type;
    private Integer page;
    private Integer limit;

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }
}
