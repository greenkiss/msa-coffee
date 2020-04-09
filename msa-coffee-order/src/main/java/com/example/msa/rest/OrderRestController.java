package com.example.msa.rest;

import com.example.msa.messageq.KafkaProducer;
import com.example.msa.rest.dto.OrderRequestDto;
import com.example.msa.service.IMemberExist;
import com.example.msa.service.OrderService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class OrderRestController {

    private final OrderService orderService;

    @Autowired
    private KafkaProducer kafkaProducer;

    @Autowired
    private IMemberExist iMemberExist;

    @ApiOperation(value = "save coffee order")
    @PostMapping("/api/v1/order")
    public Long save(@RequestBody OrderRequestDto orderRequestDto) {
        String topic = "coffee-test";

        Long flag = 0L;

        if(iMemberExist.findByName(orderRequestDto.getMemberName()))
            System.out.println(orderRequestDto.getMemberName() + "is Member!");
        else {
            System.out.println("Not Member!");
            return flag;
        }
        flag = orderService.save(orderRequestDto);
        kafkaProducer.send(topic, orderRequestDto);

        System.out.println("=================== end =======================" );
        return flag;
    }
}
