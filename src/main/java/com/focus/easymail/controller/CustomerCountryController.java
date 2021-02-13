package com.focus.easymail.controller;

import com.focus.easymail.entity.CustomerCountry;
import com.focus.easymail.service.CustomerCountryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (CustomerCountry)表控制层
 *
 * @author makejava
 * @since 2020-07-05 16:49:40
 */
@RestController
@RequestMapping("customerCountry")
public class CustomerCountryController {
    /**
     * 服务对象
     */
    @Resource
    private CustomerCountryService customerCountryService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public CustomerCountry selectOne(Integer id) {
        return this.customerCountryService.queryById(id);
    }

}