package com.itcast.demo1.repository;

import com.itcast.demo1.bean.Cat;
import org.springframework.data.repository.CrudRepository;

/**
 * @author congzi
 * @Description: 持久层继承 CrudRepository
 * @create 2018-04-26
 * @Version 1.0
 */
public interface CatRepository extends CrudRepository<Cat,Integer> {
}
