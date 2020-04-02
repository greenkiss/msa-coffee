package com.example.msa.rest;

import com.example.msa.rest.dto.StatusRequestDto;
import com.example.msa.rest.dto.StatusResponseDto;
import com.example.msa.service.StatusService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class StatusController {

    private  final StatusService statusService;

    @ApiOperation(value="find all status")
    @GetMapping("/api/v1/status")
    @HystrixCommand
    public List<StatusResponseDto> findAll() {
        return statusService.findAll();
    }

    @ApiOperation(value="find status by id")
    @GetMapping("/api/v1/status/{id}")
    @HystrixCommand
    public StatusResponseDto findById(@PathVariable Long id) {
        return statusService.findById(id);
    }
}
