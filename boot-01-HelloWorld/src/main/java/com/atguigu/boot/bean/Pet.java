package com.atguigu.boot.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author 刘振东
 * @create 2021-11-19 10:20
 *
 * 宠物
 */
@ToString
@Data
@NoArgsConstructor//无参构造器
@AllArgsConstructor//全参构造器
public class Pet {
    private  String name;

}
