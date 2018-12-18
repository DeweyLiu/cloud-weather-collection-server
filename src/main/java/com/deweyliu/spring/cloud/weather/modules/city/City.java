package com.deweyliu.spring.cloud.weather.modules.city;


/**
 * @author DeweyLiu
 * @version 1.0.0
 * @date 2018/12/13 10:50
 */
public class City {

    private String cityId;

    private String cityName;

    private String cityCode;

    private String province;

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
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

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }
}
