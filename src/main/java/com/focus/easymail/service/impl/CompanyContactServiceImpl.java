package com.focus.easymail.service.impl;

import com.focus.easymail.dao.CompanyContactDao;
import com.focus.easymail.entity.CompanyContact;
import com.focus.easymail.service.CompanyContactService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (CompanyContact)表服务实现类
 *
 * @author makejava
 * @since 2021-02-13 19:12:03
 */
@Service("companyContactService")
public class CompanyContactServiceImpl implements CompanyContactService {
    @Resource
    private CompanyContactDao companyContactDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public CompanyContact queryById(Integer id) {
        return this.companyContactDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<CompanyContact> queryAllByLimit(int offset, int limit) {
        return this.companyContactDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param companyContact 实例对象
     * @return 实例对象
     */
    @Override
    public CompanyContact insert(CompanyContact companyContact) {
        this.companyContactDao.insert(companyContact);
        return companyContact;
    }

    /**
     * 修改数据
     *
     * @param companyContact 实例对象
     * @return 实例对象
     */
    @Override
    public CompanyContact update(CompanyContact companyContact) {
        this.companyContactDao.update(companyContact);
        return this.queryById(companyContact.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.companyContactDao.deleteById(id) > 0;
    }
}
