package com.focus.easymail.entity;

import java.io.Serializable;

/**
 * (CustomerMainProducts)实体类
 *
 * @author makejava
 * @since 2021-02-13 19:12:06
 */
public class CustomerMainProducts implements Serializable {
    private static final long serialVersionUID = -49231927127111628L;

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
