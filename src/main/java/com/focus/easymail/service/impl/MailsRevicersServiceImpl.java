package com.focus.easymail.service.impl;

import com.focus.easymail.dao.MailsRevicersDao;
import com.focus.easymail.entity.MailsRevicers;
import com.focus.easymail.service.MailsRevicersService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (MailsRevicers)表服务实现类
 *
 * @author makejava
 * @since 2020-07-05 16:49:41
 */
@Service("mailsRevicersService")
public class MailsRevicersServiceImpl implements MailsRevicersService {
    @Resource
    private MailsRevicersDao mailsRevicersDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public MailsRevicers queryById(Integer id) {
        return this.mailsRevicersDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<MailsRevicers> queryAllByLimit(int offset, int limit) {
        return this.mailsRevicersDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param mailsRevicers 实例对象
     * @return 实例对象
     */
    @Override
    public MailsRevicers insert(MailsRevicers mailsRevicers) {
        this.mailsRevicersDao.insert(mailsRevicers);
        return mailsRevicers;
    }

    /**
     * 修改数据
     *
     * @param mailsRevicers 实例对象
     * @return 实例对象
     */
    @Override
    public MailsRevicers update(MailsRevicers mailsRevicers) {
        this.mailsRevicersDao.update(mailsRevicers);
        return this.queryById(mailsRevicers.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.mailsRevicersDao.deleteById(id) > 0;
    }
}