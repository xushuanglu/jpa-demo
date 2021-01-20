package com.jpa;/**
 * Created with IntelliJ IDEA
 * USER:xushuanglu
 * CLASSNAME: Gril
 * DATE: 2021/1/20
 * TIME: 23:49
 * JDK 11
 */

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @ClassName Gril
 * @Description TODO
 * @Auther xushu
 * @Date 2021/1/20
 * @Time 23:49
 * @Version v1.0
 **/
@Entity
public class Gril {

    @Id
    @GeneratedValue
    private Integer id;

    private String size;

    private Integer age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
