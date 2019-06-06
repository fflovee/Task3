package com.jnshu.dao;

import com.jnshu.pojo.ProductionManage;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductionManageMapper {
    //查询并分页
    List<ProductionManage> selectProduction(ProductionManage productionManage);

    int selectAllProduction(ProductionManage productionManage);

    int deleteByPrimaryKey(Long id);

    int insert(ProductionManage record);

    int insertSelective(ProductionManage record);

    ProductionManage selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ProductionManage record);

    int updateByPrimaryKey(ProductionManage record);
}