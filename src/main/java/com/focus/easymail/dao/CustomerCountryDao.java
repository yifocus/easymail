package com.focus.easymail.dao;

import com.focus.easymail.entity.CustomerCountry;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (CustomerCountry)表数据库访问层
 *
 * @author makejava
 * @since 2021-02-13 19:12:05
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
     * @param limit  查询条数
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
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<CustomerCountry> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<CustomerCountry> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<CustomerCountry> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<CustomerCountry> entities);

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

