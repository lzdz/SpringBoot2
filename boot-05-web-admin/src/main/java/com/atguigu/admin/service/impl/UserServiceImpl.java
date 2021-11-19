package com.atguigu.admin.service.impl;


import com.atguigu.admin.bean.User;
import com.atguigu.admin.mapper.UserMapper;
import com.atguigu.admin.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @author 刘振东
 * @create 2021-10-05 20:56
 */


@Service
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements UserService {


}
