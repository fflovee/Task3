package com.jnshu.controller;

import com.jnshu.pojo.Result;
import com.jnshu.pojo.SecondTitle;
import com.jnshu.service.SecondTitleService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecondTitleController {

    private static final Logger LOG = LogManager.getLogger(SecondTitleController.class);

    @Autowired
    SecondTitleService secondTitleService;

    @RequestMapping(value = "/secondTitle/add")
    public Result insertSecondTitle(@RequestParam("fid") Long fid,
                                    @RequestParam("collection") String collection,
                                    @RequestParam("name") String name) {
        int a = secondTitleService.selectCountSecondTitle(fid);
        LOG.info("共有" + a + "条数据");
        if (a > 6) {
            throw new BusinessException("作品集分类超过上限，无法添加");
        }
        SecondTitle secondTitle = new SecondTitle();
        secondTitle.setFid(fid);
        secondTitle.setCollectionName(collection);
        secondTitle.setCreateAt(System.currentTimeMillis());
        secondTitle.setCreateBy("");
        secondTitle.setTitleName(name);
        int i = secondTitleService.insertSecondTitle(secondTitle);
        if (i > 0) {
            return new Result(1, "新增作品集分类成功");
        }
        return new Result(-1, "新增作品集分类失败");
    }

}
