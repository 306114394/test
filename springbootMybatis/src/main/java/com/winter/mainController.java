package com.winter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by BA on 2018/3/20.
 */
@Controller
@RequestMapping
public class mainController {
    @RequestMapping(value = "/main")
    public String main(){
        return "/zwtp/main";
    }
    @RequestMapping(value = "/top")
    public String top(){
        return  "/zwtp/top";
    }

    @RequestMapping(value = "/left")
    public String left(){
        return  "/zwtp/left";
    }

    @RequestMapping(value = "/right")
    public String right(){
        return  "/zwtp/right";
    }

}
