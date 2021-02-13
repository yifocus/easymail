package com.focus.easymail.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * (Company)实体类
 *
 * @author makejava
 * @since 2021-02-13 19:12:01
 */
public class Company implements Serializable {
    private static final long serialVersionUID = 798076163064306870L;

    private Integer id;
    /**
     * 客户公司简称
     */
    private String simpleName;
    /**
     * 公司全称
     */
    private String name;
    /**
     * 客户代码，自动生成
     */
    private String code;
    /**
     * 唯一标识
     */
    private String identify;
    /**
     * 国家
     */
    private Integer countryId;
    /**
     * 城市
     */
    private String city;
    /**
     * 省份、港口
     */
    private String province;
    /**
     * 客户公司地址
     */
    private String address;
    /**
     * 关联的用户Id
     */
    private Integer userId;
    /**
     * 客户类型
     */
    private Integer categoryId;
    /**
     * 电话
     */
    private String phone;
    /**
     * 传真
     */
    private String fax;
    /**
     * 网站
     */
    private String website;
    /**
     * 来源
     */
    private Integer sourceId;
    /**
     * 主营产品
     */
    private Integer productId;
    /**
     * 业务类型
     */
    private Integer bussinessTypeId;
    /**
     * 备注
     */
    private String remark;
    /**
     * 等级， 1 非常重要， 2 重要 ， 3 一般
     */
    private Integer level;
    /**
     * 银行信息
     */
    private String bankInfo;
    /**
     * 建档时间
     */
    private Date createDate;
    /**
     * 客户当地时间
     */
    private Date countryDate;
    /**
     * 更新时间
     */
    private Date updateDate;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSimpleName() {
        return simpleName;
    }

    public void setSimpleName(String simpleName) {
        this.simpleName = simpleName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getIdentify() {
        return identify;
    }

    public void setIdentify(String identify) {
        this.identify = identify;
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public Integer getSourceId() {
        return sourceId;
    }

    public void setSourceId(Integer sourceId) {
        this.sourceId = sourceId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getBussinessTypeId() {
        return bussinessTypeId;
    }

    public void setBussinessTypeId(Integer bussinessTypeId) {
        this.bussinessTypeId = bussinessTypeId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getBankInfo() {
        return bankInfo;
    }

    public void setBankInfo(String bankInfo) {
        this.bankInfo = bankInfo;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getCountryDate() {
        return countryDate;
    }

    public void setCountryDate(Date countryDate) {
        this.countryDate = countryDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

}
