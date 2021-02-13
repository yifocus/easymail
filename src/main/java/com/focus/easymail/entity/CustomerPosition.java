package com.focus.easymail.entity;

import java.io.Serializable;

/**
 * (CustomerPosition)实体类
 *
 * @author makejava
 * @since 2021-02-13 19:12:07
 */
public class CustomerPosition implements Serializable {
    private static final long serialVersionUID = 557893767152167523L;

    private Integer id;
    /**
     * 职位名称
     */
    private String positionName;
    /**
     * 其他名称
     */
    private String otherName;
    /**
     * 备注
     */
    private String remark;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public String getOtherName() {
        return otherName;
    }

    public void setOtherName(String otherName) {
        this.otherName = otherName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

}
