package com.focus.easymail.controller;

import com.focus.easymail.entity.MailsRevicers;
import com.focus.easymail.service.MailsRevicersService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (MailsRevicers)表控制层
 *
 * @author makejava
 * @since 2021-02-13 19:12:12
 */
@RestController
@RequestMapping("mailsRevicers")
public class MailsRevicersController {
    /**
     * 服务对象
     */
    @Resource
    private MailsRevicersService mailsRevicersService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public MailsRevicers selectOne(Integer id) {
        return this.mailsRevicersService.queryById(id);
    }

}
