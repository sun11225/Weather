package com.sun.weather.db;

import org.litepal.crud.DataSupport;

/**
 * 项目名:   Weather
 * 包名:     com.sun.weather.db
 * 文件名:   Province
 * 创建者:   sun
 * 创建时间: 2019/9/17 0017 18:37
 * 描述:    省级数据
 */
public class Province extends DataSupport {
    private  int id;
    private  String provinceName;
    private String provinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }
}
