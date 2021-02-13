package com.focus.easymail.service.impl;

import com.focus.easymail.dao.MailsMassDao;
import com.focus.easymail.entity.MailsMass;
import com.focus.easymail.service.MailsMassService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (MailsMass)表服务实现类
 *
 * @author makejava
 * @since 2021-02-13 19:12:11
 */
@Service("mailsMassService")
public class MailsMassServiceImpl implements MailsMassService {
    @Resource
    private MailsMassDao mailsMassDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public MailsMass queryById(Integer id) {
        return this.mailsMassDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<MailsMass> queryAllByLimit(int offset, int limit) {
        return this.mailsMassDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param mailsMass 实例对象
     * @return 实例对象
     */
    @Override
    public MailsMass insert(MailsMass mailsMass) {
        this.mailsMassDao.insert(mailsMass);
        return mailsMass;
    }

    /**
     * 修改数据
     *
     * @param mailsMass 实例对象
     * @return 实例对象
     */
    @Override
    public MailsMass update(MailsMass mailsMass) {
        this.mailsMassDao.update(mailsMass);
        return this.queryById(mailsMass.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.mailsMassDao.deleteById(id) > 0;
    }
}
