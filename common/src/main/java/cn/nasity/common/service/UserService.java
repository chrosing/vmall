package cn.nasity.common.service;

import cn.nasity.common.entity.User;
import org.springframework.stereotype.Service;

/**
 * @author : Kaisec_Cao
 * @version : 1.0
 * @date : 2019/8/12
 */
@Service
public interface UserService {

    /**
     * 查询用户
     * @return
     */
    User findUser();
}
