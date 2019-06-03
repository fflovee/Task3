package com.jnshu.dao;

import com.jnshu.pojo.BannerManage;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BannerManageMapper {

    //根据主键id修改banner图状态
    int updateStatByPrimaryKey(@Param("bannerState") Byte state, @Param("id") Long id);

    //
    int selectStateCount(@Param("bannerState") Byte state);

    int deleteByPrimaryKey(Long id);

    int insert(@Param("production_url") String bannerurl, @Param("illustrating_picture") String bannerpic);

    List<BannerManage> selectBannerByCreateByAndState(BannerManage bannerManage);

    int insertSelective(BannerManage record);

    BannerManage selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(BannerManage record);

    int updateByPrimaryKey(BannerManage record);
}
