package com.atguigu.boot.bean;

import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author 刘振东
 * @create 2021-11-19 10:50
 */
@ToString
@Data
public class Pet {
    private  String name;
    private  Double weight;

}
