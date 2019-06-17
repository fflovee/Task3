package com.jnshu.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jnshu.pojo.ProductionCollection;
import com.jnshu.pojo.Result;
import com.jnshu.service.ProductionCollectionService;
import com.jnshu.service.SecondTitleService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductionCollectionController {

    private static Logger log = LogManager.getLogger(ProductionCollectionController.class);

    @Autowired
    private ProductionCollectionService productionCollectionService;
    @Autowired
    private SecondTitleService secondTitleService;

    // 查询作品集
    @RequestMapping(value = "/collection", method = RequestMethod.GET)
    public Result<PageInfo<ProductionCollection>> selectProductionCollection(@RequestParam(value = "state", required = false) Byte state,
                                                                             @RequestParam(value = "collection", required = false) String collection,
                                                                             @RequestParam(value = "page", required = false, defaultValue = "1") int page,
                                                                             @RequestParam(value = "count", required = false, defaultValue = "5") int count) throws RuntimeException {
        ProductionCollection productionCollection = new ProductionCollection();
        productionCollection.setCollectionName(collection);
        productionCollection.setCollectionState(state);
        log.info("查询条件" + productionCollection);
        PageHelper.startPage(page, count);
        List<ProductionCollection> productionCollectionList = productionCollectionService.selectProductionCollection(productionCollection);
        PageInfo<ProductionCollection> productionCollectionPageInfo = new PageInfo<>(productionCollectionList);
        return new Result<>(1, "查询所有作品集", productionCollectionPageInfo);
    }

    // 查询是否有上架的二级标题，如果没有可以删除作品集
    @RequestMapping(value = "/collection/{id}", method = RequestMethod.DELETE)
    public Result deleteProductionCollection(@PathVariable("id") Long id) {
        int a = secondTitleService.selectCountSecondTitle(id);
        log.info("============作品集id:" + id + "下共有" + a + "条的二级标题============");
        if (a == 0) {
            int i = productionCollectionService.deleteByPrimaryKey(id);
            log.info("--------------------删除的作品集id为" + id + "--------------------");
            if (i > 0) {
                return new Result(1, "删除作品集成功");
            }
            return new Result(-1, "删除作品集失败");
        }
        return new Result(0, "无法删除，作品集下仍有二级标题");
    }

    // 修改作品集状态，如果有未下架的作品集则不能修改作品集状态
    @RequestMapping(value = "/collection/{id}", method = RequestMethod.POST)
    public Result updateProductionCollectionState(@PathVariable("id") Long id, Byte state) {
        int a = secondTitleService.selectCollectionAndSecondTitle(id);
        System.out.println("=====================" + state + "====================");
        log.info("============作品集id:" + id + "下共有" + a + "条上架的二级标题============");
        if (a == 0) {
            productionCollectionService.updateStateByPrimaryKey(id, state);
            return new Result(1, "SUCCESS");
        }
        return new Result(-1, "error");
    }

    // 修改作品集状态
    @RequestMapping(value = "/collection/xiugai", method = RequestMethod.POST)
    public Result updateCollectionState(ProductionCollection productionCollection) {
        return productionCollectionService.updateByPrimaryKeySelective(productionCollection);
    }

    // 新增作品集
    @RequestMapping(value = "/collection/insert", method = RequestMethod.POST)
    public Result insertCollection(ProductionCollection productionCollection) {
        int i = productionCollectionService.insertCollection(productionCollection);
        if (i > 0) {
            return new Result(1, "新增作品集");
        }
        return new Result(-1, "新增作品集失败");
    }
}