package com.focus.easymail.controller;

import com.focus.easymail.entity.Company;
import com.focus.easymail.service.CompanyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (Company)表控制层
 *
 * @author makejava
 * @since 2020-07-05 16:49:40
 */
@RestController
@RequestMapping("company")
public class CompanyController {
    /**
     * 服务对象
     */
    @Resource
    private CompanyService companyService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Company selectOne(Integer id) {
        return this.companyService.queryById(id);
    }

}