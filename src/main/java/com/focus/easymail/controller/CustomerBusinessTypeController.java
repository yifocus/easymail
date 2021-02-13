package com.focus.easymail.controller;

import com.focus.easymail.entity.CustomerBusinessType;
import com.focus.easymail.service.CustomerBusinessTypeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (CustomerBusinessType)表控制层
 *
 * @author makejava
 * @since 2021-02-13 19:12:05
 */
@RestController
@RequestMapping("customerBusinessType")
public class CustomerBusinessTypeController {
    /**
     * 服务对象
     */
    @Resource
    private CustomerBusinessTypeService customerBusinessTypeService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public CustomerBusinessType selectOne(Integer id) {
        return this.customerBusinessTypeService.queryById(id);
    }

}
