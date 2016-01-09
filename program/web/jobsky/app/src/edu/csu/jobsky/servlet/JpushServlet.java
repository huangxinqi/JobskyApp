package edu.csu.jobsky.servlet;

import edu.csu.jobsky.plugin.jpush.Jpush;
import edu.csu.jobsky.plugin.jpush.PushExample;
import edu.csu.jobsky.plugin.jpush.ScheduleExample;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by huangxinqi on 2015/12/16.
 *
 */
@WebServlet(name = "JpushServlet")
public class JpushServlet extends HttpServlet {
    private static final String masterKey="ef3fce2eeff792e7aea1c16a";
    private static final String appKey="a3e49e2eea2af3c77114f37d";
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //PushExample.buildPushObject_android_tag_alertWithTitle();
        ScheduleExample.testCreateSingleSchedule();
      // PushExample.testSendPush();
    }
}
