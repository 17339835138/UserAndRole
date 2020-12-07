package com.wty.controller;

import com.wty.entity.Roles;
import com.wty.service.RolesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * (Roles)表控制层
 *
 * @author makejava
 * @since 2020-12-01 21:15:16
 */
@RestController
public class RolesController {
    /**
     * 服务对象
     */
    @Resource
    private RolesService rolesService;

    @Autowired
    private RestTemplate restTemplate;
    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/selectOne")
    public Roles selectOne(Integer id) {
        return this.rolesService.queryById(id);
    }


    @GetMapping("/queryAllRole")
    public List<Roles> queryAllRole(Roles roles){
        return rolesService.queryAll(roles);
    }
    //得到rid
    @PostMapping("/getRidByRname/{rname}")
    public Integer getRidByRname(@PathVariable String rname){
        System.out.println(rname);
        int rid = rolesService.getRidByRname(rname);
        System.out.println("role:"+rid);
       // String srid= Integer.toString(rid);
        return rid;
    }
}