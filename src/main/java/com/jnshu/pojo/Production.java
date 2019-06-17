package com.jnshu.pojo;

public class Production {
    private Long id;

    private Long fid;

    private String productionName;

    private String productionIntro;

    private String thumbnaUrl;

    private String videoUrl;

    private String infopictureUrl;

    private String productionInfo;

    private Byte productionState;

    private Long createAt;

    private Long updateAt;

    private String createBy;

    private String updateBy;

    @Override
    public String toString() {
        return "Production{" +
                "id=" + id +
                ", fid=" + fid +
                ", productionName='" + productionName + '\'' +
                ", productionIntro='" + productionIntro + '\'' +
                ", thumbnaUrl='" + thumbnaUrl + '\'' +
                ", videoUrl='" + videoUrl + '\'' +
                ", infopictureUrl='" + infopictureUrl + '\'' +
                ", productionInfo='" + productionInfo + '\'' +
                ", productionState=" + productionState +
                ", createAt=" + createAt +
                ", updateAt=" + updateAt +
                ", createBy='" + createBy + '\'' +
                ", updateBy='" + updateBy + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getFid() {
        return fid;
    }

    public void setFid(Long fid) {
        this.fid = fid;
    }

    public String getProductionName() {
        return productionName;
    }

    public void setProductionName(String productionName) {
        this.productionName = productionName;
    }

    public String getProductionIntro() {
        return productionIntro;
    }

    public void setProductionIntro(String productionIntro) {
        this.productionIntro = productionIntro;
    }

    public String getThumbnaUrl() {
        return thumbnaUrl;
    }

    public void setThumbnaUrl(String thumbnaUrl) {
        this.thumbnaUrl = thumbnaUrl;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public String getInfopictureUrl() {
        return infopictureUrl;
    }

    public void setInfopictureUrl(String infopictureUrl) {
        this.infopictureUrl = infopictureUrl;
    }

    public String getProductionInfo() {
        return productionInfo;
    }

    public void setProductionInfo(String productionInfo) {
        this.productionInfo = productionInfo;
    }

    public Byte getProductionState() {
        return productionState;
    }

    public void setProductionState(Byte productionState) {
        this.productionState = productionState;
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

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }
}