package com.zls.zzz.mapper;

import com.zls.zzz.entity.Role;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author zls
 */
@Mapper
public interface RoleMapper {

    /**
     * 新增
     *
     * @param role
     * @return
     */
    Boolean add(Role role);

    /**
     * 删除
     *
     * @param id
     * @return
     */
    Boolean del(int id);

    /**
     * 修改
     *
     * @param role
     * @return
     */
    Boolean edit(Role role);

    /**
     * 查询所有
     *
     * @return
     */
    List<Role> findAll();

    /**
     * 查询单条
     *
     * @param id
     * @return
     */
    Role findOne(int id);

}
