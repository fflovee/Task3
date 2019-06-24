package com.jnshu.service;

import com.jnshu.pojo.BannerManage;

import java.util.List;

public interface BannerManageService {

    //添加banner图
    int addBanner(BannerManage record);

    //修改banner图状态
    int updateBannerState(Byte state,Long id);

    //
    int selectBannerState(Byte state);

    boolean deleteBanner(Long id);

    List<BannerManage> selectBanner(BannerManage bannerManage);

    int updateByPrimaryKeySelective(BannerManage bannerManage);

}
