package com.focus.easymail.controller.vo;

import com.focus.easymail.entity.UserMails;
import lombok.Data;

import java.util.List;

@Data
public class BindUserMailsRequest {

    // 用户绑定的邮箱
    private List<UserMails> userMails;
}
