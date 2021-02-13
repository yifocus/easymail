package com.focus.easymail.controller;

import com.focus.easymail.entity.ColorMark;
import com.focus.easymail.service.ColorMarkService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (ColorMark)表控制层
 *
 * @author makejava
 * @since 2020-07-05 16:49:41
 */
@RestController
@RequestMapping("colorMark")
public class ColorMarkController {
    /**
     * 服务对象
     */
    @Resource
    private ColorMarkService colorMarkService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public ColorMark selectOne(Integer id) {
        return this.colorMarkService.queryById(id);
    }

}