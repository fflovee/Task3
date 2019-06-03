package com.jnshu.pojo;

public class BannerManage {

    private Long id;

    private String productionUrl;

    private String illustratingPicture;

    private Byte bannerState;

    private Long createAt;

    private Long updateAt;

    private String createBy;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductionUrl() {
        return productionUrl;
    }

    public void setProductionUrl(String productionUrl) {
        this.productionUrl = productionUrl;
    }

    public String getIllustratingPicture() {
        return illustratingPicture;
    }

    public void setIllustratingPicture(String illustratingPicture) {
        this.illustratingPicture = illustratingPicture;
    }

    public Byte getBannerState() {
        return bannerState;
    }

    public void setBannerState(Byte bannerState) {
        this.bannerState = bannerState;
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

    @Override
    public String toString() {
        return "BannerManage{" +
                "id=" + id +
                ", productionUrl='" + productionUrl + '\'' +
                ", illustratingPicture='" + illustratingPicture + '\'' +
                ", bannerState=" + bannerState +
                ", createAt=" + createAt +
                ", updateAt=" + updateAt +
                ", createBy='" + createBy + '\'' +
                '}';
    }
}