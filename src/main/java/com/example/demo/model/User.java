package com.example.demo.model;

import java.io.Serializable;

/**
 * @author Administrator
 */
public class User implements Serializable {

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age='" + age + '\'' +
                ", jog='" + jog + '\'' +
                '}';
    }

    private static final long serialVersionUID = 1L;

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

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getJog() {
        return jog;
    }

    public void setJog(String jog) {
        this.jog = jog;
    }
}