package com.jnshu.service;

import com.jnshu.pojo.ProductionCollection;
import com.jnshu.pojo.Result;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ProductionCollectionService {

    //查询作品集及作品集状态
    List<ProductionCollection> selectProductionCollection(ProductionCollection productionCollection);

    //主键删除作品集
    int deleteByPrimaryKey(Long id);

    //修改作品集状态
    void updateStateByPrimaryKey(Long id, Byte state);

    //修改作品集
    Result updateByPrimaryKeySelective(ProductionCollection record);

    //新增作品集
    int insertCollection(ProductionCollection productionCollection);

    //查询所有作品集数量
    int selectCollectionCount();

}