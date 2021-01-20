package com.jpa;/**
 * Created with IntelliJ IDEA
 * USER:xushuanglu
 * CLASSNAME: GrilController
 * DATE: 2021/1/20
 * TIME: 23:52
 * JDK 11
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * @ClassName GrilController
 * @Description TODO
 * @Auther xushu
 * @Date 2021/1/20
 * @Time 23:52
 * @Version v1.0
 **/
@RestController
@RequestMapping("gril")
public class GrilController {

    @Autowired
    private GrilRepository grilRepository;

    @GetMapping(value = "/grilList")
    public List<Gril> grilList(){
        return grilRepository.findAll();
    }

    @GetMapping(value = "/grilFindOne/{id}")
    public Gril grilFindOne(@PathVariable("id") Integer id){
        Optional<Gril> optional = grilRepository.findById(id);
        return  optional.get();
    }

    @PostMapping(value = "/grilAdd")
    public Gril grilAdd(@RequestParam("size") String size,@RequestParam("age") Integer age){
        Gril gril = new Gril();
        gril.setSize(size);
        gril.setAge(age);
        return grilRepository.save(gril);
    }

    @PutMapping(value = "/grilUpdate/{id}")
    public Gril grilUpdate(@PathVariable("id") Integer id,
                           @RequestParam("size") String size,@RequestParam("age") Integer age){
        Gril gril = new Gril();
        gril.setId(id);
        gril.setSize(size);
        gril.setAge(age);
        return grilRepository.save(gril);
    }

    @DeleteMapping(value = "/grilDelete/{id}")
    public void grilDelete(@PathVariable("id") Integer id){
        Gril gril = new Gril();
        gril.setId(id);
        grilRepository.delete(gril);
    }

    @GetMapping(value = "/findByAge/{age}")
    public List<Gril> findByAge(@PathVariable("age") Integer age) {
        return grilRepository.findByAge(age);
    }

}
