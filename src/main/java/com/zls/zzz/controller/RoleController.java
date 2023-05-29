package com.zls.zzz.controller;

import com.zls.zzz.entity.Role;
import com.zls.zzz.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author zls
 */
@RestController
@RequestMapping("/role")
public class RoleController {

    @Autowired
    private RoleService roleService;

    /**
     * 新增
     *
     * @param role
     * @return boolean
     */
    @PostMapping("/add")
    public Boolean add(Role role) {
        return roleService.add(role);
    }

    /**
     * 删除
     *
     * @param id
     * @return
     */
    @GetMapping("/del/{id}")
    public Boolean del(@PathVariable int id) {
        return roleService.del(id);
    }

    /**
     * 修改
     *
     * @param role
     * @return
     */
    @PostMapping("/edit")
    public Boolean edit(Role role) {
        return roleService.edit(role);
    }

    /**
     * 查询所有
     *
     * @return
     */
    @GetMapping("/findAll")
    public List<Role> findAll() {
        return roleService.findAll();
    }

    /**
     * 查询单条
     *
     * @param id
     * @return
     */
    @GetMapping("/findOne/{id}")
    public Role findOne(@PathVariable int id) {
        return roleService.findOne(id);
    }

}
