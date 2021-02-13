package com.focus.easymail.service;

import com.focus.easymail.entity.ColorMark;

import java.util.List;

/**
 * (ColorMark)表服务接口
 *
 * @author makejava
 * @since 2021-02-13 19:12:00
 */
public interface ColorMarkService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    ColorMark queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<ColorMark> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param colorMark 实例对象
     * @return 实例对象
     */
    ColorMark insert(ColorMark colorMark);

    /**
     * 修改数据
     *
     * @param colorMark 实例对象
     * @return 实例对象
     */
    ColorMark update(ColorMark colorMark);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
