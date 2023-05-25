package com.zls.zzz.mapper;

import com.zls.zzz.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author zls
 */
@Mapper
public interface UserMapper {

    /**
     * 新增
     *
     * @param user
     * @return
     */
    Boolean add(User user);

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
     * @param user
     * @return
     */
    Boolean edit(User user);

    /**
     * 查询所有
     *
     * @return
     */
    List<User> findAll();

    /**
     * 查询单条
     *
     * @param id
     * @return
     */
    User findOne(int id);

}
