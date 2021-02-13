package com.focus.easymail.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * (MailsRevicers)实体类
 *
 * @author makejava
 * @since 2020-07-05 16:49:41
 */
public class MailsRevicers implements Serializable {
    private static final long serialVersionUID = -77451976613926185L;
    
    private Integer id;
    
    private Integer receiverUserId;
    
    private String receiverMail;
    
    private String receoverInfo;
    
    private String status;
    
    private Date sendDate;
    
    private Date sendTimes;
    
    private String errReason;
    
    private String smtp;
    
    private String url;
    
    private String title;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getReceiverUserId() {
        return receiverUserId;
    }

    public void setReceiverUserId(Integer receiverUserId) {
        this.receiverUserId = receiverUserId;
    }

    public String getReceiverMail() {
        return receiverMail;
    }

    public void setReceiverMail(String receiverMail) {
        this.receiverMail = receiverMail;
    }

    public String getReceoverInfo() {
        return receoverInfo;
    }

    public void setReceoverInfo(String receoverInfo) {
        this.receoverInfo = receoverInfo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getSendDate() {
        return sendDate;
    }

    public void setSendDate(Date sendDate) {
        this.sendDate = sendDate;
    }

    public Date getSendTimes() {
        return sendTimes;
    }

    public void setSendTimes(Date sendTimes) {
        this.sendTimes = sendTimes;
    }

    public String getErrReason() {
        return errReason;
    }

    public void setErrReason(String errReason) {
        this.errReason = errReason;
    }

    public String getSmtp() {
        return smtp;
    }

    public void setSmtp(String smtp) {
        this.smtp = smtp;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}