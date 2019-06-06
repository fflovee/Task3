package com.jnshu.service;

import com.jnshu.pojo.ProductionManage;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductionManageService {

    List<ProductionManage> SelectProduction(ProductionManage productionManage);

    int selectAllProduction(ProductionManage productionManage);




}
