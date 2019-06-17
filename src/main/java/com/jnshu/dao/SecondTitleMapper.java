package com.jnshu.dao;

import com.jnshu.pojo.SecondTitle;
import com.jnshu.pojo.SecondTitleExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SecondTitleMapper {

    //查询二级标题的fid和状态
    int selectCollectionAndSecondTitle(@Param("fid") Long fid, @Param("titleState") Byte state);

    //查询作品集下面有几条二级标题
    int selectCountByFid(Long fid);

    // 插入作品集分类
    int insertSelective(SecondTitle record);

    long countByExample(SecondTitleExample example);

    int deleteByExample(SecondTitleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SecondTitle record);

    List<SecondTitle> selectByExample(SecondTitleExample example);

    SecondTitle selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SecondTitle record, @Param("example") SecondTitleExample example);

    int updateByExample(@Param("record") SecondTitle record, @Param("example") SecondTitleExample example);

    int updateByPrimaryKeySelective(SecondTitle record);

    int updateByPrimaryKey(SecondTitle record);
}