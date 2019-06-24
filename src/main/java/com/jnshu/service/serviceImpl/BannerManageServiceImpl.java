package com.jnshu.service.serviceImpl;

import com.jnshu.controller.BusinessException;
import com.jnshu.dao.BannerManageMapper;
import com.jnshu.pojo.BannerManage;
import com.jnshu.service.BannerManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BannerManageServiceImpl implements BannerManageService {

    @Autowired
    private BannerManageMapper bannerManageMapper;

    @Override
    public int addBanner(BannerManage record) {
        if (record.getProductionUrl() == null || record.getProductionUrl().equals("")) {
            throw new BusinessException("作品rul不能为空");
        }
        if (record.getIllustratingPicture() == null || record.getIllustratingPicture().equals("")) {
            throw new BusinessException("banner不能为空");
        }
        return bannerManageMapper.insertSelective(record);
    }

    @Override
    public int updateBannerState(Byte state,Long id) {
        return bannerManageMapper.updateStatByPrimaryKey(state,id);
    }

    @Override
    public int selectBannerState(Byte state) {
        return bannerManageMapper.selectStateCount(state);
    }

    @Override
    public boolean deleteBanner(Long id) {
        return bannerManageMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<BannerManage> selectBanner(BannerManage bannerManage) {
        return bannerManageMapper.selectBannerByCreateByAndState(bannerManage);
    }

    @Override
    public int updateByPrimaryKeySelective(BannerManage bannerManage) {
        System.out.println(bannerManage);
        return bannerManageMapper.updateByPrimaryKeySelective(bannerManage);
    }

}
