package com.example.demo.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "demo2Client", url = "${client.demo2.url}")
public interface Demo2Client {
    
    @RequestMapping(method = RequestMethod.GET, value = "/demo2/info")
    String info();

}
