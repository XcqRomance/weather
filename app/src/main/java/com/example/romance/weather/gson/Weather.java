package com.example.romance.weather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by xiechuanquan on 2017/12/13.
 */

public class Weather {
    /**
     * aqi : {"city":{"aqi":"72","qlty":"良","pm25":"52","pm10":"70","no2":"35","so2":"53","co":"1","o3":"64"}}
     * basic : {"city":"哈尔滨","cnty":"中国","id":"CN101050101","lat":"45.75696564","lon":"126.64246368","update":{"loc":"2017-12-13 14:50","utc":"2017-12-13 06:50"}}
     * daily_forecast : [{"astro":{"mr":"01:40","ms":"13:23","sr":"07:06","ss":"15:51"},"cond":{"code_d":"100","code_n":"100","txt_d":"晴","txt_n":"晴"},"date":"2017-12-13","hum":"80","pcpn":"0.0","pop":"0","pres":"1037","tmp":{"max":"-16","min":"-25"},"uv":"1","vis":"20","wind":{"deg":"276","dir":"西风","sc":"3-4","spd":"11"}},{"astro":{"mr":"02:43","ms":"13:50","sr":"07:07","ss":"15:51"},"cond":{"code_d":"101","code_n":"407","txt_d":"多云","txt_n":"阵雪"},"date":"2017-12-14","hum":"77","pcpn":"0.0","pop":"0","pres":"1035","tmp":{"max":"-13","min":"-21"},"uv":"1","vis":"20","wind":{"deg":"277","dir":"西风","sc":"3-4","spd":"16"}},{"astro":{"mr":"03:45","ms":"14:19","sr":"07:07","ss":"15:51"},"cond":{"code_d":"407","code_n":"101","txt_d":"阵雪","txt_n":"多云"},"date":"2017-12-15","hum":"75","pcpn":"0.0","pop":"0","pres":"1029","tmp":{"max":"-13","min":"-21"},"uv":"1","vis":"20","wind":{"deg":"254","dir":"西南风","sc":"3-4","spd":"13"}}]
     * now : {"cond":{"code":"100","txt":"晴"},"fl":"-26","hum":"71","pcpn":"0.0","pres":"1037","tmp":"-15","vis":"10","wind":{"deg":"280","dir":"西风","sc":"3-4","spd":"13"}}
     * status : ok
     * suggestion : {"air":{"brf":"良","txt":"气象条件有利于空气污染物稀释、扩散和清除，可在室外正常活动。"},"comf":{"brf":"极不舒适","txt":"白天天气虽然晴好，但气温低，您会感觉十分寒冷，极不舒适，请注意保暖，并避免出门，以防冻伤。"},"cw":{"brf":"较适宜","txt":"较适宜洗车，未来一天无雨，风力较小，擦洗一新的汽车至少能保持一天。"},"drsg":{"brf":"寒冷","txt":"天气寒冷，建议着厚羽绒服、毛皮大衣加厚毛衣等隆冬服装。年老体弱者尤其要注意保暖防冻。"},"flu":{"brf":"易发","txt":"昼夜温差很大，易发生感冒，请注意适当增减衣服，加强自我防护避免感冒。"},"sport":{"brf":"较不宜","txt":"天气较好，但考虑天气寒冷，风力较强，推荐您进行室内运动，若户外运动请注意保暖并做好准备活动。"},"trav":{"brf":"较不宜","txt":"天气较好，温度低加之风稍大，外出时感觉很冷，不适宜旅游，可有选择性的进行出游。"},"uv":{"brf":"弱","txt":"紫外线强度较弱，建议出门前涂擦SPF在12-15之间、PA+的防晒护肤品。"}}
     */

    private AQI aqi;
    private Basic basic;
    private Now now;
    private String status;
    private Suggestion suggestion;
    @SerializedName("daily_forecast")
    private List<Forecast> forecastList;

    public AQI getAqi() {
        return aqi;
    }

    public void setAqi(AQI aqi) {
        this.aqi = aqi;
    }

    public Basic getBasic() {
        return basic;
    }

    public void setBasic(Basic basic) {
        this.basic = basic;
    }

    public Now getNow() {
        return now;
    }

