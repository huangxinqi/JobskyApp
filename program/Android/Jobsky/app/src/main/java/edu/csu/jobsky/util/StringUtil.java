package edu.csu.jobsky.util;

/**
 * Created by huangxinqi on 16/2/26.
 */

/* create by huangxinqi 
    on 2016-02-26
    作用:
*/
public class StringUtil {
    /**
     * 将html富文本代码转换成纯文字
     * @param htmlStr
     * @return
     */
    public static String htmlToStr(String htmlStr) {
        String result = "";
        boolean flag = true;
        if (htmlStr == null) {
            return null;
        }
        htmlStr = htmlStr.replace("\"", ""); // 去掉引号
        htmlStr=htmlStr.replaceAll("&nbsp;","");
        htmlStr=htmlStr.replaceAll("$amp;","");
        htmlStr=htmlStr.replaceAll("\n","");
        char[] a = htmlStr.toCharArray();
        int length = a.length;
        for (int i = 0; i < length; i++) {
            if (a[i] == '<') {
                flag = false;
                continue;
            }
            if (a[i] == '>') {
                flag = true;
                continue;
            }
            if (flag == true) {
                result += a[i];
            }
        }
        return result.toString();
    }
}
