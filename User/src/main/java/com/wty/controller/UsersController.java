package com.wty.controller;

import com.wty.entity.Users;
import com.wty.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * (Users)表控制层
 *
 * @author makejava
 * @since 2020-11-30 23:51:07
 */
@RestController
public class UsersController {
    /**
     * 服务对象
     */
    @Autowired
    private UsersService usersService;
    @Autowired
    private RestTemplate restTemplate;

    /**
     * 通过主键查询单条数据
     *
     * @param
     * @return 单条数据
     */
    @GetMapping("/selectOne")
    public Users selectOne(@RequestParam("uid") Integer uid) {
        Users users = usersService.queryById(uid);
        System.out.println(users);
        return this.usersService.queryById(uid);

    }
    @GetMapping("/queryAll")
    public List<Users> queryAll(Users users){
        return usersService.queryAll(users);
    }
    //得到uid
    @PostMapping("/getUidByUsername/{username}")
    public Integer getUidByUsername(@PathVariable String username){
        System.out.println(username);
        Integer uid = usersService.getUidByUsername(username);
        System.out.println("user:"+uid);
        //String suid= Integer.toString(uid);
        return uid;
    }
}