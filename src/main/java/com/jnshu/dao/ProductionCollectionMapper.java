package com.jnshu.dao;

import com.jnshu.pojo.ProductionCollection;
import com.jnshu.pojo.ProductionCollectionExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductionCollectionMapper {

    //条件查询作品集
    List<ProductionCollection> selectProductionCollection(ProductionCollection productionCollection);

    //主键删除作品集
    int deleteByPrimaryKey(Long id);

    //修改作品集状态
    void updateStateByPrimaryKey(@Param("id") Long id, @Param("collectionState") Byte state);

    //修改作品集
    int updateByPrimaryKeySelective(ProductionCollection record);

    //新增作品集
    int insertSelective(ProductionCollection record);

    //查询所有作品集数量
    int selectCollectionCount();

    long countByExample(ProductionCollectionExample example);

    int deleteByExample(ProductionCollectionExample example);

    int insert(ProductionCollection record);

    List<ProductionCollection> selectByExample(ProductionCollectionExample example);

    ProductionCollection selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ProductionCollection record, @Param("example") ProductionCollectionExample example);

    int updateByExample(@Param("record") ProductionCollection record, @Param("example") ProductionCollectionExample example);

    int updateByPrimaryKey(ProductionCollection record);
}