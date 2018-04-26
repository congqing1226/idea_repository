package com.itcast.demo1.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author congzi
 * @Description:   实体类配置
 * @create 2018-04-26
 * @Version 1.0
 */
@Entity
public class Cat {

     @Id
     @GeneratedValue(strategy= GenerationType.AUTO)
     private int id ;

     private String catName;

     private int catAge;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public int getCatAge() {
        return catAge;
    }

    public void setCatAge(int catAge) {
        this.catAge = catAge;
    }
}
