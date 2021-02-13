package com.focus.easymail.entity;

import java.io.Serializable;

/**
 * (CustomerCountry)实体类
 *
 * @author makejava
 * @since 2021-02-13 19:12:05
 */
public class CustomerCountry implements Serializable {
    private static final long serialVersionUID = 740704037423279067L;

    private Integer id;
    /**
     * 国家代码
     */
    private String countryCode;
    /**
     * 国家名称
     */
    private String name;
    /**
     * 英文名称
     */
    private String englishName;
    /**
     * 海关代码
     */
    private String customCode;
    /**
     * 所属地区
     */
    private String area;
    /**
     * 时区
     */
    private String countryTimeZone;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
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

    public String getCustomCode() {
        return customCode;
    }

    public void setCustomCode(String customCode) {
        this.customCode = customCode;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCountryTimeZone() {
        return countryTimeZone;
    }

    public void setCountryTimeZone(String countryTimeZone) {
        this.countryTimeZone = countryTimeZone;
    }

}
