<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: mtime
  Date: 2018/9/10
  Time: 上午10:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <base href="<%=basePath%>">

    <title>登录页面</title>

    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">
    <!--
    <link rel="stylesheet" type="text/css" href="styles.css">
    -->
</head>

<br>
<%--<form action="loginAction" method="post">--%>
    <%--<table>--%>
        <%--<tr>--%>
            <%--<td colspan="2">登录窗口</td>--%>
        <%--</tr>--%>
        <%--<tr>--%>
            <%--<td>用户名：</td>--%>
            <%--<td><input type="text" name="username" />--%>
            <%--</td>--%>
        <%--</tr>--%>
        <%--<tr>--%>
            <%--<td>密码：</td>--%>
            <%--<td><input type="password" name="password" />--%>
            <%--</td>--%>
        <%--</tr>--%>
        <%--<tr>--%>
            <%--<td colspan="2"><input type="submit" value="登录" /> <a href="register">注册</a>--%>
            <%--</td>--%>
        <%--</tr>--%>
    <%--</table>--%>
<%--</form>--%>

<%--<br>contextpath=--%>
<%--${pageContext.request.contextPath}--%>
<%--<br>path=--%>
<%--<%=path%>--%>
<%--<br>basepath=--%>
<%--<%=basePath%>--%>
<%--<br>--%>

<script type="text/javascript">
    function js_post() {
        alert("process : 1")
        var formData = new FormData($("#form-add")[0]);
//        var form = document.getElementById("form-add");
//        var formData = new FormData(form);
//        var formData = new FormData();
//        formData.append("username", "dhb");
//        formData.append("password", "123456");
        $.ajax({
            url:"loginAction",
            type:"post",
            dataType:"json",
            data: formData,
            cache: false,
            async: false,
            processData: false,  // 不处理数据
            contentType: false,   // 不设置内容类型
            success:function (data) {
                <%--alert("url : " + '${pageContext.request.contextPath}');--%>
//                window.clearInterval(timer);
                alert("ajax success : ");
                $("#div1").html("1111111111111111");
//                window.location.href="welcome";
            },
            error:function (e) {
                <%--alert("url : " + '${pageContext.request.contextPath}');--%>
                alert("ajax error");
//                window.clearInterval(timer);
//                window.location.href="register";
                $("#div1").html(e);

            }
        });
    }
</script>

<div class="login_style">
<div id="login_id">
<form id="form-add" enctype="multipart/form-data">
    <table>
        <tr>
            <td colspan="2" align="center">登录窗口</td>
        </tr>
        <tr>
            <td align="center">用户名：</td>
            <td align="center"><input type="text" name="username" />
            </td>
        </tr>
        <tr>
            <td align="center">密码：</td>
            <td align="center"><input type="password" name="password" />
            </td>
        </tr>
        <tr>
            <td colspan="2" align="center"><input type="button" value="登录" onclick="js_post()" /> <a href="register">注册</a>
            </td>
        </tr>
    </table>
</form>
</div>
<div id="div1">

</div>
</div>
<style>
.login_style {
background-color:black;
color:white;
margin:20px;
padding:20px;
}
</style>


<script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
<%--<script src="Jqu"></script>--%>
</body>
</html>


