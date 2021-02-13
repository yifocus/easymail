package com.focus.easymail.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * (CompanyImage)实体类
 *
 * @author makejava
 * @since 2021-02-13 19:12:03
 */
public class CompanyImage implements Serializable {
    private static final long serialVersionUID = 822909909700688605L;

    private Integer id;

    private Integer companyId;

    private String imageUrl;

    private String remark;

    private Date createDate;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

}
