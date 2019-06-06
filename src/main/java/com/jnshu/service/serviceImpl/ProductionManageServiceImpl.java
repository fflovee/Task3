package com.jnshu.service.serviceImpl;

import com.jnshu.dao.ProductionManageMapper;
import com.jnshu.pojo.BannerManage;
import com.jnshu.pojo.ProductionManage;
import com.jnshu.service.ProductionManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductionManageServiceImpl implements ProductionManageService {

    @Autowired
    ProductionManageMapper productionManageMapper;

    @Override
    public List<ProductionManage> SelectProduction(ProductionManage productionManage) {
        return productionManageMapper.selectProduction(productionManage);
    }

    @Override
    public int selectAllProduction(ProductionManage productionManage) {
        return productionManageMapper.selectAllProduction(productionManage);
    }
}
