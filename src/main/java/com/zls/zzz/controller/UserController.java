package com.zls.zzz.controller;

import com.zls.zzz.entity.User;
import com.zls.zzz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author zls
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 新增
     *
     * @param user
     * @return boolean
     */
    @PostMapping("/add")
    public Boolean add(User user) {
        return userService.add(user);
    }

    /**
     * 删除
     *
     * @param id
     * @return
     */
    @GetMapping("/del/{id}")
    public Boolean del(@PathVariable int id) {
        return userService.del(id);
    }

    /**
     * 修改
     *
     * @param user
     * @return
     */
    @PostMapping("/edit")
    public Boolean edit(User user) {
        return userService.edit(user);
    }

    /**
     * 查询所有
     *
     * @return
     */
//    @GetMapping("/findAll")
//    public List<User> findAll() {
//        return userService.findAll();
//    }

    /**
     * 查询单条
     *
     * @param id
     * @return
     */
    @GetMapping("/findOne/{id}")
    public User findOne(@PathVariable int id) {
        return userService.findOne(id);
    }

}
