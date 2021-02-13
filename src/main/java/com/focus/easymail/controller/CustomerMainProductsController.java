package com.focus.easymail.controller;

import com.focus.easymail.entity.CustomerMainProducts;
import com.focus.easymail.service.CustomerMainProductsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (CustomerMainProducts)表控制层
 *
 * @author makejava
 * @since 2021-02-13 19:12:07
 */
@RestController
@RequestMapping("customerMainProducts")
public class CustomerMainProductsController {
    /**
     * 服务对象
     */
    @Resource
    private CustomerMainProductsService customerMainProductsService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public CustomerMainProducts selectOne(Integer id) {
        return this.customerMainProductsService.queryById(id);
    }

}
