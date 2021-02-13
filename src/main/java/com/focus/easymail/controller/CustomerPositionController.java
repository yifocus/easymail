package com.focus.easymail.controller;

import com.focus.easymail.entity.CustomerPosition;
import com.focus.easymail.service.CustomerPositionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (CustomerPosition)表控制层
 *
 * @author makejava
 * @since 2020-07-05 16:49:40
 */
@RestController
@RequestMapping("customerPosition")
public class CustomerPositionController {
    /**
     * 服务对象
     */
    @Resource
    private CustomerPositionService customerPositionService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public CustomerPosition selectOne(Integer id) {
        return this.customerPositionService.queryById(id);
    }

}