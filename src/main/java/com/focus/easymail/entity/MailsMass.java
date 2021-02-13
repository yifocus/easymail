package com.focus.easymail.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * (MailsMass)实体类
 *
 * @author makejava
 * @since 2020-07-05 16:49:40
 */
public class MailsMass implements Serializable {
    private static final long serialVersionUID = 641232814274926905L;
    
    private Integer id;
    
    private String senderMail;
    /**
    * 发送人用户id
    */
    private Integer sendUserId;
    /**
    * 发送人信息
    */
    private String sendInfo;
    /**
    * 发送标题
    */
    private String title;
    /**
    * 发送正文
    */
    private String body;
    /**
    * 状态：-1 部分发送失败， 0 发送中， 1 发送完成全部成功， 
    */
    private String status;
    /**
    * 附件地址
    */
    private String attachment;
    
    private Date createDate;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSenderMail() {
        return senderMail;
    }

    public void setSenderMail(String senderMail) {
        this.senderMail = senderMail;
    }

    public Integer getSendUserId() {
        return sendUserId;
    }

    public void setSendUserId(Integer sendUserId) {
        this.sendUserId = sendUserId;
    }

    public String getSendInfo() {
        return sendInfo;
    }

    public void setSendInfo(String sendInfo) {
        this.sendInfo = sendInfo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAttachment() {
        return attachment;
    }

    public void setAttachment(String attachment) {
        this.attachment = attachment;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

}