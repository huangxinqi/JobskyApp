package edu.csu.jobsky.api;

import com.google.gson.Gson;

import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.x;

import edu.csu.jobsky.bean.WeatherBean;

/**
 * Created by huangxinqi on 16/2/19.
 */

/* create by huangxinqi 
    on 2016-02-19
    作用:天气API
*/
public class WeatherAPI {
    String sample="http://apicloud.mob.com/v1/weather/query?key=f922b4f31ebd&city=%E9%80%9A%E5%B7%9E&province=%E5%8C%97%E4%BA%AC";
    String apiKey="f922b4f31ebd";
    String url="http://apicloud.mob.com/v1/weather/query";
    String province="湖南";
    String city="长沙";
    WeatherBean weatherBean=new WeatherBean();

    /**
     * 这是一个天气请求事例
     * @return
     */
    public  WeatherBean getWeather(){

        RequestParams params=new RequestParams("http://apicloud.mob.com/v1/weather/query");
        params.addQueryStringParameter("city","长沙");
        params.addQueryStringParameter("province","湖南");
        x.http().get(params, new Callback.CommonCallback<String>() {
            @Override
            public void onSuccess(String s) {
                weatherBean=new Gson().fromJson(s,WeatherBean.class);
            }

            @Override
            public void onError(Throwable throwable, boolean b) {

            }

            @Override
            public void onCancelled(CancelledException e) {

            }

            @Override
            public void onFinished() {

            }
        });
        return weatherBean;
    }
}
