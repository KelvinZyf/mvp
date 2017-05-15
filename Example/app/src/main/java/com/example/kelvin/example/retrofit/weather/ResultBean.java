package com.example.kelvin.example.retrofit.weather;

import java.util.List;

/**
 * Created by kelvin on 2017/5/10.
 */

public class ResultBean {

    /**
     * sk : {"temp":"21","wind_direction":"东北风","wind_strength":"2级","humidity":"58%","time":"10:39"}
     * today : {"temperature":"15℃~30℃","weather":"晴","weather_id":{"fa":"00","fb":"00"},"wind":"南风3-4 级","week":"星期三","city":"北京","date_y":"2017年05月10日","dressing_index":"热","dressing_advice":"天气热，建议着短裙、短裤、短薄外套、T恤等夏季服装。","uv_index":"很强","comfort_index":"","wash_index":"较适宜","travel_index":"较适宜","exercise_index":"较适宜","drying_index":""}
     * future : [{"temperature":"15℃~30℃","weather":"晴","weather_id":{"fa":"00","fb":"00"},"wind":"南风3-4 级","week":"星期三","date":"20170510"},{"temperature":"13℃~32℃","weather":"晴转多云","weather_id":{"fa":"00","fb":"01"},"wind":"北风4-5 级","week":"星期四","date":"20170511"},{"temperature":"17℃~30℃","weather":"多云转晴","weather_id":{"fa":"01","fb":"00"},"wind":"西南风3-4 级","week":"星期五","date":"20170512"},{"temperature":"16℃~28℃","weather":"多云转晴","weather_id":{"fa":"01","fb":"00"},"wind":"北风3-4 级","week":"星期六","date":"20170513"},{"temperature":"15℃~27℃","weather":"多云","weather_id":{"fa":"01","fb":"01"},"wind":"北风3-4 级","week":"星期日","date":"20170514"},{"temperature":"16℃~28℃","weather":"多云转晴","weather_id":{"fa":"01","fb":"00"},"wind":"北风3-4 级","week":"星期一","date":"20170515"},{"temperature":"13℃~32℃","weather":"晴转多云","weather_id":{"fa":"00","fb":"01"},"wind":"北风4-5 级","week":"星期二","date":"20170516"}]
     */

    private SkBean sk;
    private TodayBean today;
    private List<FutureBean> future;

    public SkBean getSk() {
        return sk;
    }

    public void setSk(SkBean sk) {
        this.sk = sk;
    }

    public TodayBean getToday() {
        return today;
    }

    public void setToday(TodayBean today) {
        this.today = today;
    }

    public List<FutureBean> getFuture() {
        return future;
    }

    public void setFuture(List<FutureBean> future) {
        this.future = future;
    }

}
