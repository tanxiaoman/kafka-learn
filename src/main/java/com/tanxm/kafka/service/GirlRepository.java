package com.tanxm.kafka.service;

import com.tanxm.kafka.domain.Girl;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GirlRepository extends JpaRepository<Girl,Integer> {
    //通过名字和年龄查询
    public List<Girl> findByNameAndAge(String name,Integer age);
}
