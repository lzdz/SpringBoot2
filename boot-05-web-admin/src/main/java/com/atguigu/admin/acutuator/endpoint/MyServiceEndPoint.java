package com.atguigu.admin.acutuator.endpoint;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.Map;

/**
 * @author 刘振东
 * @create 2021-10-05 20:21
 */
@Component
@Endpoint(id = "myservice")
public class MyServiceEndPoint {


    @ReadOperation
    public Map getDockerInfo(){
        //端点的读操作  http://localhost:8080/actuator/myservice
        return Collections.singletonMap("dockerInfo","docker started.....");
    }

    @WriteOperation
    public void stopDocker(){
        System.out.println("docker stopped.....");
    }


}
