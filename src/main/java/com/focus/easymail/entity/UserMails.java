package com.focus.easymail.entity;

import lombok.Data;

import java.util.Date;
import java.io.Serializable;

/**
 * 用户邮箱绑定表， 用于群发邮箱， 和收件邮箱(UserMails)实体类
 *
 * @author makejava
 * @since 2020-02-23 20:13:16
 */
@Data
public class UserMails implements Serializable {
    private static final long serialVersionUID = 714434981830425677L;
    /**
     * 主键id
     */
    private Integer id;
    /**
     * 关联用户id
     */
    private Integer userId;
    /**
     * 邮件地址
     */
    private String eimail;

    private Date createTime;
    /**
     * 邮箱状态 1 表示正常状态， -1 表示邮箱删除
     */
    private Integer status;
    /**
     * 是否是用户的接收邮箱，0 不是， 1 是用户接收的邮箱
     */
    private Integer isReceiveMail;
    /**
     * 邮件服务器地址
     */
    private String mailHost;
    /**
     * 邮箱密码
     */
    private String mailPassword;
    /**
     * 邮箱端口号
     */
    private String mailPort;
    /**
     * 邮箱协议类型Pop3  stmpt 等
     */
    private String mailProtocol;


}