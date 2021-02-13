package com.focus.easymail.service.impl;

import com.focus.easymail.dao.MailsSingleDao;
import com.focus.easymail.entity.MailsSingle;
import com.focus.easymail.service.MailsSingleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (MailsSingle)表服务实现类
 *
 * @author makejava
 * @since 2021-02-13 19:12:13
 */
@Service("mailsSingleService")
public class MailsSingleServiceImpl implements MailsSingleService {
    @Resource
    private MailsSingleDao mailsSingleDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public MailsSingle queryById(Integer id) {
        return this.mailsSingleDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<MailsSingle> queryAllByLimit(int offset, int limit) {
        return this.mailsSingleDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param mailsSingle 实例对象
     * @return 实例对象
     */
    @Override
    public MailsSingle insert(MailsSingle mailsSingle) {
        this.mailsSingleDao.insert(mailsSingle);
        return mailsSingle;
    }

    /**
     * 修改数据
     *
     * @param mailsSingle 实例对象
     * @return 实例对象
     */
    @Override
    public MailsSingle update(MailsSingle mailsSingle) {
        this.mailsSingleDao.update(mailsSingle);
        return this.queryById(mailsSingle.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.mailsSingleDao.deleteById(id) > 0;
    }
}
