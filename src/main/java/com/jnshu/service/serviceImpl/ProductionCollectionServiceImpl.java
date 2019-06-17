package com.jnshu.service.serviceImpl;

import com.jnshu.controller.BusinessException;
import com.jnshu.dao.ProductionCollectionMapper;
import com.jnshu.dao.SecondTitleMapper;
import com.jnshu.pojo.ProductionCollection;
import com.jnshu.pojo.Result;
import com.jnshu.service.ProductionCollectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductionCollectionServiceImpl implements ProductionCollectionService {

    @Autowired
    ProductionCollectionMapper productionCollectionMapper;
    @Autowired
    SecondTitleMapper secondTitleMapper;

    @Override
    public List<ProductionCollection> selectProductionCollection(ProductionCollection productionCollection) {
        return productionCollectionMapper.selectProductionCollection(productionCollection);
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return productionCollectionMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void updateStateByPrimaryKey(Long id, Byte state) {
        productionCollectionMapper.updateStateByPrimaryKey(id, state);
    }

    //修改作品集状态，如果作品集下面有未下架的二级标题则不能修改作品集状态。
    @Override
    public Result updateByPrimaryKeySelective(ProductionCollection record) {
        if (record.getCollectionState() == null || record.getCollectionState().equals("") || record.getCollectionState() < 0 || record.getCollectionState() > 1) {
            throw new BusinessException("状态异常");
//            return new Result(-1,"状态异常");
        }
        int i = productionCollectionMapper.updateByPrimaryKeySelective(record);
        if (i > 0) {
            return new Result(1, "更新成功");
        } else {
            throw new BusinessException("更新失败");
        }
    }

    //新增作品集信息
    @Override
    public int insertCollection(ProductionCollection record) {
        if (record.getCollectionName() == null || record.getCollectionName().equals("")) {
            throw new BusinessException("作品集名称不能为空");
        }
        if (record.getCollectionState()!=0){
            throw new BusinessException("不能传入的值");
        }
        int i = productionCollectionMapper.selectCollectionCount();
        if (i > 6) {
            throw new BusinessException("超过作品集数量上限");
        }
        record.setCreateAt(System.currentTimeMillis());
        record.setCreateBy("");
        return productionCollectionMapper.insertSelective(record);
    }

    @Override
    public int selectCollectionCount() {
        return productionCollectionMapper.selectCollectionCount();
    }

}
