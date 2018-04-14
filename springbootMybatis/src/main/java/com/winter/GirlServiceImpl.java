package com.winter;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.winter.mapper.GirlMapper;
import com.winter.model.Girl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by dong on 2018/3/12.
 */

@Service
public class GirlServiceImpl implements GirlService{
    @Autowired
    private GirlMapper girlMapper;
    @Override
    public Girl selectById() {
        return girlMapper.selectByPrimaryKey(1);
    }

    @Override
    public PageInfo<Girl> girlsPage(int pageNum, int pagesize) {
        PageHelper.startPage(pageNum,pagesize);
        List<Girl> girlList = girlMapper.findGirlPaging();
        return new PageInfo<>(girlList);
    }
}
