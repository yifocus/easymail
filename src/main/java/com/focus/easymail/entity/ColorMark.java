package com.focus.easymail.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * (ColorMark)实体类
 *
 * @author makejava
 * @since 2021-02-13 19:12:00
 */
public class ColorMark implements Serializable {
    private static final long serialVersionUID = -19963692900371847L;

    private Integer id;

    private String identify;

    private String colorValue;

    private Date createDate;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIdentify() {
        return identify;
    }

    public void setIdentify(String identify) {
        this.identify = identify;
    }

    public String getColorValue() {
        return colorValue;
    }

    public void setColorValue(String colorValue) {
        this.colorValue = colorValue;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

}
