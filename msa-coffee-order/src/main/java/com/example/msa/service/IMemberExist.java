package com.example.msa.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@FeignClient(name="msa-coffee-member", fallback =MemberFeignClientFallback.class)
public interface IMemberExist {
    @RequestMapping(method = RequestMethod.GET, value = "/api/v1/members/find/{name}")
    boolean findByName(@PathVariable("name") String name);
}

@Component
class MemberFeignClientFallback implements IMemberExist {
    private final Logger logger = LoggerFactory.getLogger(MemberFeignClientFallback.class);
    @Override
    public boolean findByName(String name) {
        logger.error("Member 서비스 : 응답지연 발생");
        return false;
    }
}
