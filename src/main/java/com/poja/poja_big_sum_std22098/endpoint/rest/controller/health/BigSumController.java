package com.poja.poja_big_sum_std22098.endpoint.rest.controller.health;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;

@RestController
public class BigSumController {
    @GetMapping("/big-sum/{a}/{b}")
    public BigInteger bigSum(@PathVariable BigInteger a, @PathVariable BigInteger b){
        return  a.add(b);
    }
}
