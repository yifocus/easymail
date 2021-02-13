package com.focus.easymail.dao;

import com.focus.easymail.entity.CustomerCountry;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (CustomerCountry)表数据库访问层
 *
 * @author makejava
 * @since 2020-07-05 16:49:40
 */
public interface CustomerCountryDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    CustomerCountry queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<CustomerCountry> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param customerCountry 实例对象
     * @return 对象列表
     */
    List<CustomerCountry> queryAll(CustomerCountry customerCountry);

    /**
     * 新增数据
     *
     * @param customerCountry 实例对象
     * @return 影响行数
     */
    int insert(CustomerCountry customerCountry);

    /**
     * 修改数据
     *
     * @param customerCountry 实例对象
     * @return 影响行数
     */
    int update(CustomerCountry customerCountry);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}