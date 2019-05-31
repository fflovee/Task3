package com.jnshu.controller;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.jnshu.pojo.LeaveWords;
import com.jnshu.pojo.Result;
import com.jnshu.service.LeaveWordsService;
import com.jnshu.utils.Page;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class LeavesWordsController {

    private static Logger log = LogManager.getLogger(LeavesWordsController.class);

    @Autowired
    private LeaveWordsService leaveWordsService;

    //查询留言
    @ResponseBody
    @RequestMapping(value = "/leavewords", method = RequestMethod.GET)
    //RequestParam绑定参数，包装类包含空格，required = false（默认true）允许传空值。
    public Result leaveWordsResult(@RequestParam(value = "stat", required = false) Byte stat, @RequestParam(value = "name", required = false) String name, Page page) {
        LeaveWords leaveWords = new LeaveWords();
        leaveWords.setLeavewordsStat(stat);
        if (name != null && !name.equals("")) {
            leaveWords.setProductionName("%" + name + "%");//拼接模糊查询
        }
//        Long time = System.currentTimeMillis();
//        leaveWords.setUpdateAt(time);
        PageHelper.offsetPage(page.getStart(), page.getCount());
        List<LeaveWords> leaveWordsList = leaveWordsService.selectLeavewordsByNameAndStat(leaveWords);
        page.caculateLast(leaveWordsList.size());
        return new Result(1, "success", leaveWordsList);
    }

    //插入留言
    @ResponseBody
    @RequestMapping(value = "/leaveswords/add", method = RequestMethod.POST)
    public Result leaveswordsInsert(LeaveWords leaveWords) {
        leaveWords.setCreateAt(System.currentTimeMillis());
        int i = leaveWordsService.insertLaveswords(leaveWords);
        log.info("添加留言成功");
        if (i > 0) {
            return new Result(1, "INSERT SUCCESS", leaveWords);
        }
        return new Result(-1, "INSERT FAIL");
    }

    //删除留言
    @ResponseBody
    @RequestMapping(value = "/leavewords", method = RequestMethod.DELETE)
    public Result leavewordsDeleteById(@RequestParam("ids") ArrayList ids) {
        int row = 0;//成功删除条数
        int error = 0;//删除错误条数
        for (int i = 0; i < ids.size(); i++) {//遍历数组
            if ((int) ids.get(i) > 0) {
                int a = leaveWordsService.deleteleaveswords((Long) ids.get(i));
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

            //事务回滚+报错
            return new Result(-1, "DELETE FAIL");

        }

        return new Result(1, "DELETE SUCCESS");
    }

    //批量删除
    @ResponseBody
    @RequestMapping(value = "/leaveswords/delete", method = RequestMethod.DELETE)
    public Result deleteAll(@RequestBody JSONObject jsonObject) {
        int row = 0;
        int error = 0;
        List list = jsonObject.getJSONArray("ids").toJavaList(long.class);
        log.info("==========================" + list + "==========================");
        for (int i = 0; i < list.size(); i++) {
            if ((Long) list.get(i) > 0) {
                int a = leaveWordsService.deleteByPrimaryKey((long) list.get(i));
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

    //修改留言状态
    @ResponseBody
    @RequestMapping(value = "/leavewords/update", method = RequestMethod.POST)
    public Result updateStat(LeaveWords leaveWords) {
        if (leaveWords.getId() > 0 && (leaveWords.getLeavewordsStat() == 0 || leaveWords.getLeavewordsStat() == 1)) {
            leaveWordsService.updateStatById(leaveWords.getId(), leaveWords.getLeavewordsStat());
            return new Result(1, "UPDATE SUCCESS");
        }
        return new Result(-1, "UPDATE FAIL");
    }
}

