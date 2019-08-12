package cn.nasity.common.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户表
 * @author Kaisec_Cao
 * @version : 1.0
 * @date : 2019/7/28
 */
@Data
public class User implements Serializable{

    /**
     * Id
     */
    private String id;

    /**
     * 用户姓名
     */
    private String userName;

    /**
     * 用户性别
     */
    private Integer sex;

    /**
     * 密码
     */
    private String password;

}