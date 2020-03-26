package com.example.msa.rest;

import com.example.msa.rest.dto.OrderRequestDto;
import com.example.msa.service.OrderService;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class OrderRestController {

    private final OrderService orderService;

    @ApiOperation(value = "save coffee order")
    @PostMapping("/api/v1/order")
    public Long save(@RequestBody OrderRequestDto orderRequestDto){
        return orderService.save(orderRequestDto);
    }
}
