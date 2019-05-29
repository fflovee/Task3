package com.jnshu.pojo;

public class StudioManage {
    private Long id;

    private String studioIntro;

    private String studioPicture;

    private String studioInfo;

    private Long createAt;

    private Long updateAt;

    @Override
    public String toString() {
        return "StudioManage{" +
                "id=" + id +
                ", studioIntro='" + studioIntro + '\'' +
                ", studioPicture='" + studioPicture + '\'' +
                ", studioInfo='" + studioInfo + '\'' +
                ", createAt=" + createAt +
                ", updateAt=" + updateAt +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStudioIntro() {
        return studioIntro;
    }

    public void setStudioIntro(String studioIntro) {
        this.studioIntro = studioIntro;
    }

    public String getStudioPicture() {
        return studioPicture;
    }

    public void setStudioPicture(String studioPicture) {
        this.studioPicture = studioPicture;
    }

    public String getStudioInfo() {
        return studioInfo;
    }

    public void setStudioInfo(String studioInfo) {
        this.studioInfo = studioInfo;
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
}