package com.jnshu.dao;

import com.jnshu.pojo.StudioManage;
import org.springframework.stereotype.Repository;

@Repository
public interface StudioManageMapper {
    int deleteByPrimaryKey(Long id);

    int insert(StudioManage record);

    int insertSelective(StudioManage record);

    StudioManage selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(StudioManage record);

    int updateByPrimaryKey(StudioManage record);
}