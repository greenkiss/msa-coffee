package com.example.msa.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name="msa-coffee-member")
public interface IMemberExist {
    @RequestMapping(method = RequestMethod.GET, value = "/api/v1/members/find/{name}")
    boolean findByName(@PathVariable("name") String name);
}
