package com.dfqx.Controller;

import cn.hutool.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("lottery/")
public class BaseController {

    @Autowired
    private DiscoveryClient client;
    @RequestMapping("/hello")
    public JSONObject getHelloWorld(){
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("hello","helloBoy6");
       ServiceInstance instance=client.getLocalServiceInstance();
        System.out.println(instance.getHost()+","+instance.getServiceId());
        return jsonObject;
    }
}
