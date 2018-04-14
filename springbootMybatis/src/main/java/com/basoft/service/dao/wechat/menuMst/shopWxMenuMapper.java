package com.basoft.service.dao.wechat.menuMst;

import com.winter.model.shopWxMenu;
import com.winter.model.shopWxMenuExample;
import com.winter.model.shopWxMenuKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface shopWxMenuMapper {
    int countByExample(shopWxMenuExample example);

    int deleteByExample(shopWxMenuExample example);

    int deleteByPrimaryKey(shopWxMenuKey key);

    int insert(shopWxMenu record);

    int insertSelective(shopWxMenu record);

    List<shopWxMenu> selectByExampleWithBLOBs(shopWxMenuExample example);

    List<shopWxMenu> selectByExample(shopWxMenuExample example);

    shopWxMenu selectByPrimaryKey(shopWxMenuKey key);

    int updateByExampleSelective(@Param("record") shopWxMenu record, @Param("example") shopWxMenuExample example);

    int updateByExampleWithBLOBs(@Param("record") shopWxMenu record, @Param("example") shopWxMenuExample example);

    int updateByExample(@Param("record") shopWxMenu record, @Param("example") shopWxMenuExample example);

    int updateByPrimaryKeySelective(shopWxMenu record);

    int updateByPrimaryKeyWithBLOBs(shopWxMenu record);

    int updateByPrimaryKey(shopWxMenu record);
}