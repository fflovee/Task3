package com.jnshu.pojo;

public class LeaveWords {
    private Long id;

    private Long leavewordsId;

    private String productionName;

    private String leavewords;

    private Byte leavewordsStat;

    private String touristsNickname;

    private Long createAt;

    private Long updateAt;

    private String createBy;

    private String leavewordsReply;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getLeavewordsId() {
        return leavewordsId;
    }

    public void setLeavewordsId(Long leavewordsId) {
        this.leavewordsId = leavewordsId;
    }

    public String getProductionName() {
        return productionName;
    }

    public void setProductionName(String productionName) {
        this.productionName = productionName;
    }

    public String getLeavewords() {
        return leavewords;
    }

    public void setLeavewords(String leavewords) {
        this.leavewords = leavewords;
    }

    public Byte getLeavewordsStat() {
        return leavewordsStat;
    }

    public void setLeavewordsStat(Byte leavewordsStat) {
        this.leavewordsStat = leavewordsStat;
    }

    public String getTouristsNickname() {
        return touristsNickname;
    }

    public void setTouristsNickname(String touristsNickname) {
        this.touristsNickname = touristsNickname;
    }

    public Long getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Long createAt) {
        this.createAt = createAt;
    }

    public Long getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Long updateAt) {
        this.updateAt = updateAt;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getLeavewordsReply() {
        return leavewordsReply;
    }

    public void setLeavewordsReply(String leavewordsReply) {
        this.leavewordsReply = leavewordsReply;
    }

    @Override
    public String toString() {
        return "LeaveWords{" +
                "id=" + id +
                ", leavewordsId=" + leavewordsId +
                ", productionName='" + productionName + '\'' +
                ", leavewords='" + leavewords + '\'' +
                ", leavewordsStat=" + leavewordsStat +
                ", touristsNickname='" + touristsNickname + '\'' +
                ", createAt=" + createAt +
                ", updateAt=" + updateAt +
                ", createBy='" + createBy + '\'' +
                ", leavewordsReply='" + leavewordsReply + '\'' +
                '}';
    }
}