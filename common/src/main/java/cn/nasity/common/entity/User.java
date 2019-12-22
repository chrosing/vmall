package cn.nasity.common.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.Date;

/**
 * 用户表
 *
 * @author : Kaisec_Cao
 * @version : 1.font
 * @date : 2018/9/25 0003
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@Table(name = "v_user")
public class User implements Serializable {

	private static final long serialVersionUID = 8445754021395220809L;

	/**
	 * Id
	 */
	@Id
	private Long userId;

	/**
	 * 用户登录名
	 */
	@Column
	private String userName;

	/**
	 * 用户显示姓名
	 */
	@Column
	private String userNameEtc;

	/**
	 * 用户密码
	 */
	@NotEmpty(message = "密码不能为空！")
	@Length(min = 6, max = 18, message = "密码长度只能在6-18之间！")
	private String userPass;

	/**
	 * 用户邮箱
	 */
	@Email(message = "用户邮箱不能为空")
	private String userEmail;

	/**
	 * 用户手机
	 */
	@Length(message = "手机号格式不正确", max = 11)
	private String userPhone;

	/**
	 * 用户性别 0男 1女 2未知
	 */
	private Integer userSex;

	/**
	 * 用户登录权限
	 */
	private Integer role;

	/**
	 * 用户状态 1.正常 2.删除 3.有效期禁止登陆
	 */
	private Integer delStatus = 1;

	/**
	 * 最后登陆时间
	 */
	private Date lastLoginTime;

	/**
	 * 用户盐值
	 */
	private String salt;

	/**
	 * 用户头像
	 */
	private String userPhoto;

	/**
	 * 创建时间
	 */
	private Date createTime;

	/**
	 * 最后一次修改时间
	 */
	private Date updateTime;
}
