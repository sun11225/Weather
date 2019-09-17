package com.sun.weather.db;

import org.litepal.crud.DataSupport;

/**
 * 项目名:   Weather
 * 包名:     com.sun.weather.db
 * 文件名:   City
 * 创建者:   sun
 * 创建时间: 2019/9/17 0017 19:02
 * 描述:    城市数据
 */
public class City extends DataSupport {

    private int id;
    private String cityName;
    private String cityCode;
    private String provinceId;//所属于的城市

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(String provinceId) {
        this.provinceId = provinceId;
    }
}
