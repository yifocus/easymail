package com.focus.easymail.dao;

import com.focus.easymail.entity.UserMails;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 用户邮箱绑定表， 用于群发邮箱， 和收件邮箱(UserMails)表数据库访问层
 *
 * @author makejava
 * @since 2020-02-23 20:13:17
 */
public interface UserMailsDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    UserMails queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<UserMails> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param userMails 实例对象
     * @return 对象列表
     */
    List<UserMails> queryAll(UserMails userMails);

    /**
     * 新增数据
     *
     * @param userMails 实例对象
     * @return 影响行数
     */
    int insert(UserMails userMails);

    /**
     * 修改数据
     *
     * @param userMails 实例对象
     * @return 影响行数
     */
    int update(UserMails userMails);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}