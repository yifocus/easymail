package com.focus.easymail.controller;

import com.focus.easymail.entity.CustomerTypes;
import com.focus.easymail.service.CustomerTypesService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (CustomerTypes)表控制层
 *
 * @author makejava
 * @since 2021-02-13 19:12:10
 */
@RestController
@RequestMapping("customerTypes")
public class CustomerTypesController {
    /**
     * 服务对象
     */
    @Resource
    private CustomerTypesService customerTypesService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public CustomerTypes selectOne(Integer id) {
        return this.customerTypesService.queryById(id);
    }

}
