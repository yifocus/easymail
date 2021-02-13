package com.focus.easymail.entity;

import java.io.Serializable;

/**
 * (CustomerSources)实体类
 *
 * @author makejava
 * @since 2021-02-13 19:12:08
 */
public class CustomerSources implements Serializable {
    private static final long serialVersionUID = 911380592161572026L;

    private Integer id;
    /**
     * 客户来源,如产地，展会等
     */
    private String source;
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

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
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
