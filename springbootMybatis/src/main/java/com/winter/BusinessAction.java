package com.winter;

import net.sf.json.JSON;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.Date;
import java.util.Random;

/**
 * @Author:DongXifu
 * @Description:
 * @Date Created in 下午10:29 2018/4/10
 **/
@RestController
@RequestMapping("/business")
public class BusinessAction {
    @ResponseBody
    @RequestMapping("/uploadImg")
    public String uploadPicture(@RequestParam(value="file",required=false)MultipartFile file,
                                HttpServletRequest request){

        File targetFile=null;
        String msg="";//返回存储路径
        int code=1;
        String fileName=file.getOriginalFilename();//获取文件名加后缀
        if(fileName!=null&&fileName!=""){
            String returnUrl = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath() +"/upload/imgs/";//存储路径
            String path = request.getSession().getServletContext().getRealPath("upload/imgs"); //文件存储位置
            String fileF = fileName.substring(fileName.lastIndexOf("."), fileName.length());//文件后缀
            fileName=new Date().getTime()+"_"+new Random().nextInt(1000)+fileF;//新的文件名

            //先判断文件是否存在
            String fileAdd = new Date().toString();//DateUtil.format(new Date(),"yyyyMMdd");
            File file1 =new File(path+"/"+fileAdd);
            //如果文件夹不存在则创建
            if(!file1 .exists()  && !file1 .isDirectory()){
                file1 .mkdir();
            }
            targetFile = new File(file1, fileName);
            try {
                file.transferTo(targetFile);
                msg=returnUrl+fileAdd+"/"+fileName;
                code=0;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return msg;//JSON.toJSONString(ResponseResult.result(code, msg));
    }
}