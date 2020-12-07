package com.wty.feignclientdemo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient("roles")
public interface FeignRole {
    @PostMapping("/getRidByRname/{rname}")
    Integer getRname(@PathVariable String rname);
}
