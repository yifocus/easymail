package com.focus.easymail.service.impl;

import com.focus.easymail.dao.CompanyDao;
import com.focus.easymail.entity.Company;
import com.focus.easymail.service.CompanyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Company)表服务实现类
 *
 * @author makejava
 * @since 2021-02-13 19:12:02
 */
@Service("companyService")
public class CompanyServiceImpl implements CompanyService {
    @Resource
    private CompanyDao companyDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Company queryById(Integer id) {
        return this.companyDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Company> queryAllByLimit(int offset, int limit) {
        return this.companyDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param company 实例对象
     * @return 实例对象
     */
    @Override
    public Company insert(Company company) {
        this.companyDao.insert(company);
        return company;
    }

    /**
     * 修改数据
     *
     * @param company 实例对象
     * @return 实例对象
     */
    @Override
    public Company update(Company company) {
        this.companyDao.update(company);
        return this.queryById(company.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.companyDao.deleteById(id) > 0;
    }
}
