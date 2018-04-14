package com.winter.model;


import com.winter.java8.MathOperation;

import java.util.*;
import java.util.stream.Collectors;

import static org.json.XMLTokener.entity;

/**
 * Created by BA on 2018/3/22.
 */
public class Java8Tester  {
    final static String salutation = "Hello! ";
    private MathOperation add;

    public static void main(String args[]){
       /* Java8Tester tester = new Java8Tester();
        MathOperation add = (a, b) -> a+b;
        MathOperation reduce = (a,b) -> a-b;

        System.out.println(tester.operate(3,5,add));
        System.out.println(tester.operate(3,5,reduce));*/

        sort();
    }

    public static void str(){
        GreetingService greetingService = message ->  { System.out.println(salutation+message);};
        greetingService.sayMessage("runoob");
    }

    interface GreetingService {
        void sayMessage(String message);
    }

    private int operate(int a, int b, MathOperation mathOperation){
        return mathOperation.operation(a, b);
    }

    public  static  void  sort(){
        List<Map<String,String >> list = new ArrayList<>();

        Map <String,String> map1 =  new  HashMap <>();
        map1.put("id","101");
        map1.put("name","Tomcat");

        Map <String,String> map2 =  new  HashMap <>();
        map2.put("id","102");
        map2.put("name","Apache");

        Map <String,String> map3 =  new  HashMap <>();
        map3.put("id","103");
        map3.put("name","Nginx");

        list.add(map1);
        list.add(map2);
        list.add(map3);


        List <String> ids = list.stream().map(entity -> entity.get("id")).collect(Collectors.toList());
        List list1 = new ArrayList();
        for (Map<String,String> map:list) {
            String str = map.get("id");
            list1.add(str);
        }

        System.out.println(ids);


    }
}
