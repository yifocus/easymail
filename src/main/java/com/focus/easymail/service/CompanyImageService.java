package com.focus.easymail.service;

import com.focus.easymail.entity.CompanyImage;

import java.util.List;

/**
 * (CompanyImage)表服务接口
 *
 * @author makejava
 * @since 2020-07-05 16:49:40
 */
public interface CompanyImageService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    CompanyImage queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<CompanyImage> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param companyImage 实例对象
     * @return 实例对象
     */
    CompanyImage insert(CompanyImage companyImage);

    /**
     * 修改数据
     *
     * @param companyImage 实例对象
     * @return 实例对象
     */
    CompanyImage update(CompanyImage companyImage);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}