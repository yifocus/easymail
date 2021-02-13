package com.focus.easymail.service.impl;

import com.focus.easymail.dao.CustomerTypesDao;
import com.focus.easymail.entity.CustomerTypes;
import com.focus.easymail.service.CustomerTypesService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (CustomerTypes)表服务实现类
 *
 * @author makejava
 * @since 2021-02-13 19:12:10
 */
@Service("customerTypesService")
public class CustomerTypesServiceImpl implements CustomerTypesService {
    @Resource
    private CustomerTypesDao customerTypesDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public CustomerTypes queryById(Integer id) {
        return this.customerTypesDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<CustomerTypes> queryAllByLimit(int offset, int limit) {
        return this.customerTypesDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param customerTypes 实例对象
     * @return 实例对象
     */
    @Override
    public CustomerTypes insert(CustomerTypes customerTypes) {
        this.customerTypesDao.insert(customerTypes);
        return customerTypes;
    }

    /**
     * 修改数据
     *
     * @param customerTypes 实例对象
     * @return 实例对象
     */
    @Override
    public CustomerTypes update(CustomerTypes customerTypes) {
        this.customerTypesDao.update(customerTypes);
        return this.queryById(customerTypes.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.customerTypesDao.deleteById(id) > 0;
    }
}
