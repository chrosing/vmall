package cn.nasity.provider.mapper;

import cn.nasity.common.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author : Kaisec_Cao
 * @version : 1.0
 * @date : 2019/8/13
 */
@Mapper
public interface UserMapper {

    @Select("SELECT * FROM v_user")
    List<User> findAllUser();
}
