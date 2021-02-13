package com.focus.easymail.entity;

import java.io.Serializable;

/**
 * (CustomerBusinessType)实体类
 *
 * @author makejava
 * @since 2020-07-05 16:49:41
 */
public class CustomerBusinessType implements Serializable {
    private static final long serialVersionUID = -91712700009461634L;
    
    private Integer id;
    /**
    * 业务类型
    */
    private String businessName;
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

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
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