package com.focus.easymail.service.impl;

import com.focus.easymail.dao.CompanyImageDao;
import com.focus.easymail.entity.CompanyImage;
import com.focus.easymail.service.CompanyImageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (CompanyImage)表服务实现类
 *
 * @author makejava
 * @since 2020-07-05 16:49:40
 */
@Service("companyImageService")
public class CompanyImageServiceImpl implements CompanyImageService {
    @Resource
    private CompanyImageDao companyImageDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public CompanyImage queryById(Integer id) {
        return this.companyImageDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<CompanyImage> queryAllByLimit(int offset, int limit) {
        return this.companyImageDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param companyImage 实例对象
     * @return 实例对象
     */
    @Override
    public CompanyImage insert(CompanyImage companyImage) {
        this.companyImageDao.insert(companyImage);
        return companyImage;
    }

    /**
     * 修改数据
     *
     * @param companyImage 实例对象
     * @return 实例对象
     */
    @Override
    public CompanyImage update(CompanyImage companyImage) {
        this.companyImageDao.update(companyImage);
        return this.queryById(companyImage.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.companyImageDao.deleteById(id) > 0;
    }
}