package com.example.kelvin.example.retrofit.weather;

/**
 * Created by kelvin on 2017/5/10.
 */

public class WeatherEntuty {


    /**
     * resultcode : 200
     * reason : successed!
     * result : {"sk":{"temp":"21","wind_direction":"东北风","wind_strength":"2级","humidity":"58%","time":"10:39"},"today":{"temperature":"15℃~30℃","weather":"晴","weather_id":{"fa":"00","fb":"00"},"wind":"南风3-4 级","week":"星期三","city":"北京","date_y":"2017年05月10日","dressing_index":"热","dressing_advice":"天气热，建议着短裙、短裤、短薄外套、T恤等夏季服装。","uv_index":"很强","comfort_index":"","wash_index":"较适宜","travel_index":"较适宜","exercise_index":"较适宜","drying_index":""},"future":[{"temperature":"15℃~30℃","weather":"晴","weather_id":{"fa":"00","fb":"00"},"wind":"南风3-4 级","week":"星期三","date":"20170510"},{"temperature":"13℃~32℃","weather":"晴转多云","weather_id":{"fa":"00","fb":"01"},"wind":"北风4-5 级","week":"星期四","date":"20170511"},{"temperature":"17℃~30℃","weather":"多云转晴","weather_id":{"fa":"01","fb":"00"},"wind":"西南风3-4 级","week":"星期五","date":"20170512"},{"temperature":"16℃~28℃","weather":"多云转晴","weather_id":{"fa":"01","fb":"00"},"wind":"北风3-4 级","week":"星期六","date":"20170513"},{"temperature":"15℃~27℃","weather":"多云","weather_id":{"fa":"01","fb":"01"},"wind":"北风3-4 级","week":"星期日","date":"20170514"},{"temperature":"16℃~28℃","weather":"多云转晴","weather_id":{"fa":"01","fb":"00"},"wind":"北风3-4 级","week":"星期一","date":"20170515"},{"temperature":"13℃~32℃","weather":"晴转多云","weather_id":{"fa":"00","fb":"01"},"wind":"北风4-5 级","week":"星期二","date":"20170516"}]}
     * error_code : 0
     */

    private String resultcode;
    private String reason;
    private ResultBean result;
    private int error_code;

    public String getResultcode() {
        return resultcode;
    }

    public void setResultcode(String resultcode) {
        this.resultcode = resultcode;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

}
