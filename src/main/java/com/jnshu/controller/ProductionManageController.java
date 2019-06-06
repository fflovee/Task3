package com.jnshu.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jnshu.pojo.ProductionManage;
import com.jnshu.pojo.Result;
import com.jnshu.service.ProductionManageService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductionManageController {

    private static Logger log = LogManager.getLogger(ProductionManageController.class);

    @Autowired
    private ProductionManageService productionManageService;

    @RequestMapping(value = "/production", method = RequestMethod.GET)
    public Result selectProduction(@RequestParam(value = "state", required = false) byte state,
                                   @RequestParam(value = "production", required = false) String production,
                                   @RequestParam(value = "page", required = false, defaultValue = "1") int page,
                                   @RequestParam(value = "count", required = false, defaultValue = "10") int count) {
        ProductionManage productionManage = new ProductionManage();
        productionManage.setProductionState(state);
        log.info("查询条件为" + state + "的作品集");
        productionManage.setProductionName(production);
        log.info("查询名称为" + production + "的作品集");
        PageHelper.startPage(page, count);
        List<ProductionManage> productionManageList = productionManageService.SelectProduction(productionManage);
        PageInfo<ProductionManage> productionManagePageInfo = new PageInfo<>(productionManageList);
        return new Result(1, "查询出所有的作品集", productionManagePageInfo);
    }

    @RequestMapping(value = "/production/{id}", method = RequestMethod.DELETE)
    public Result deleteProductionById(@PathVariable("id") Long id) {

        return null;
    }
}
