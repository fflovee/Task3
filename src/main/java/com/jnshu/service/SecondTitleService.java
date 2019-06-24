package com.jnshu.service;

import com.jnshu.pojo.SecondTitle;
import org.apache.ibatis.annotations.Param;

public interface SecondTitleService {

    // 查找作品集状态
    int selectCollectionAndSecondTitle(@Param("fid") Long fid);

    // 查找二级作品集数量
    int selectCountSecondTitle(Long fid);

    // 插入作品集分类
    int insertSecondTitle(SecondTitle secondTitle);

}
