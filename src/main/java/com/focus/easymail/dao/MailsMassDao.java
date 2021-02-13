package com.focus.easymail.dao;

import com.focus.easymail.entity.MailsMass;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (MailsMass)表数据库访问层
 *
 * @author makejava
 * @since 2020-07-05 16:49:40
 */
public interface MailsMassDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    MailsMass queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<MailsMass> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param mailsMass 实例对象
     * @return 对象列表
     */
    List<MailsMass> queryAll(MailsMass mailsMass);

    /**
     * 新增数据
     *
     * @param mailsMass 实例对象
     * @return 影响行数
     */
    int insert(MailsMass mailsMass);

    /**
     * 修改数据
     *
     * @param mailsMass 实例对象
     * @return 影响行数
     */
    int update(MailsMass mailsMass);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}