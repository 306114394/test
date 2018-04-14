package com.winter;

import com.github.pagehelper.PageInfo;
import com.winter.model.Girl;
import net.sf.json.JSON;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

/**
 * Created by dong on 2018/3/12.
 */
@Controller
public class GirlController {
    @Autowired
    private  GirlService girlService;

    @GetMapping(value = "/girls")
    public Girl selectById(){

        Girl girl =  girlService.selectById();
        return  girl;
    }

    @GetMapping(value = "/girlsPage")
    public PageInfo girlsPage(@RequestParam(value = "pagesize" ,defaultValue = "10") int pagesize,
                                      @RequestParam(value = "pageNum",defaultValue = "10") int pageNum){
        PageInfo<Girl> girlPageInfo = girlService.girlsPage(pageNum, pagesize);
        return girlPageInfo;
    }

    @RequestMapping(value = "/upload")
    public String girlsIndex(HashMap<String, Object> map){
        map.put("hello", "欢迎进入HTML页面");
        return "/upload";
    }

    @RequestMapping("/user")
    public String getUsers() {
        return "user";
    }
    @RequestMapping("/student")
    public String student() {
        return "student";
    }






}
