package com.itcast;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

/**
 * @author congzi
 * @Description:
 * @create 2018-04-25
 * @Version 1.0
 */
public class JsonDemo {

    private int id;

    private String name;

    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date createtime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}
