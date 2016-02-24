package edu.csu.jobsky.bean;

import java.util.List;

/**
 * Created by huangxinqi on 16/2/19.
 */

/* create by huangxinqi 
    on 2016-02-19
    作用:天气bean
*/
public class WeatherBean {

    /**
     * msg : success
     * result : [{"airCondition":"优","city":"北京","coldIndex":"易发期","date":"2016-02-19","distrct":"通州","dressingIndex":"薄冬衣","exerciseIndex":"不适宜","future":[{"date":"2016-02-19","dayTime":"多云","night":"晴","temperature":"8°C / -5°C","week":"今天","wind":"北风 3～4级"},{"date":"2016-02-20","dayTime":"晴","night":"晴","temperature":"4°C / -5°C","week":"星期六","wind":"无持续风向 小于3级"},{"date":"2016-02-21","dayTime":"晴","night":"多云","temperature":"7°C / -3°C","week":"星期日","wind":"无持续风向 小于3级"},{"date":"2016-02-22","dayTime":"多云","night":"晴","temperature":"7°C / -3°C","week":"星期一","wind":"北风 3～4级"},{"date":"2016-02-23","dayTime":"晴","night":"晴","temperature":"5°C / -4°C","week":"星期二","wind":"无持续风向 小于3级"},{"date":"2016-02-24","dayTime":"晴","night":"多云","temperature":"5°C / -3°C","week":"星期三","wind":"无持续风向 小于3级"},{"date":"2016-02-25","dayTime":"多云","night":"阴","temperature":"5°C / -2°C","week":"星期四","wind":"无持续风向 小于3级"},{"date":"2016-02-26","dayTime":"阵雪","night":"局部多云","temperature":"5°C / -6°C","week":"星期五","wind":"东北偏北风 3级"},{"date":"2016-02-27","dayTime":"少云","night":"少云","temperature":"4°C / -8°C","week":"星期六","wind":"西北风 4级"},{"date":"2016-02-28","dayTime":"晴","night":"晴","temperature":"6°C / -6°C","week":"星期日","wind":"西北偏西风 3级"}],"humidity":"湿度：34%","pollutionIndex":"49","province":"北京","sunrise":"07:02","sunset":"17:53","temperature":"3℃","time":"10:40","updateTime":"20160219105411","washIndex":"不太适宜","weather":"多云","week":"周五","wind":"无持续风向微风"}]
     * retCode : 200
     */

    private String msg;
    private String retCode;
    /**
     * airCondition : 优
     * city : 北京
     * coldIndex : 易发期
     * date : 2016-02-19
     * distrct : 通州
     * dressingIndex : 薄冬衣
     * exerciseIndex : 不适宜
     * future : [{"date":"2016-02-19","dayTime":"多云","night":"晴","temperature":"8°C / -5°C","week":"今天","wind":"北风 3～4级"},{"date":"2016-02-20","dayTime":"晴","night":"晴","temperature":"4°C / -5°C","week":"星期六","wind":"无持续风向 小于3级"},{"date":"2016-02-21","dayTime":"晴","night":"多云","temperature":"7°C / -3°C","week":"星期日","wind":"无持续风向 小于3级"},{"date":"2016-02-22","dayTime":"多云","night":"晴","temperature":"7°C / -3°C","week":"星期一","wind":"北风 3～4级"},{"date":"2016-02-23","dayTime":"晴","night":"晴","temperature":"5°C / -4°C","week":"星期二","wind":"无持续风向 小于3级"},{"date":"2016-02-24","dayTime":"晴","night":"多云","temperature":"5°C / -3°C","week":"星期三","wind":"无持续风向 小于3级"},{"date":"2016-02-25","dayTime":"多云","night":"阴","temperature":"5°C / -2°C","week":"星期四","wind":"无持续风向 小于3级"},{"date":"2016-02-26","dayTime":"阵雪","night":"局部多云","temperature":"5°C / -6°C","week":"星期五","wind":"东北偏北风 3级"},{"date":"2016-02-27","dayTime":"少云","night":"少云","temperature":"4°C / -8°C","week":"星期六","wind":"西北风 4级"},{"date":"2016-02-28","dayTime":"晴","night":"晴","temperature":"6°C / -6°C","week":"星期日","wind":"西北偏西风 3级"}]
     * humidity : 湿度：34%
     * pollutionIndex : 49
     * province : 北京
     * sunrise : 07:02
     * sunset : 17:53
     * temperature : 3℃
     * time : 10:40
     * updateTime : 20160219105411
     * washIndex : 不太适宜
     * weather : 多云
     * week : 周五
     * wind : 无持续风向微风
     */

