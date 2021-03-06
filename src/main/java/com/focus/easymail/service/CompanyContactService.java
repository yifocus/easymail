package com.focus.easymail.service;

import com.focus.easymail.entity.CompanyContact;

import java.util.List;

/**
 * (CompanyContact)表服务接口
 *
 * @author makejava
 * @since 2020-07-05 16:49:40
 */
public interface CompanyContactService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    CompanyContact queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<CompanyContact> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param companyContact 实例对象
     * @return 实例对象
     */
    CompanyContact insert(CompanyContact companyContact);

    /**
     * 修改数据
     *
     * @param companyContact 实例对象
     * @return 实例对象
     */
    CompanyContact update(CompanyContact companyContact);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}