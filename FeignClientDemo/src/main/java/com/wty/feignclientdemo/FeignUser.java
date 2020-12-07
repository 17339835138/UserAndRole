package com.wty.feignclientdemo;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * 相当于dao层
 * */
@FeignClient("user")
public interface FeignUser {

    @PostMapping("/getUidByUsername/{username}")
    Integer getUsername(@PathVariable String username);
}
