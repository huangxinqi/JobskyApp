<%--
  Created by IntelliJ IDEA.
  User: huangxinqi
  Date: 2015/12/16
  Time: 13:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Jpush控制台</title>
    <script type="text/javascript">
      function send(){
        window.location.href="jpush";
      }
    </script>
  </head>
  <body>
  <input type="button" value="发送通知" id="btnSend" onclick="send()" />
  </body>
</html>
