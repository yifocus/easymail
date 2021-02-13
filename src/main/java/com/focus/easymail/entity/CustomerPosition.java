package com.focus.easymail.entity;

import java.io.Serializable;

/**
 * (CustomerPosition)实体类
 *
 * @author makejava
 * @since 2020-07-05 16:49:40
 */
public class CustomerPosition implements Serializable {
    private static final long serialVersionUID = -78999487452367858L;
    
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