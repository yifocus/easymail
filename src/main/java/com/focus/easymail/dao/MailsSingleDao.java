package com.focus.easymail.dao;

import com.focus.easymail.entity.MailsSingle;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (MailsSingle)表数据库访问层
 *
 * @author makejava
 * @since 2020-07-05 16:49:41
 */
public interface MailsSingleDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    MailsSingle queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<MailsSingle> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param mailsSingle 实例对象
     * @return 对象列表
     */
    List<MailsSingle> queryAll(MailsSingle mailsSingle);

    /**
     * 新增数据
     *
     * @param mailsSingle 实例对象
     * @return 影响行数
     */
    int insert(MailsSingle mailsSingle);

    /**
     * 修改数据
     *
     * @param mailsSingle 实例对象
     * @return 影响行数
     */
    int update(MailsSingle mailsSingle);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}