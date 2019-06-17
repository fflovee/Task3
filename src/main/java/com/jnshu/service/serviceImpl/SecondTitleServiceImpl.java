package com.jnshu.service.serviceImpl;

import com.jnshu.dao.SecondTitleMapper;
import com.jnshu.pojo.SecondTitle;
import com.jnshu.service.SecondTitleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SecondTitleServiceImpl implements SecondTitleService {

    @Autowired
    private SecondTitleMapper secondTitleMapper;

    @Override
    public int selectCollectionAndSecondTitle(Long fid) {
        byte state=1;
        return secondTitleMapper.selectCollectionAndSecondTitle(fid,state);
    }

    @Override
    public int selectCountSecondTitle(Long fid) {
        return secondTitleMapper.selectCountByFid(fid);
    }

    @Override
    public int insertSecondTitle(SecondTitle secondTitle) {
        return secondTitleMapper.insertSelective(secondTitle);
    }
}
