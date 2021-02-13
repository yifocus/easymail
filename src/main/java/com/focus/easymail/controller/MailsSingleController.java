package com.focus.easymail.controller;

import com.focus.easymail.entity.MailsSingle;
import com.focus.easymail.service.MailsSingleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (MailsSingle)表控制层
 *
 * @author makejava
 * @since 2021-02-13 19:12:13
 */
@RestController
@RequestMapping("mailsSingle")
public class MailsSingleController {
    /**
     * 服务对象
     */
    @Resource
    private MailsSingleService mailsSingleService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public MailsSingle selectOne(Integer id) {
        return this.mailsSingleService.queryById(id);
    }

}
