package com.sun.weather.db;

import org.litepal.crud.DataSupport;

/**
 * 项目名:   Weather
 * 包名:     com.sun.weather.db
 * 文件名:   County
 * 创建者:   sun
 * 创建时间: 2019/9/17 0017 19:03
 * 描述:    县级数据
 */
public class County extends DataSupport{

    private int id;
    private String countyName;
    private String countyCode;
    private String cityId;//所属于的市

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getCountyCode() {
        return countyCode;
    }

    public void setCountyCode(String countyCode) {
        this.countyCode = countyCode;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }
}
