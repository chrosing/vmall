package cn.nasity.customer.controller;

import cn.nasity.common.entity.User;
import cn.nasity.common.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author : Kaisec_Cao
 * @version : 1.0
 * @date : 2019/8/13
 */
@Controller
@RequestMapping("admin/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public String findAllUser() {
        User user = userService.findUser();
        System.out.println(user.getUserName());
        return user.getUserName();
    }
}
