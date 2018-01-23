<%--
  Created by IntelliJ IDEA.
  User: czl
  Date: 2018/1/12
  Time: 15:38
  To change this template use File | Settings | File Templates.
--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="th" uri="http://www.springframework.org/tags/form" %>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<html>
<head>
    <title>管理系统 —— ——登陆</title>
    <link href="${ctx}/css/login.css" rel="stylesheet" type="text/css"/>

</head>
<body>
    <div class="header">
        <%--<button class="button" type="button" value="">注册</button>--%>
            <%--href="/register.jsp"--%>
        <a class="register" href="/register">注册</a>
    </div>
    <div class="content">
        <h1>登陆</h1>
        <div class="login-form">
            <form action="/dologin" method="post">
                <input id="account" type="text" name="account" placeholder="账号"><br>
                <input id="password" type="password" name="password" placeholder="密码"><br>
                <input class="button" type="submit" value="登陆">
            </form>
        </div>
    </div>

    <div class="footer">
        <hr>
        <p>欢迎</p>
    </div>
</body>
</html>
