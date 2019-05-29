package com.jnshu.service;

import com.jnshu.pojo.LeaveWords;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public interface LeaveWordsService {

    LeaveWords selectLeavewordsByID(long id);

    List<LeaveWords> selectLeavewordsByNameAndStat(LeaveWords leaveWords);

    int insertLaveswords(LeaveWords leaveWords);

    int deleteleaveswords(Long id);

    int deleteLeaveswordsList(List<String> date);

    int deleteByPrimaryKey(long id);

}



