package com.wty.controller;

import com.wty.feignclientdemo.FeignRole;
import com.wty.feignclientdemo.FeignUser;
import com.wty.feignclientdemo.UserAndRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {
    @Autowired
    private FeignUser feignUser;
    @Autowired
    private FeignRole feignRole;
    @Autowired
    private UserAndRole userAndRole;

    @GetMapping("/hahaha")
    public Boolean insertNews(@RequestParam("username") String username,@RequestParam("rname") String rname){
        Integer uid = feignUser.getUsername(username);
        System.out.println("username::"+uid);
        int rid = feignRole.getRname(rname);
        System.out.println("rname::"+rid);
        return userAndRole.insert(uid,rid);
    }
}
