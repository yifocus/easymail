package com.focus.easymail.service.impl;

import com.focus.easymail.dao.CustomerPositionDao;
import com.focus.easymail.entity.CustomerPosition;
import com.focus.easymail.service.CustomerPositionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (CustomerPosition)表服务实现类
 *
 * @author makejava
 * @since 2020-07-05 16:49:40
 */
@Service("customerPositionService")
public class CustomerPositionServiceImpl implements CustomerPositionService {
    @Resource
    private CustomerPositionDao customerPositionDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public CustomerPosition queryById(Integer id) {
        return this.customerPositionDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<CustomerPosition> queryAllByLimit(int offset, int limit) {
        return this.customerPositionDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param customerPosition 实例对象
     * @return 实例对象
     */
    @Override
    public CustomerPosition insert(CustomerPosition customerPosition) {
        this.customerPositionDao.insert(customerPosition);
        return customerPosition;
    }

    /**
     * 修改数据
     *
     * @param customerPosition 实例对象
     * @return 实例对象
     */
    @Override
    public CustomerPosition update(CustomerPosition customerPosition) {
        this.customerPositionDao.update(customerPosition);
        return this.queryById(customerPosition.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.customerPositionDao.deleteById(id) > 0;
    }
}