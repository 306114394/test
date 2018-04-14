package com.winter.mapper;

import com.winter.model.Girl;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface GirlMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Girl record);

    int insertSelective(Girl record);

    Girl selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Girl record);

    int updateByPrimaryKey(Girl record);

    List<Girl> findGirlPaging();
}