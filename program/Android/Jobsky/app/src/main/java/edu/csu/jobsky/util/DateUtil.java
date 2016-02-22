package edu.csu.jobsky.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by huangxinqi on 16/2/22.
 */

/* create by huangxinqi 
    on 2016-02-21
    作用:
*/
public class DateUtil {
    /**
     * 根据日期返回对应的字符串
     * @param date
     * @return
     */
    public static String date2String(Date date){
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
        return simpleDateFormat.format(date);
    }

    /**
     * 根据字符串返回date
     *
     * @param time
     * @return
     */
    public static Date string2Date(String time) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            return simpleDateFormat.parse(time);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static String dateFormat(String date){
        SimpleDateFormat sdf = new SimpleDateFormat("MMM d, yyyy K:m:s a", Locale.ENGLISH);
        Date date2 = null;
        try {
            date2 = sdf.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date2String(date2);
    }
}
