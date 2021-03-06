package com.wty.service;

import com.wty.entity.Roles;

import java.util.List;

/**
 * (Roles)表服务接口
 *
 * @author makejava
 * @since 2020-12-01 21:15:16
 */
public interface RolesService {

    /**
     * 通过ID查询单条数据
     *
     * @param rid 主键
     * @return 实例对象
     */
    Roles queryById(Integer rid);


    List<Roles> queryAll(Roles roles);

    int getRidByRname(String rname);
    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Roles> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param roles 实例对象
     * @return 实例对象
     */
    Roles insert(Roles roles);

    /**
     * 修改数据
     *
     * @param roles 实例对象
     * @return 实例对象
     */
    Roles update(Roles roles);

    /**
     * 通过主键删除数据
     *
     * @param rid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer rid);

}