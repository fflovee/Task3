package com.jnshu.dao;

import com.jnshu.pojo.LeaveWords;
import com.jnshu.pojo.Result;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface LeaveWordsMapper {
    int deleteByPrimaryKey(Long id);

    int deleteByIds(List<String> data);

    int insert(LeaveWords record);

    int insertSelective(LeaveWords record);

    LeaveWords selectByPrimaryKey(Long id);

    List<LeaveWords> selectLeavewordsByNameAndStat(LeaveWords leaveWords);

    int updateByPrimaryKeySelective(LeaveWords record);

    int updateByPrimaryKey(LeaveWords record);

    Result<LeaveWords> selectByPrimaryKey();
}