package com.focus.easymail.entity;

import java.io.Serializable;

/**
 * (CustomerTypes)实体类
 *
 * @author makejava
 * @since 2021-02-13 19:12:09
 */
public class CustomerTypes implements Serializable {
    private static final long serialVersionUID = -33374720490255074L;

    private Integer id;
    /**
     * 名称
     */
    private String name;
    /**
     * 英文名称
     */
    private String englishName;
    /**
     * 客户类型：1 潜在客户，2 正式客户，3 供应商，4 货代，5船运，6 其他
     */
    private String type;
    /**
     * 客户等级,1 一般，2 重要，3 非常重要
     */
    private Integer customerLevel;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getCustomerLevel() {
        return customerLevel;
    }

    public void setCustomerLevel(Integer customerLevel) {
        this.customerLevel = customerLevel;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

}