    public void setNow(Now now) {
        this.now = now;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Suggestion getSuggestion() {
        return suggestion;
    }

    public void setSuggestion(Suggestion suggestion) {
        this.suggestion = suggestion;
    }

    public List<Forecast> getForecastList() {
        return forecastList;
    }

    public void setForecastList(List<Forecast> forecastList) {
        this.forecastList = forecastList;
    }

    public static class AQI {
        /**
         * city : {"aqi":"72","qlty":"良","pm25":"52","pm10":"70","no2":"35","so2":"53","co":"1","o3":"64"}
         */

        private AQICity city;

        public AQICity getCity() {
            return city;
        }

        public void setCity(AQICity city) {
            this.city = city;
        }

        public static class AQICity {
            /**
             * aqi : 72
             * qlty : 良
             * pm25 : 52
             * pm10 : 70
             * no2 : 35
             * so2 : 53
             * co : 1
             * o3 : 64
             */

            private String aqi;
            private String qlty;
            private String pm25;
            private String pm10;
            private String no2;
            private String so2;
            private String co;
            private String o3;

            public String getAqi() {
                return aqi;
            }

            public void setAqi(String aqi) {
                this.aqi = aqi;
            }

            public String getQlty() {
                return qlty;
            }

            public void setQlty(String qlty) {
                this.qlty = qlty;
            }

            public String getPm25() {
                return pm25;
            }

            public void setPm25(String pm25) {
                this.pm25 = pm25;
            }

            public String getPm10() {
                return pm10;
            }

            public void setPm10(String pm10) {
                this.pm10 = pm10;
            }

            public String getNo2() {
                return no2;
            }

            public void setNo2(String no2) {
                this.no2 = no2;
            }

            public String getSo2() {
                return so2;
            }

            public void setSo2(String so2) {
                this.so2 = so2;
            }

            public String getCo() {
                return co;
            }

            public void setCo(String co) {
                this.co = co;
            }

            public String getO3() {
                return o3;
            }

            public void setO3(String o3) {
                this.o3 = o3;
            }
        }
    }

    public static class Basic {
        /**
         * city : 哈尔滨
         * cnty : 中国
         * id : CN101050101
         * lat : 45.75696564
         * lon : 126.64246368
         * update : {"loc":"2017-12-13 14:50","utc":"2017-12-13 06:50"}
         */

        @SerializedName("city")
        private String cityName;
        private String cnty;
        @SerializedName("id")
        private String weatherId;
        private String lat;
        private String lon;
        private Update update;

        public String getCityName() {
            return cityName;
        }

        public void setCityName(String cityName) {
            this.cityName = cityName;
        }

        public String getCnty() {
            return cnty;
        }

        public void setCnty(String cnty) {
            this.cnty = cnty;
        }

        public String getWeatherId() {
            return weatherId;
        }

        public void setWeatherId(String weatherId) {
            this.weatherId = weatherId;
        }

        public String getLat() {
            return lat;
        }

        public void setLat(String lat) {
            this.lat = lat;
        }

        public String getLon() {
            return lon;
        }

        public void setLon(String lon) {
            this.lon = lon;
        }

        public Update getUpdate() {
            return update;
        }

        public void setUpdate(Update update) {
            this.update = update;
        }

        public static class Update {
            /**
             * loc : 2017-12-13 14:50
             * utc : 2017-12-13 06:50
             */

            @SerializedName("loc")
            private String updateTime;
            private String utc;

            public String getUpdateTime() {
                return updateTime;
            }

            public void setUpdateTime(String updateTime) {
                this.updateTime = updateTime;
            }

            public String getUtc() {
                return utc;
            }

            public void setUtc(String utc) {
                this.utc = utc;
            }
        }
    }

    public static class Now {
        /**
         * cond : {"code":"100","txt":"晴"}
         * fl : -26
         * hum : 71
         * pcpn : 0.0
         * pres : 1037
         * tmp : -15
         * vis : 10
         * wind : {"deg":"280","dir":"西风","sc":"3-4","spd":"13"}
         */

        private More cond;
        private String fl;
        private String hum;
        private String pcpn;
        private String pres;
        @SerializedName("tmp")
        private String temperature;
        private String vis;
        private WindBean wind;

        public More getCond() {
            return cond;
        }

        public void setCond(More cond) {
            this.cond = cond;
        }

        public String getFl() {
            return fl;
        }

        public void setFl(String fl) {
            this.fl = fl;
        }

        public String getHum() {
            return hum;
        }

        public void setHum(String hum) {
            this.hum = hum;
        }

        public String getPcpn() {
            return pcpn;
        }

        public void setPcpn(String pcpn) {
            this.pcpn = pcpn;
        }

        public String getPres() {
            return pres;
        }

        public void setPres(String pres) {
            this.pres = pres;
        }

        public String getTemperature() {
            return temperature;
        }

        public void setTemperature(String temperature) {
            this.temperature = temperature;
        }

        public String getVis() {
            return vis;
        }

        public void setVis(String vis) {
            this.vis = vis;
        }

        public WindBean getWind() {
            return wind;
        }

        public void setWind(WindBean wind) {
            this.wind = wind;
        }

        public static class More {
            /**
             * code : 100
             * txt : 晴
             */

            private String code;
            @SerializedName("txt")
            private String info;

            public String getCode() {
                return code;
            }

            public void setCode(String code) {
                this.code = code;
            }

            public String getInfo() {
                return info;
            }

            public void setInfo(String info) {
                this.info = info;
            }
        }

        public static class WindBean {
            /**
             * deg : 280
             * dir : 西风
             * sc : 3-4
             * spd : 13
             */

            private String deg;
            private String dir;
            private String sc;
            private String spd;

            public String getDeg() {
                return deg;
            }

            public void setDeg(String deg) {
                this.deg = deg;
            }

            public String getDir() {
                return dir;
            }

            public void setDir(String dir) {
                this.dir = dir;
            }

            public String getSc() {
                return sc;
            }

            public void setSc(String sc) {
                this.sc = sc;
            }

            public String getSpd() {
                return spd;
            }

            public void setSpd(String spd) {
                this.spd = spd;
            }
        }
    }

    public static class Suggestion {
        /**
         * air : {"brf":"良","txt":"气象条件有利于空气污染物稀释、扩散和清除，可在室外正常活动。"}
         * comf : {"brf":"极不舒适","txt":"白天天气虽然晴好，但气温低，您会感觉十分寒冷，极不舒适，请注意保暖，并避免出门，以防冻伤。"}
         * cw : {"brf":"较适宜","txt":"较适宜洗车，未来一天无雨，风力较小，擦洗一新的汽车至少能保持一天。"}
         * drsg : {"brf":"寒冷","txt":"天气寒冷，建议着厚羽绒服、毛皮大衣加厚毛衣等隆冬服装。年老体弱者尤其要注意保暖防冻。"}
         * flu : {"brf":"易发","txt":"昼夜温差很大，易发生感冒，请注意适当增减衣服，加强自我防护避免感冒。"}
         * sport : {"brf":"较不宜","txt":"天气较好，但考虑天气寒冷，风力较强，推荐您进行室内运动，若户外运动请注意保暖并做好准备活动。"}
         * trav : {"brf":"较不宜","txt":"天气较好，温度低加之风稍大，外出时感觉很冷，不适宜旅游，可有选择性的进行出游。"}
         * uv : {"brf":"弱","txt":"紫外线强度较弱，建议出门前涂擦SPF在12-15之间、PA+的防晒护肤品。"}
         */

        private AirBean air;
        @SerializedName("comf")
        private Comfort comfort;
        @SerializedName("cw")
        private CarWash carWash;
        private DrsgBean drsg;
        private FluBean flu;
        private Sport sport;
        private TravBean trav;
        private UvBean uv;

        public AirBean getAir() {
            return air;
        }

        public void setAir(AirBean air) {
            this.air = air;
        }

        public Comfort getComfort() {
            return comfort;
        }

        public void setComfort(Comfort comfort) {
            this.comfort = comfort;
        }

        public CarWash getCarWash() {
            return carWash;
        }

        public void setCarWash(CarWash carWash) {
            this.carWash = carWash;
        }

        public DrsgBean getDrsg() {
            return drsg;
        }

        public void setDrsg(DrsgBean drsg) {
            this.drsg = drsg;
        }

        public FluBean getFlu() {
            return flu;
        }

        public void setFlu(FluBean flu) {
            this.flu = flu;
        }

        public Sport getSport() {
            return sport;
        }

        public void setSport(Sport sport) {
            this.sport = sport;
        }

        public TravBean getTrav() {
            return trav;
        }

        public void setTrav(TravBean trav) {
            this.trav = trav;
        }

        public UvBean getUv() {
            return uv;
        }

        public void setUv(UvBean uv) {
            this.uv = uv;
        }

        public static class AirBean {
            /**
             * brf : 良
             * txt : 气象条件有利于空气污染物稀释、扩散和清除，可在室外正常活动。
             */

            private String brf;
            private String txt;

            public String getBrf() {
                return brf;
            }

            public void setBrf(String brf) {
                this.brf = brf;
            }

            public String getTxt() {
                return txt;
            }

            public void setTxt(String txt) {
                this.txt = txt;
            }
        }

        public static class Comfort {
            /**
             * brf : 极不舒适
             * txt : 白天天气虽然晴好，但气温低，您会感觉十分寒冷，极不舒适，请注意保暖，并避免出门，以防冻伤。
             */

            private String brf;
            @SerializedName("txt")
            private String info;

            public String getBrf() {
                return brf;
            }

            public void setBrf(String brf) {
                this.brf = brf;
            }

            public String getInfo() {
                return info;
            }

            public void setInfo(String info) {
                this.info = info;
            }
        }

        public static class CarWash {
            /**
             * brf : 较适宜
             * txt : 较适宜洗车，未来一天无雨，风力较小，擦洗一新的汽车至少能保持一天。
             */

            private String brf;
            @SerializedName("txt")
            private String info;

            public String getBrf() {
                return brf;
            }

            public void setBrf(String brf) {
                this.brf = brf;
            }

            public String getInfo() {
                return info;
            }

            public void setInfo(String info) {
                this.info = info;
            }
        }

        public static class DrsgBean {
            /**
             * brf : 寒冷
             * txt : 天气寒冷，建议着厚羽绒服、毛皮大衣加厚毛衣等隆冬服装。年老体弱者尤其要注意保暖防冻。
             */

            private String brf;
            private String txt;

            public String getBrf() {
                return brf;
            }

            public void setBrf(String brf) {
                this.brf = brf;
            }

            public String getTxt() {
                return txt;
            }

            public void setTxt(String txt) {
                this.txt = txt;
            }
        }

        public static class FluBean {
            /**
             * brf : 易发
             * txt : 昼夜温差很大，易发生感冒，请注意适当增减衣服，加强自我防护避免感冒。
             */

            private String brf;
            private String txt;

            public String getBrf() {
                return brf;
            }

            public void setBrf(String brf) {
                this.brf = brf;
            }

            public String getTxt() {
                return txt;
            }

            public void setTxt(String txt) {
                this.txt = txt;
            }
        }

        public static class Sport {
            /**
             * brf : 较不宜
             * txt : 天气较好，但考虑天气寒冷，风力较强，推荐您进行室内运动，若户外运动请注意保暖并做好准备活动。
             */

            private String brf;
            @SerializedName("txt")
            private String info;

            public String getBrf() {
                return brf;
            }

            public void setBrf(String brf) {
                this.brf = brf;
            }

            public String getInfo() {
                return info;
            }

            public void setInfo(String info) {
                this.info = info;
            }
        }

        public static class TravBean {
            /**
             * brf : 较不宜
             * txt : 天气较好，温度低加之风稍大，外出时感觉很冷，不适宜旅游，可有选择性的进行出游。
             */

            private String brf;
            private String txt;

            public String getBrf() {
                return brf;
            }

            public void setBrf(String brf) {
                this.brf = brf;
            }

            public String getTxt() {
                return txt;
            }

            public void setTxt(String txt) {
                this.txt = txt;
            }
        }

        public static class UvBean {
            /**
             * brf : 弱
             * txt : 紫外线强度较弱，建议出门前涂擦SPF在12-15之间、PA+的防晒护肤品。
             */

            private String brf;
            private String txt;

            public String getBrf() {
                return brf;
            }

            public void setBrf(String brf) {
                this.brf = brf;
            }

            public String getTxt() {
                return txt;
            }

            public void setTxt(String txt) {
                this.txt = txt;
            }
        }
    }

    public static class Forecast {
        /**
         * astro : {"mr":"01:40","ms":"13:23","sr":"07:06","ss":"15:51"}
         * cond : {"code_d":"100","code_n":"100","txt_d":"晴","txt_n":"晴"}
         * date : 2017-12-13
         * hum : 80
         * pcpn : 0.0
         * pop : 0
         * pres : 1037
         * tmp : {"max":"-16","min":"-25"}
         * uv : 1
         * vis : 20
         * wind : {"deg":"276","dir":"西风","sc":"3-4","spd":"11"}
         */

        private AstroBean astro;
        private More cond;
        private String date;
        private String hum;
        private String pcpn;
        private String pop;
        private String pres;
        @SerializedName("tmp")
        private Temperature tmperature;
        private String uv;
        private String vis;
        private WindBeanX wind;

        public AstroBean getAstro() {
            return astro;
        }

        public void setAstro(AstroBean astro) {
            this.astro = astro;
        }

        public More getCond() {
            return cond;
        }

        public void setCond(More cond) {
            this.cond = cond;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getHum() {
            return hum;
        }

        public void setHum(String hum) {
            this.hum = hum;
        }

        public String getPcpn() {
            return pcpn;
        }

        public void setPcpn(String pcpn) {
            this.pcpn = pcpn;
        }

        public String getPop() {
            return pop;
        }

        public void setPop(String pop) {
            this.pop = pop;
        }

        public String getPres() {
            return pres;
        }

        public void setPres(String pres) {
            this.pres = pres;
        }

        public Temperature getTmperature() {
            return tmperature;
        }

        public void setTmperature(Temperature tmperature) {
            this.tmperature = tmperature;
        }

        public String getUv() {
            return uv;
        }

        public void setUv(String uv) {
            this.uv = uv;
        }

        public String getVis() {
            return vis;
        }

        public void setVis(String vis) {
            this.vis = vis;
        }

        public WindBeanX getWind() {
            return wind;
        }

        public void setWind(WindBeanX wind) {
            this.wind = wind;
        }

        public static class AstroBean {
            /**
             * mr : 01:40
             * ms : 13:23
             * sr : 07:06
             * ss : 15:51
             */

            private String mr;
            private String ms;
            private String sr;
            private String ss;

            public String getMr() {
                return mr;
            }

            public void setMr(String mr) {
                this.mr = mr;
            }

            public String getMs() {
                return ms;
            }

            public void setMs(String ms) {
                this.ms = ms;
            }

            public String getSr() {
                return sr;
            }

            public void setSr(String sr) {
                this.sr = sr;
            }

            public String getSs() {
                return ss;
            }

            public void setSs(String ss) {
                this.ss = ss;
            }
        }

        public static class More {
            /**
             * code_d : 100
             * code_n : 100
             * txt_d : 晴
             * txt_n : 晴
             */

            private String code_d;
            private String code_n;
            @SerializedName("txt_d")
            private String info;
            private String txt_n;

            public String getCode_d() {
                return code_d;
            }

            public void setCode_d(String code_d) {
                this.code_d = code_d;
            }

            public String getCode_n() {
                return code_n;
            }

            public void setCode_n(String code_n) {
                this.code_n = code_n;
            }

            public String getInfo() {
                return info;
            }

            public void setInfo(String info) {
                this.info = info;
            }

            public String getTxt_n() {
                return txt_n;
            }

            public void setTxt_n(String txt_n) {
                this.txt_n = txt_n;
            }
        }

        public static class Temperature {
            /**
             * max : -16
             * min : -25
             */

            private String max;
            private String min;

            public String getMax() {
                return max;
            }

            public void setMax(String max) {
                this.max = max;
            }

            public String getMin() {
                return min;
            }

            public void setMin(String min) {
                this.min = min;
            }
        }

        public static class WindBeanX {
            /**
             * deg : 276
             * dir : 西风
             * sc : 3-4
             * spd : 11
             */

            private String deg;
            private String dir;
            private String sc;
            private String spd;

            public String getDeg() {
                return deg;
            }

            public void setDeg(String deg) {
                this.deg = deg;
            }

            public String getDir() {
                return dir;
            }

            public void setDir(String dir) {
                this.dir = dir;
            }

            public String getSc() {
                return sc;
            }

            public void setSc(String sc) {
                this.sc = sc;
            }

            public String getSpd() {
                return spd;
            }

            public void setSpd(String spd) {
                this.spd = spd;
            }
        }
    }
}
