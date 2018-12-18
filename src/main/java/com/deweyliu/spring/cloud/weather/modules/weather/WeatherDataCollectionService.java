package com.deweyliu.spring.cloud.weather.modules.weather;

/**
 * @author DeweyLiu
 * @version 1.0.0
 * @date 2018/12/12 16:23
 */
public interface WeatherDataCollectionService {

    /**
     * 根据城市Id同步天气
     *
     * @param cityId
     */
    void syncDateByCityId(String cityId);
}
