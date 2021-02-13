package com.focus.easymail.service.impl;

import com.focus.easymail.dao.CustomerMainProductsDao;
import com.focus.easymail.entity.CustomerMainProducts;
import com.focus.easymail.service.CustomerMainProductsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (CustomerMainProducts)表服务实现类
 *
 * @author makejava
 * @since 2021-02-13 19:12:06
 */
@Service("customerMainProductsService")
public class CustomerMainProductsServiceImpl implements CustomerMainProductsService {
    @Resource
    private CustomerMainProductsDao customerMainProductsDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public CustomerMainProducts queryById(Integer id) {
        return this.customerMainProductsDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<CustomerMainProducts> queryAllByLimit(int offset, int limit) {
        return this.customerMainProductsDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param customerMainProducts 实例对象
     * @return 实例对象
     */
    @Override
    public CustomerMainProducts insert(CustomerMainProducts customerMainProducts) {
        this.customerMainProductsDao.insert(customerMainProducts);
        return customerMainProducts;
    }

    /**
     * 修改数据
     *
     * @param customerMainProducts 实例对象
     * @return 实例对象
     */
    @Override
    public CustomerMainProducts update(CustomerMainProducts customerMainProducts) {
        this.customerMainProductsDao.update(customerMainProducts);
        return this.queryById(customerMainProducts.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.customerMainProductsDao.deleteById(id) > 0;
    }
}
