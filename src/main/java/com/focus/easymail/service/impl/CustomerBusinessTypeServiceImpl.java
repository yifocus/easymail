package com.focus.easymail.service.impl;

import com.focus.easymail.dao.CustomerBusinessTypeDao;
import com.focus.easymail.entity.CustomerBusinessType;
import com.focus.easymail.service.CustomerBusinessTypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (CustomerBusinessType)表服务实现类
 *
 * @author makejava
 * @since 2020-07-05 16:49:41
 */
@Service("customerBusinessTypeService")
public class CustomerBusinessTypeServiceImpl implements CustomerBusinessTypeService {
    @Resource
    private CustomerBusinessTypeDao customerBusinessTypeDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public CustomerBusinessType queryById(Integer id) {
        return this.customerBusinessTypeDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<CustomerBusinessType> queryAllByLimit(int offset, int limit) {
        return this.customerBusinessTypeDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param customerBusinessType 实例对象
     * @return 实例对象
     */
    @Override
    public CustomerBusinessType insert(CustomerBusinessType customerBusinessType) {
        this.customerBusinessTypeDao.insert(customerBusinessType);
        return customerBusinessType;
    }

    /**
     * 修改数据
     *
     * @param customerBusinessType 实例对象
     * @return 实例对象
     */
    @Override
    public CustomerBusinessType update(CustomerBusinessType customerBusinessType) {
        this.customerBusinessTypeDao.update(customerBusinessType);
        return this.queryById(customerBusinessType.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.customerBusinessTypeDao.deleteById(id) > 0;
    }
}