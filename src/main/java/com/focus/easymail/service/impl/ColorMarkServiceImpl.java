package com.focus.easymail.service.impl;

import com.focus.easymail.dao.ColorMarkDao;
import com.focus.easymail.entity.ColorMark;
import com.focus.easymail.service.ColorMarkService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (ColorMark)表服务实现类
 *
 * @author makejava
 * @since 2021-02-13 19:12:01
 */
@Service("colorMarkService")
public class ColorMarkServiceImpl implements ColorMarkService {
    @Resource
    private ColorMarkDao colorMarkDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public ColorMark queryById(Integer id) {
        return this.colorMarkDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<ColorMark> queryAllByLimit(int offset, int limit) {
        return this.colorMarkDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param colorMark 实例对象
     * @return 实例对象
     */
    @Override
    public ColorMark insert(ColorMark colorMark) {
        this.colorMarkDao.insert(colorMark);
        return colorMark;
    }

    /**
     * 修改数据
     *
     * @param colorMark 实例对象
     * @return 实例对象
     */
    @Override
    public ColorMark update(ColorMark colorMark) {
        this.colorMarkDao.update(colorMark);
        return this.queryById(colorMark.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.colorMarkDao.deleteById(id) > 0;
    }
}
