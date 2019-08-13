package cn.nasity.customer.controller;

import cn.nasity.common.entity.User;
import cn.nasity.common.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : Kaisec_Cao
 * @version : 1.0
 * @date : 2019/8/13
 */
@RestController
@RequestMapping("admin/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping(value = "/getUser")
    public String findAllUser() {
        User user = userService.findUser();
        return user.getId() + user.getPassword() + user.getUserName();
    }
}
