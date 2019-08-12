package cn.nasity.provider.service.impl;

import cn.nasity.common.entity.User;
import cn.nasity.common.service.UserService;
import cn.nasity.provider.mapper.UserMapper;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author : Kaisec_Cao
 * @version : 1.0
 * @date : 2019/8/13
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 查询用户
     *
     * @return
     */
    @Override
    public User findUser() {
        List<User> allUser = userMapper.findAllUser();
        return allUser.get(0);
    }
}
