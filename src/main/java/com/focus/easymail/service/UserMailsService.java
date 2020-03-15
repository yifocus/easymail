package com.focus.easymail.service;

import com.focus.easymail.entity.UserMails;

import java.util.List;

/**
 * 用户邮箱绑定表， 用于群发邮箱， 和收件邮箱(UserMails)表服务接口
 *
 * @author makejava
 * @since 2020-02-23 20:13:18
 */
public interface UserMailsService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    UserMails queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<UserMails> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param userMails 实例对象
     * @return 实例对象
     */
    UserMails insert(UserMails userMails);

    /**
     * 修改数据
     *
     * @param userMails 实例对象
     * @return 实例对象
     */
    UserMails update(UserMails userMails);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}