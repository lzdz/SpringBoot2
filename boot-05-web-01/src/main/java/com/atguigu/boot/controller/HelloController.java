package com.atguigu.boot.controller;

import org.springframework.web.bind.annotation.*;


/**
 * @author 刘振东
 * @create 2021-09-28 18:13
 */

@RestController
public class HelloController {

    @RequestMapping("/HT-6100.jpg")
    public String hello(){

        return "aaa";
    }
    //1.注解
//    public String hello(@RequestParam("username") String  name){
//
//        return "aaa";
//    }

    //2.servlet API
//    public String hello(HttpSession session){
//
//        return "aaa";
//    }

    //3.复杂参数
//    public String hello(Model model){
//
//        //request
//        return "aaa";
//    }

    //自定义对象参数
//    public String hello(Person person){
//
//        return "aaa";
//    }

    //    @RequestMapping(value = "/user",method = RequestMethod.GET)
    @GetMapping("/user")
    public String getUser(){

        return "GET-张三";
    }

    //    @RequestMapping(value = "/user",method = RequestMethod.POST)
    @PostMapping("/user")
    public String saveUser(){
        return "POST-张三";
    }


    //    @RequestMapping(value = "/user",method = RequestMethod.PUT)
    @PutMapping("/user")
    public String putUser(){

        return "PUT-张三";
    }

    @DeleteMapping("/user")
//    @RequestMapping(value = "/user",method = RequestMethod.DELETE)
    public String deleteUser(){
        return "DELETE-张三";
    }

    //扩展点：如何把 _method 这个名字换成我们自己喜欢的




//    @Bean
//    @ConditionalOnMissingBean(HiddenHttpMethodFilter.class)
//    @ConditionalOnProperty(prefix = "spring.mvc.hiddenmethod.filter", name = "enabled", matchIfMissing = false)
//    public OrderedHiddenHttpMethodFilter hiddenHttpMethodFilter() {
//        return new OrderedHiddenHttpMethodFilter();
//    }
//
//
//    //自定义filter
//    @Bean
//    public HiddenHttpMethodFilter hiddenHttpMethodFilter(){
//        HiddenHttpMethodFilter methodFilter = new HiddenHttpMethodFilter();
//        methodFilter.setMethodParam("_m");
//        return methodFilter;
//    }
}
