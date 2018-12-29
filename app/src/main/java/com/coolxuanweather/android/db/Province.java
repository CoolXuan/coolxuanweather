package com.coolxuanweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2018/12/29.
 */

public class Province extends DataSupport{
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String provinceName;
    private  int provinceCode;

    public String getProvinceName() {
        return provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;

    }
}
