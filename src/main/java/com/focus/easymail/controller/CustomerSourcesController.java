package com.focus.easymail.controller;

import com.focus.easymail.entity.CustomerSources;
import com.focus.easymail.service.CustomerSourcesService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (CustomerSources)表控制层
 *
 * @author makejava
 * @since 2020-07-05 16:49:39
 */
@RestController
@RequestMapping("customerSources")
public class CustomerSourcesController {
    /**
     * 服务对象
     */
    @Resource
    private CustomerSourcesService customerSourcesService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public CustomerSources selectOne(Integer id) {
        return this.customerSourcesService.queryById(id);
    }

}