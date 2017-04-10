package com.ouyang.controller;

import com.ouyang.model.User;
import com.ouyang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


/**
 * Created by Duning Ouyang on 2017/4/9.
 */
@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserService userService;
    @RequestMapping(value = "/select")
    public ModelAndView insert() {
        ModelAndView result = new ModelAndView("index");
        List<User> userList = userService.getAll();
        result.addObject("userList",userList);
        return result;
    }
}
