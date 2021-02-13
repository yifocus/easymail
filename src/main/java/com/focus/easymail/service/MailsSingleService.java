package com.focus.easymail.service;

import com.focus.easymail.entity.MailsSingle;

import java.util.List;

/**
 * (MailsSingle)表服务接口
 *
 * @author makejava
 * @since 2020-07-05 16:49:41
 */
public interface MailsSingleService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    MailsSingle queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<MailsSingle> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param mailsSingle 实例对象
     * @return 实例对象
     */
    MailsSingle insert(MailsSingle mailsSingle);

    /**
     * 修改数据
     *
     * @param mailsSingle 实例对象
     * @return 实例对象
     */
    MailsSingle update(MailsSingle mailsSingle);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}