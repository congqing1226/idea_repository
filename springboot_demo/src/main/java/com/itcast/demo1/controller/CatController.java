package com.itcast.demo1.controller;

import com.itcast.demo1.bean.Cat;
import com.itcast.demo1.service.CatService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author congzi
 * @Description:
 * @create 2018-04-26
 * @Version 1.0
 */
@RestController
@RequestMapping("/cat")
public class CatController {

    @Resource
    private CatService catService;

    @RequestMapping("/save")
    public String save(){

        Cat cat = new Cat();
        cat.setId(1);
        cat.setCatName("tom");
        cat.setCatAge(18);

        catService.insert(cat);
        return "save OK!!!";
    }

    @RequestMapping("/delete")
    public String delete(){

        catService.delete(1);
        return "delete ok";
    }

    @RequestMapping("/getAll")
    public Iterable<Cat> getAll(){
        return catService.select();
    }

}
