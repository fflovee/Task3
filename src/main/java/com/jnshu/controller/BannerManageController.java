package com.jnshu.controller;

import com.jnshu.pojo.BannerManage;
import com.jnshu.pojo.Result;
import com.jnshu.service.BannerManageService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RestController
public class BannerManageController {

    private static Logger log = LogManager.getLogger(BannerManageController.class);

    @Autowired
    private BannerManageService bannerManageService;

    //  新增banner图
    @RequestMapping(value = "/banner/add", method = RequestMethod.PUT)
    public Result insertBanner(String bannerurl,String bannerpic) {
        BannerManage bannerManage = new BannerManage();
        bannerManage.setCreateAt(System.currentTimeMillis());
        int i = bannerManageService.addBanner(bannerurl,bannerpic);
        log.info("插入banner成功");
        if (i > 0) {
            return new Result(1, "插入banner图成功");
        }
        return new Result(-1, "插入banner图失败");
    }

    //  删除banner图
    @RequestMapping(value = "banner/delete", method = RequestMethod.DELETE)
    public Result deleteBanner(Long id) {
        int i = bannerManageService.deleteBanner(id);
        if (i > 0) {
            log.info("banner图删除成功");
            return new Result(1, "banner图删除成功");
        }
        return new Result(-1, "banner图删除失败");
    }

    //  更新banner图
    @RequestMapping(value = "/banner/updatestate", method = RequestMethod.POST)
    public Result updateBannerState(Byte state, Long id) {
        if (state == 0) {
            int a = bannerManageService.updateBannerState(state, id);
            if (a > 0)
                log.info("下架banner图成功");
            return new Result(1, "下架banner图");
        }
        if (state == 1) {
            int i = bannerManageService.selectBannerState(state);
            log.info("上架banner图数量为：" + i);
            if (i < 6) {
                int b = bannerManageService.updateBannerState(state, id);
                if (b > 0)
                    log.info("banner图上架成功");
                return new Result(1, "banner修改为上架状态");
            }
        }
        return new Result(-1, "只能上架最多6张banner图");
    }

    //查找banner图
    @RequestMapping(value = "/banner/list", method = RequestMethod.GET)
    public Result updateBanner(Byte state, String createby) {
        if (state != null && state.equals("")) {
            BannerManage bannerManage = new BannerManage();
            if (state == 1)
                bannerManage.setCreateBy("张三");
            bannerManage.setBannerState((byte) 0);
            bannerManage.setUpdateAt(System.currentTimeMillis());
            return new Result(1, "查询到所有上架banner图", bannerManage);
        }
        return null;
    }
}