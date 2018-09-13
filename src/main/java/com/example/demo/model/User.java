package com.example.demo.model;

import java.io.Serializable;

/**
 * @author Administrator
 */
public class User implements Serializable {

    private Integer id;

    private String name;

    private String sex;

    private String age;

    private String jog;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getJog() {
        return jog;
    }

    public void setJog(String jog) {
        this.jog = jog;
    }
}