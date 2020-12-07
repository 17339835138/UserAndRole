package com.wty.feignclientdemo;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("userandrole")
public interface UserAndRole {

    @PostMapping("/insertUserRole/{uid}&{rid}")
    Boolean insert(@PathVariable Integer uid,@PathVariable Integer rid);
}
