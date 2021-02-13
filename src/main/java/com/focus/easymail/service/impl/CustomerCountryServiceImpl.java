package com.focus.easymail.service.impl;

import com.focus.easymail.dao.CustomerCountryDao;
import com.focus.easymail.entity.CustomerCountry;
import com.focus.easymail.service.CustomerCountryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (CustomerCountry)表服务实现类
 *
 * @author makejava
 * @since 2020-07-05 16:49:40
 */
@Service("customerCountryService")
public class CustomerCountryServiceImpl implements CustomerCountryService {
    @Resource
    private CustomerCountryDao customerCountryDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public CustomerCountry queryById(Integer id) {
        return this.customerCountryDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<CustomerCountry> queryAllByLimit(int offset, int limit) {
        return this.customerCountryDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param customerCountry 实例对象
     * @return 实例对象
     */
    @Override
    public CustomerCountry insert(CustomerCountry customerCountry) {
        this.customerCountryDao.insert(customerCountry);
        return customerCountry;
    }

    /**
     * 修改数据
     *
     * @param customerCountry 实例对象
     * @return 实例对象
     */
    @Override
    public CustomerCountry update(CustomerCountry customerCountry) {
        this.customerCountryDao.update(customerCountry);
        return this.queryById(customerCountry.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.customerCountryDao.deleteById(id) > 0;
    }
}