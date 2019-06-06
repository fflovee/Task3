package com.jnshu.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jnshu.pojo.BannerManage;
import com.jnshu.pojo.Result;
import com.jnshu.service.BannerManageService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

@RestController
public class BannerManageController {

    private static Logger log = LogManager.getLogger(BannerManageController.class);

    @Resource
    private BannerManageService bannerManageService;

    //查询banner图
    @RequestMapping(value = "/banner", method = RequestMethod.GET)
    public Result selectBanner(@RequestParam(value = "state", required = false) Byte state,
                               @RequestParam(value = "create", required = false) String create,
                               @RequestParam(value = "page", required = false, defaultValue = "1") int page,
                               @RequestParam(value = "rows", required = false, defaultValue = "5") int rows) throws RuntimeException {
        BannerManage bannerManage = new BannerManage();
        bannerManage.setBannerState(state);
        bannerManage.setCreateBy(create);
        PageHelper.startPage(page, rows);
        List<BannerManage> bannerManageList = bannerManageService.selectBanner(bannerManage);
        PageInfo<BannerManage> bannerManagePageInfo = new PageInfo<>(bannerManageList);
        return new Result(1, "查询banner列表", bannerManagePageInfo);
    }

    //  新增banner图
    @RequestMapping(value = "/banner/add", method = RequestMethod.PUT)
    public Result insertBanner(String bannerurl, String bannerpic) {
        BannerManage bannerManage = new BannerManage();
        bannerManage.setCreateAt(System.currentTimeMillis());
        int i = bannerManageService.addBanner(bannerurl, bannerpic);
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

    @RequestMapping(value = "/banner/weight", method = RequestMethod.PUT)
    public Result updateBannerlist(@RequestBody Long[] ids) {
        int index = 1;
        for (Long id : ids) {
            BannerManage bannerManage = new BannerManage();
            bannerManage.setWeight(index);
            bannerManage.setId(id);
            bannerManageService.updateByPrimaryKeySelective(bannerManage);
            index++;
        }
        System.out.println("=================" + Arrays.toString(ids) + "=================");
        return new Result(0, "排序成功");
    }
}