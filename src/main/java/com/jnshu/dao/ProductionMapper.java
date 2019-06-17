package com.jnshu.dao;

import com.jnshu.pojo.Production;
import com.jnshu.pojo.ProductionExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductionMapper {
    long countByExample(ProductionExample example);

    int deleteByExample(ProductionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Production record);

    int insertSelective(Production record);

    List<Production> selectByExample(ProductionExample example);

    Production selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Production record, @Param("example") ProductionExample example);

    int updateByExample(@Param("record") Production record, @Param("example") ProductionExample example);

    int updateByPrimaryKeySelective(Production record);

    int updateByPrimaryKey(Production record);
}