package com.example.msa.repository;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StatusRepository {
    List<Status> findAll();
    Status findById(Long id);
}
