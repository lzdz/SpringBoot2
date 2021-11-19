package com.atguigu.boot.bean;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author 刘振东
 * @create 2021-11-19 10:20
 * 用户
 */
@ToString
@Data
@NoArgsConstructor//无参构造器
///@AllArgsConstructor//全参构造器
@EqualsAndHashCode
public class User {

    private  String name;
    private  Integer age;
    private  Pet pet;


    public User(String name,Integer age){
        this.name = name;
        this.age = age;
    }
}
