package com.winter;

import com.github.pagehelper.PageInfo;
import com.winter.model.Girl;

/**
 * Created by dong on 2018/3/12.
 */


public interface GirlService {
    public Girl selectById();

    public PageInfo<Girl> girlsPage(int pagesize, int pageNum);
}
