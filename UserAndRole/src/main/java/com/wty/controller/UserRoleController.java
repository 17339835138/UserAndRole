package com.wty.controller;

import com.wty.entity.UserRole;
import com.wty.service.UserRoleService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Map;

/**
 * (UserRole)表控制层
 *
 * @author makejava
 * @since 2020-12-02 11:23:16
 */
@RestController
public class UserRoleController {
    /**
     * 服务对象
     */
    @Resource
    private UserRoleService userRoleService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public UserRole selectOne(Integer id) {
        return this.userRoleService.queryById(id);
    }
    /**
     * 根据uid和rid插入uid和rid
     * */
    @PostMapping("/insertUserRole/{uid}&{rid}")
    public Boolean insertUserRole(@PathVariable Integer uid,@PathVariable Integer rid){
        System.out.println();
        System.out.println("insertuid:"+uid);
        System.out.println("insertrid:"+rid);
        //boolean flag = userRoleService.insert(uid, rid);
        return userRoleService.insert(uid, rid);
    }

}