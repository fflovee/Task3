package com.jnshu.dao;

import com.jnshu.pojo.BannerManage;
import org.springframework.stereotype.Repository;

@Repository
public interface BannerManageMapper {
    int deleteByPrimaryKey(Long id);

    int insert(BannerManage record);

    int insertSelective(BannerManage record);

    BannerManage selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(BannerManage record);

    int updateByPrimaryKey(BannerManage record);
}