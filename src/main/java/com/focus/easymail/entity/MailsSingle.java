package com.focus.easymail.entity;

import java.io.Serializable;

/**
 * (MailsSingle)实体类
 *
 * @author makejava
 * @since 2020-07-05 16:49:41
 */
public class MailsSingle implements Serializable {
    private static final long serialVersionUID = 519289722308757948L;
    
    private Integer id;
    /**
    * 发件人
    */
    private String sender;
    /**
    * 发邮人邮箱
    */
    private String senderMail;
    /**
    * 发件人用户 id
    */
    private Integer senderUserId;
    /**
    * 接收人邮箱，多个则使用逗号隔开
    */
    private String receiverMails;
    /**
    * 抄送人信息，名字+邮箱地址
    */
    private String receiversInfo;
    /**
    * 抄送人邮箱，逗号隔开
    */
    private String ccMails;
    /**
    * 抄送人信息 名字+邮箱
    */
    private String ccInfo;
    /**
    * -1 发送失败， 0 发送中， 1 发送成功
    */
    private Integer stats;
    
    private String title;
    
    private Object body;
    /**
    * 附件硬盘地址
    */
    private String attachment;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getSenderMail() {
        return senderMail;
    }

    public void setSenderMail(String senderMail) {
        this.senderMail = senderMail;
    }

    public Integer getSenderUserId() {
        return senderUserId;
    }

    public void setSenderUserId(Integer senderUserId) {
        this.senderUserId = senderUserId;
    }

    public String getReceiverMails() {
        return receiverMails;
    }

    public void setReceiverMails(String receiverMails) {
        this.receiverMails = receiverMails;
    }

    public String getReceiversInfo() {
        return receiversInfo;
    }

    public void setReceiversInfo(String receiversInfo) {
        this.receiversInfo = receiversInfo;
    }

    public String getCcMails() {
        return ccMails;
    }

    public void setCcMails(String ccMails) {
        this.ccMails = ccMails;
    }

    public String getCcInfo() {
        return ccInfo;
    }

    public void setCcInfo(String ccInfo) {
        this.ccInfo = ccInfo;
    }

    public Integer getStats() {
        return stats;
    }

    public void setStats(Integer stats) {
        this.stats = stats;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Object getBody() {
        return body;
    }

    public void setBody(Object body) {
        this.body = body;
    }

    public String getAttachment() {
        return attachment;
    }

    public void setAttachment(String attachment) {
        this.attachment = attachment;
    }

}