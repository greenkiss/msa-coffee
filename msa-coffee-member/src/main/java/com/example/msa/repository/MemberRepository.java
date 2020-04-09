package com.example.msa.repository;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface MemberRepository {
    Long save(Member member);
    List<Member> findAll();
    Member findById(Long id);
    boolean findByName(String name);
}
