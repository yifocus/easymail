package com.focus.easymail.controller;

import com.focus.easymail.entity.CompanyImage;
import com.focus.easymail.service.CompanyImageService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (CompanyImage)表控制层
 *
 * @author makejava
 * @since 2020-07-05 16:49:41
 */
@RestController
@RequestMapping("companyImage")
public class CompanyImageController {
    /**
     * 服务对象
     */
    @Resource
    private CompanyImageService companyImageService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public CompanyImage selectOne(Integer id) {
        return this.companyImageService.queryById(id);
    }

}