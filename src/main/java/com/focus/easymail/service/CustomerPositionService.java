package com.focus.easymail.service;

import com.focus.easymail.entity.CustomerPosition;

import java.util.List;

/**
 * (CustomerPosition)表服务接口
 *
 * @author makejava
 * @since 2020-07-05 16:49:40
 */
public interface CustomerPositionService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    CustomerPosition queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<CustomerPosition> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param customerPosition 实例对象
     * @return 实例对象
     */
    CustomerPosition insert(CustomerPosition customerPosition);

    /**
     * 修改数据
     *
     * @param customerPosition 实例对象
     * @return 实例对象
     */
    CustomerPosition update(CustomerPosition customerPosition);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}