package com.focus.easymail.service;

import com.focus.easymail.entity.CustomerSources;

import java.util.List;

/**
 * (CustomerSources)表服务接口
 *
 * @author makejava
 * @since 2021-02-13 19:12:08
 */
public interface CustomerSourcesService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    CustomerSources queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<CustomerSources> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param customerSources 实例对象
     * @return 实例对象
     */
    CustomerSources insert(CustomerSources customerSources);

    /**
     * 修改数据
     *
     * @param customerSources 实例对象
     * @return 实例对象
     */
    CustomerSources update(CustomerSources customerSources);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
