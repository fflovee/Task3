package com.jnshu.pojo;

public class ProductionCollection {
    private Long id;

    private String collectionName;

    private Byte collectionState;

    private Long createAt;

    private Long updateAt;

    private String createBy;

    private String updateBt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCollectionName() {
        return collectionName;
    }

    public void setCollectionName(String collectionName) {
        this.collectionName = collectionName;
    }

    public Byte getCollectionState() {
        return collectionState;
    }

    public void setCollectionState(Byte collectionState) {
        this.collectionState = collectionState;
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

    public String getUpdateBt() {
        return updateBt;
    }

    public void setUpdateBt(String updateBt) {
        this.updateBt = updateBt;
    }
}