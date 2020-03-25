package com.example.msa.service;

import com.example.msa.repository.OrderRepository;
import com.example.msa.rest.dto.OrderRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class OrderService {

    private final OrderRepository orderRepository;

    @Transactional
    public Long save(OrderRequestDto dto){
        return orderRepository.save(dto.toEntity());
    }

}
