package com.focus.easymail.controller;

import com.focus.easymail.entity.MailsMass;
import com.focus.easymail.service.MailsMassService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (MailsMass)表控制层
 *
 * @author makejava
 * @since 2020-07-05 16:49:40
 */
@RestController
@RequestMapping("mailsMass")
public class MailsMassController {
    /**
     * 服务对象
     */
    @Resource
    private MailsMassService mailsMassService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public MailsMass selectOne(Integer id) {
        return this.mailsMassService.queryById(id);
    }

}