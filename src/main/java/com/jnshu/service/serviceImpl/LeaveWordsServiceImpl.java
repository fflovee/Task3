package com.jnshu.service.serviceImpl;

import com.jnshu.dao.LeaveWordsMapper;
import com.jnshu.pojo.LeaveWords;
import com.jnshu.service.LeaveWordsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LeaveWordsServiceImpl implements LeaveWordsService {

    @Autowired
    private LeaveWordsMapper leaveWordsMapper;

    @Override
    public LeaveWords selectLeavewordsByID(long id) {
        return leaveWordsMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<LeaveWords> selectLeavewordsByNameAndStat(LeaveWords leaveWords) {
        return leaveWordsMapper.selectLeavewordsByNameAndStat(leaveWords);
    }

    @Override
    public int insertLaveswords(LeaveWords leaveWords) {
        return leaveWordsMapper.insertSelective(leaveWords);
    }

    @Override
    public int deleteleaveswords(Long id) {
        return leaveWordsMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int deleteLeaveswordsList(List<String> date) {
        return this.leaveWordsMapper.deleteByIds(date);
    }

    @Override
    public int deleteByPrimaryKey(long id) {
        return leaveWordsMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int updateStatById(Long id, byte leavewordsStat) {
        return leaveWordsMapper.updateStatById(id, leavewordsStat);
    }

}
