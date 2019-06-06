package com.jnshu.service;

import com.jnshu.pojo.BannerManage;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BannerManageService {

    //添加banner图
    int addBanner(String bannerurl,String bannerpic);

    //修改banner图状态
    int updateBannerState(Byte state,Long id);

    //
    int selectBannerState(Byte state);

    int deleteBanner(Long id);

    List<BannerManage> selectBanner(BannerManage bannerManage);

    int updateByPrimaryKeySelective(BannerManage bannerManage);

}