    private List<ResultEntity> result;

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setRetCode(String retCode) {
        this.retCode = retCode;
    }

    public void setResult(List<ResultEntity> result) {
        this.result = result;
    }

    public String getMsg() {
        return msg;
    }

    public String getRetCode() {
        return retCode;
    }

    public List<ResultEntity> getResult() {
        return result;
    }

    public static class ResultEntity {
        private String airCondition;
        private String city;
        private String coldIndex;
        private String date;
        private String distrct;
        private String dressingIndex;
        private String exerciseIndex;
        private String humidity;
        private String pollutionIndex;
        private String province;
        private String sunrise;
        private String sunset;
        private String temperature;
        private String time;
        private String updateTime;
        private String washIndex;
        private String weather;
        private String week;
        private String wind;
        /**
         * date : 2016-02-19
         * dayTime : 多云
         * night : 晴
         * temperature : 8°C / -5°C
         * week : 今天
         * wind : 北风 3～4级
         */

        private List<FutureEntity> future;

        public void setAirCondition(String airCondition) {
            this.airCondition = airCondition;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public void setColdIndex(String coldIndex) {
            this.coldIndex = coldIndex;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public void setDistrct(String distrct) {
            this.distrct = distrct;
        }

        public void setDressingIndex(String dressingIndex) {
            this.dressingIndex = dressingIndex;
        }

        public void setExerciseIndex(String exerciseIndex) {
            this.exerciseIndex = exerciseIndex;
        }

        public void setHumidity(String humidity) {
            this.humidity = humidity;
        }

        public void setPollutionIndex(String pollutionIndex) {
            this.pollutionIndex = pollutionIndex;
        }

        public void setProvince(String province) {
            this.province = province;
        }

        public void setSunrise(String sunrise) {
            this.sunrise = sunrise;
        }

        public void setSunset(String sunset) {
            this.sunset = sunset;
        }

        public void setTemperature(String temperature) {
            this.temperature = temperature;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public void setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
        }

        public void setWashIndex(String washIndex) {
            this.washIndex = washIndex;
        }

        public void setWeather(String weather) {
            this.weather = weather;
        }

        public void setWeek(String week) {
            this.week = week;
        }

        public void setWind(String wind) {
            this.wind = wind;
        }

        public void setFuture(List<FutureEntity> future) {
            this.future = future;
        }

        public String getAirCondition() {
            return airCondition;
        }

        public String getCity() {
            return city;
        }

        public String getColdIndex() {
            return coldIndex;
        }

        public String getDate() {
            return date;
        }

        public String getDistrct() {
            return distrct;
        }

        public String getDressingIndex() {
            return dressingIndex;
        }

        public String getExerciseIndex() {
            return exerciseIndex;
        }

        public String getHumidity() {
            return humidity;
        }

        public String getPollutionIndex() {
            return pollutionIndex;
        }

        public String getProvince() {
            return province;
        }

        public String getSunrise() {
            return sunrise;
        }

        public String getSunset() {
            return sunset;
        }

        public String getTemperature() {
            return temperature;
        }

        public String getTime() {
            return time;
        }

        public String getUpdateTime() {
            return updateTime;
        }

        public String getWashIndex() {
            return washIndex;
        }

        public String getWeather() {
            return weather;
        }

        public String getWeek() {
            return week;
        }

        public String getWind() {
            return wind;
        }

        public List<FutureEntity> getFuture() {
            return future;
        }

        public static class FutureEntity {
            private String date;
            private String dayTime;
            private String night;
            private String temperature;
            private String week;
            private String wind;

            public void setDate(String date) {
                this.date = date;
            }

            public void setDayTime(String dayTime) {
                this.dayTime = dayTime;
            }

            public void setNight(String night) {
                this.night = night;
            }

            public void setTemperature(String temperature) {
                this.temperature = temperature;
            }

            public void setWeek(String week) {
                this.week = week;
            }

            public void setWind(String wind) {
                this.wind = wind;
            }

            public String getDate() {
                return date;
            }

            public String getDayTime() {
                return dayTime;
            }

            public String getNight() {
                return night;
            }

            public String getTemperature() {
                return temperature;
            }

            public String getWeek() {
                return week;
            }

            public String getWind() {
                return wind;
            }
        }
    }
}
