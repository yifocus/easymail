package com.focus.easymail.service.impl;

import com.focus.easymail.entity.UserMails;
import com.focus.easymail.dao.UserMailsDao;
import com.focus.easymail.service.UserMailsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 用户邮箱绑定表， 用于群发邮箱， 和收件邮箱(UserMails)表服务实现类
 *
 * @author makejava
 * @since 2020-02-23 20:13:18
 */
@Service("userMailsService")
public class UserMailsServiceImpl implements UserMailsService {
    @Resource
    private UserMailsDao userMailsDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public UserMails queryById(Integer id) {
        return this.userMailsDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<UserMails> queryAllByLimit(int offset, int limit) {
        return this.userMailsDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param userMails 实例对象
     * @return 实例对象
     */
    @Override
    public UserMails insert(UserMails userMails) {
        this.userMailsDao.insert(userMails);
        return userMails;
    }

    /**
     * 修改数据
     *
     * @param userMails 实例对象
     * @return 实例对象
     */
    @Override
    public UserMails update(UserMails userMails) {
        this.userMailsDao.update(userMails);
        return this.queryById(userMails.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.userMailsDao.deleteById(id) > 0;
    }
}