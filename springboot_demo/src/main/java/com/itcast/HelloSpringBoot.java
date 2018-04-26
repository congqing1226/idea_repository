package com.itcast;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author congzi
 * @Description:
 * @create 2018-04-25
 * @Version 1.0
 */
@RestController
public class HelloSpringBoot {

    @RequestMapping("/say")
    public String home(){

        return "你好世界!!";
    }

    @RequestMapping("/sayHello")
    public String getBoy(){

        return "boy keep it real ";
    }

    @RequestMapping("/hello/{name}")
    public String hello(@PathVariable String name){
        return "hello" + name;
    }


    /**
     * 使用Alibaba的 fastJson,来进行JSON数据的转换
     */

    @RequestMapping("/getJson")
    public JsonDemo getJson(){

        JsonDemo jsonDemo = new JsonDemo();
        jsonDemo.setId(24);
        jsonDemo.setName("kobe");
        jsonDemo.setCreatetime(new Date());

        return jsonDemo;
    }



}
