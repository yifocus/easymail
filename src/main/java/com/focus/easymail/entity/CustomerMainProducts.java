package com.focus.easymail.entity;

import java.io.Serializable;

/**
 * (CustomerMainProducts)实体类
 *
 * @author makejava
 * @since 2020-07-05 16:49:40
 */
public class CustomerMainProducts implements Serializable {
    private static final long serialVersionUID = -30296130926349264L;
    
    private Integer id;
    /**
    * 产品名称
    */
    private String productName;
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

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
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