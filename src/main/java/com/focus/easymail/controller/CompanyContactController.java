package com.focus.easymail.controller;

import com.focus.easymail.entity.CompanyContact;
import com.focus.easymail.service.CompanyContactService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (CompanyContact)表控制层
 *
 * @author makejava
 * @since 2020-07-05 16:49:40
 */
@RestController
@RequestMapping("companyContact")
public class CompanyContactController {
    /**
     * 服务对象
     */
    @Resource
    private CompanyContactService companyContactService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public CompanyContact selectOne(Integer id) {
        return this.companyContactService.queryById(id);
    }

}