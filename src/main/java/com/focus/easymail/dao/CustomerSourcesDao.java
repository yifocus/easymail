package com.focus.easymail.dao;

import com.focus.easymail.entity.CustomerSources;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (CustomerSources)表数据库访问层
 *
 * @author makejava
 * @since 2021-02-13 19:12:08
 */
public interface CustomerSourcesDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    CustomerSources queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<CustomerSources> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param customerSources 实例对象
     * @return 对象列表
     */
    List<CustomerSources> queryAll(CustomerSources customerSources);

    /**
     * 新增数据
     *
     * @param customerSources 实例对象
     * @return 影响行数
     */
    int insert(CustomerSources customerSources);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<CustomerSources> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<CustomerSources> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<CustomerSources> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<CustomerSources> entities);

    /**
     * 修改数据
     *
     * @param customerSources 实例对象
     * @return 影响行数
     */
    int update(CustomerSources customerSources);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}
