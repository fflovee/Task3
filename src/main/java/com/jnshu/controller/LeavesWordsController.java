package com.jnshu.controller;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jnshu.pojo.LeaveWords;
import com.jnshu.pojo.Result;
import com.jnshu.service.LeaveWordsService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class LeavesWordsController {

    private static Logger log = LogManager.getLogger(LeavesWordsController.class);

    @Autowired
    private LeaveWordsService leaveWordsService;

    // 查询留言
    @RequestMapping(value = "/leaves", method = RequestMethod.GET)
    // RequestParam绑定参数，包装类包含空格，required = false（默认true）允许传空值。
    public Result leaveWordsResult(@RequestParam(value = "state", required = false) Byte state,
                                   @RequestParam(value = "production", required = false) String productionname,
                                   @RequestParam(value = "page", required = false, defaultValue = "1") int page,
                                   @RequestParam(value = "count", required = false, defaultValue = "5") int count) throws RuntimeException {
        LeaveWords leaveWords = new LeaveWords();
        leaveWords.setLeavewordsStat(state);
        leaveWords.setProductionName(productionname);
        PageHelper.startPage(page, count);
//        System.err.println("==================================="+count);
        List<LeaveWords> leaveWordsList = leaveWordsService.selectLeavewordsByNameAndStat(leaveWords);
        PageInfo<LeaveWords> leaveWordsPageInfo = new PageInfo<>(leaveWordsList);
        return new Result(1, "success", leaveWordsPageInfo);
    }

    // 插入留言
    @RequestMapping(value = "/leaves/add", method = RequestMethod.POST)
    public Result leavesWordsInsert(LeaveWords leaveWords) {
        leaveWords.setCreateAt(System.currentTimeMillis());
        int i = leaveWordsService.insertLaveswords(leaveWords);
        log.info("添加留言成功");
        if (i > 0) {
            return new Result(1, "INSERT SUCCESS", leaveWords);
        }
        return new Result(-1, "INSERT FAIL");
    }

    // 删除留言
    @RequestMapping(value = "/leaves", method = RequestMethod.DELETE)
    public Result leaveWordsDeleteById(@RequestParam("ids") ArrayList ids) {
        int row = 0;//成功删除条数
        int error = 0;//删除错误条数
        for (Object id : ids) {//遍历数组
            if ((int) id > 0) {
                int a = leaveWordsService.deleteleaveswords((Long) id);
                if (a == 1) {
                    row = row + 1;
                } else {
                    error = error + 1;
                }
            } else {
                error = error + 1;
            }
        }
        if (error > 0) {
            // 事务回滚+报错
            return new Result(-1, "DELETE FAIL");
        }
        return new Result(1, "DELETE SUCCESS");
    }

    // 批量删除
    @RequestMapping(value = "/leaves/delete", method = RequestMethod.DELETE)
    public Result deleteQuery(@RequestBody JSONObject jsonObject) {
        int row = 0;
        int error = 0;
        List list = jsonObject.getJSONArray("ids").toJavaList(long.class);
        log.info("==========================" + list + "==========================");
        for (Object o : list) {
            if ((Long) o > 0) {
                int a = leaveWordsService.deleteByPrimaryKey((long) o);
                if (a == 1) {
                    row = row + 1;
                } else {
                    error = error + 1;
                }
            }
            if (error > 0) {
                return new Result(-1, "DELETE FAIL");
            }
        }
        return new Result(1, "DELETE SUCCESS");
    }

    // 修改留言状态
    @RequestMapping(value = "/leaves/update", method = RequestMethod.POST)
    public Result updateStat(LeaveWords leaveWords) {
        if (leaveWords.getId() > 0 && (leaveWords.getLeavewordsStat() == 0 || leaveWords.getLeavewordsStat() == 1)) {
            leaveWordsService.updateStatById(leaveWords.getId(), leaveWords.getLeavewordsStat());
            return new Result(1, "UPDATE SUCCESS");
        }
        return new Result(-1, "UPDATE FAIL");
    }
}

