package com.jnshu.dao;

import com.jnshu.pojo.ProductionManage;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductionManageMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ProductionManage record);

    int insertSelective(ProductionManage record);

    ProductionManage selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ProductionManage record);

    int updateByPrimaryKey(ProductionManage record);
}