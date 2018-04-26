package com.itcast.demo1.service;

import com.itcast.demo1.bean.Cat;
import com.itcast.demo1.repository.CatRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @author congzi
 * @Description: 业务层,save update delete需要进行事物的绑定
 * @create 2018-04-26
 * @Version 1.0
 */
@Service
public class CatService {

    @Resource
    private CatRepository catRepository;

    @Transactional
    public void delete(int id){
        catRepository.delete(id);
    }

    @Transactional
    public void insert(Cat cat){
        catRepository.save(cat);
    }

    public Iterable<Cat> select(){
       return catRepository.findAll();
    }



}
