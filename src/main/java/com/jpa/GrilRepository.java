package com.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created with IntelliJ IDEA
 * USER:xushuanglu
 * CLASSNAME: GrilRepository
 * DATE: 2021/1/20
 * TIME: 23:51
 * JDK 11
 */
public interface GrilRepository extends JpaRepository<Gril,Integer> {

    /**
     * 通过年龄查询
     * @param age
     * @return
     */
    public List<Gril> findByAge(Integer age);
}
