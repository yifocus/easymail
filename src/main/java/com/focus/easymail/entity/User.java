package com.focus.easymail.entity;

import lombok.Data;

import java.util.Date;
import java.io.Serializable;

/**
 * (User)实体类
 *
 * @author makejava
 * @since 2020-02-23 11:57:59
 */
@Data
public class User implements Serializable {
    private static final long serialVersionUID = 725777060959036018L;
    /**
     * 主键id
     */
    private Integer id;
    /**
     * 登录名称
     */
    private String username;
    /**
     * 密码
     */
    private String password;
    /**
     * 用户名称
     */
    private String name;
    /**
     * 员工编号
     */
    private String employno;
    /**
     * 用户状态
     */
    private Integer status;

    /**
     * 创建时间
     */
    private Date createtime;
    /**
     * 更新时间
     */
    private Date updatetime;

}