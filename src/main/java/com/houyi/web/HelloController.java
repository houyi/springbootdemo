package com.houyi.web;

import com.houyi.pojo.User;
import com.houyi.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//不用加ResponseBody
@Slf4j
@RestController
@RequestMapping("user")
public class HelloController {

    //注入service层
    @Autowired
    public UserService userService;

    //查询id
    //yml里面配置路径path
    @GetMapping("{id}")
    public User hello(@PathVariable("id") Long id) {
        return userService.querById(id);
    }



}
