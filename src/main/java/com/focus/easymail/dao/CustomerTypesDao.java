package com.focus.easymail.dao;

import com.focus.easymail.entity.CustomerTypes;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (CustomerTypes)表数据库访问层
 *
 * @author makejava
 * @since 2021-02-13 19:12:09
 */
public interface CustomerTypesDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    CustomerTypes queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<CustomerTypes> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param customerTypes 实例对象
     * @return 对象列表
     */
    List<CustomerTypes> queryAll(CustomerTypes customerTypes);

    /**
     * 新增数据
     *
     * @param customerTypes 实例对象
     * @return 影响行数
     */
    int insert(CustomerTypes customerTypes);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<CustomerTypes> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<CustomerTypes> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<CustomerTypes> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<CustomerTypes> entities);

    /**
     * 修改数据
     *
     * @param customerTypes 实例对象
     * @return 影响行数
     */
    int update(CustomerTypes customerTypes);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

