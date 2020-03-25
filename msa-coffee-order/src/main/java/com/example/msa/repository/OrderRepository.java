package com.example.msa.repository;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderRepository {
    Long save(Order order);
}
