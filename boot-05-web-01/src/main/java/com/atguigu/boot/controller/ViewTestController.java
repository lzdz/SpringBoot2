package com.atguigu.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author 刘振东
 * @create 2021-10-01 20:37
 */

@Controller
public class ViewTestController {

    @GetMapping("/atguigu")
    public String atguigu(Model model){

        //model中的数据会被放在请求域中request.setAttribute("a",aa)
        model.addAttribute("msg", "你好，硅谷");
        model.addAttribute("link", "http://www.baidu.com");
        return "success";
    }
}
