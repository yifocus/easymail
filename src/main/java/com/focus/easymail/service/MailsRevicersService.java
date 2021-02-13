package com.focus.easymail.service;

import com.focus.easymail.entity.MailsRevicers;

import java.util.List;

/**
 * (MailsRevicers)表服务接口
 *
 * @author makejava
 * @since 2021-02-13 19:12:12
 */
public interface MailsRevicersService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    MailsRevicers queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<MailsRevicers> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param mailsRevicers 实例对象
     * @return 实例对象
     */
    MailsRevicers insert(MailsRevicers mailsRevicers);

    /**
     * 修改数据
     *
     * @param mailsRevicers 实例对象
     * @return 实例对象
     */
    MailsRevicers update(MailsRevicers mailsRevicers);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
