package com.zls.zzz.service;

import com.zls.zzz.entity.Role;
import com.zls.zzz.mapper.RoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zls
 */
@Service
public class RoleService {

    @Autowired
    private RoleMapper roleMapper;

    /**
     * 新增
     *
     * @param role
     * @return
     */
    public Boolean add(Role role) {
        return roleMapper.add(role);
    }

    /**
     * 删除
     *
     * @param id
     * @return
     */
    public Boolean del(int id) {
        return roleMapper.del(id);
    }

    /**
     * 修改
     *
     * @param role
     * @return
     */
    public Boolean edit(Role role) {
        return roleMapper.edit(role);
    }

    /**
     * 查询所有
     *
     * @return
     */
    public List<Role> findAll() {
        return roleMapper.findAll();
    }

    /**
     * 查询单条
     *
     * @param id
     * @return
     */
    public Role findOne(int id) {
        return roleMapper.findOne(id);
    }

}
