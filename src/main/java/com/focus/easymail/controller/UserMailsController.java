package com.focus.easymail.controller;

import com.focus.easymail.controller.vo.BindUserMailsRequest;
import com.focus.easymail.controller.vo.ResponseResult;
import com.focus.easymail.entity.UserMails;
import com.focus.easymail.service.UserMailsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 用户邮箱绑定表， 用于群发邮箱， 和收件邮箱(UserMails)表控制层
 *
 * @author makejava
 * @since 2020-02-23 20:13:18
 */
@RestController
@RequestMapping("userMails")
public class UserMailsController {

    Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * 服务对象
     */
    @Resource
    private UserMailsService userMailsService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public UserMails selectOne(Integer id) {
        return this.userMailsService.queryById(id);
    }

    /**
     * 绑定用户的邮箱相关的邮箱
     * isReceiveMail = 0 群发的邮箱
     * isReceiveMail = 1 用户的接收邮箱
     *
     * @param request
     * @return
     */
    @PostMapping("bindEmails")
    public ResponseResult bindEmails(@RequestBody BindUserMailsRequest request) {

        ResponseResult responseResult = new ResponseResult();

        try {
            for (UserMails userMail : request.getUserMails()) {
                userMailsService.insert(userMail);
            }
        } catch (Exception e) {
            logger.error("绑bind email error败", e);
            return ResponseResult.fail("绑bind email error");
        }

        return ResponseResult.success("bind email success");
    }

    /**
     * 大获取接受邮箱
     *
     * @param userId
     * @return
     */
    public ResponseResult getReceviceMail(int userId) {
        // 获取接收邮箱
        return null;
    }

    /**
     * 获取用户的群发邮箱
     *
     * @param userId
     * @return
     */
    public ResponseResult getSenderMails(int userId) {
        // 获取发送邮箱
        return null;
    }

}