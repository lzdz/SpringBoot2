package com.atguigu.admin.service;

import com.atguigu.admin.bean.City;

/**
 * @author 刘振东
 * @create 2021-10-05 20:52
 */

public interface CityService {

    City getById(Long id);

    void saveCity(City city);

}