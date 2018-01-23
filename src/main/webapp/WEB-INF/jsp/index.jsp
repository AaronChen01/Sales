<%@ page import="java.util.List" %>
<%@ page import="com.sales.dao.Goods" %>
<%@ page import="com.sales.repository.GoodsRepository" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="th" uri="http://www.springframework.org/tags/form" %>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <link href="${ctx}/css/index.css" rel="stylesheet" type="text/css"/>

    <title>销售管理系统</title>
</head>

<body>
<div class="header">
    <div class="logo">
        <a href="./index.html">&nbsp;销售管理&nbsp;</a>
    </div>

    <!--导航条-->
    <div class="old" >
        <ul class="nav1">
            <li class="dh1"><a href="">销售管理</a></li>
            <li class="dh2"><a href="">库存管理</a></li>
            <li class="dh3"><a href="">提成计算</a></li>
            <li class="dh4"><a href="">数据报表</a></li>
            <li class="dh5"><a href="">数据查询</a></li>
        </ul>
    </div>

    <div class="showuser">
        <a class="showName" href="/userInfonfo">${user.username}</a>
        <a class="showName">用户名：</a>
    </div>

</div>
<hr/>

<table class="table" border="2" style="text-align: center">
    <thead>
        <tr>
            <td>编号</td>
            <td>目录</td>
            <td>品名</td>
            <td>单价</td>
            <td>重量</td>
            <td>单位</td>
            <td>总价</td>
        </tr>
    </thead>
    <tbody>
    <tr>
        <td><a>${good[0].id}</a></td>
        <td><a>${good[0].category}</a></td>
        <td><a>${good[0].name}</a></td>
        <td><a>${good[0].unit_price}</a></td>
        <td><a>${good[0].weight}</a></td>
        <td><a>${good[0].unit}</a></td>
        <td><a>${good[0].total_price}</a></td>
    </tr>
    </tbody>

</table>
<%--th:action="@{/index/doadd}" th:object="${obj}"--%>
<form action="/doadd"  method="post">
    <table border="1" style="text-align: center">
    <thead >
            <tr style="align-content: center">
                <td><a>添加新数据</a></td>
            </tr>
    </thead>
    <tbody>
        <tr>
            <td><label for="cate">类别</label> </td>
            <td><input id="cate" name="category"></td>
        </tr>
        <tr>
            <td><label for="name_input">品名</label> </td>
            <td><input id="name_input" name="name"></td>
        </tr>
        <tr>
            <td><label for="unitp_input">单价</label> </td>
            <td><input id="unitp_input" name="unit_price"></td>
        </tr>
        <tr>
            <td><label for="weight_input">重量</label> </td>
            <td><input id="weight_input" name="weight"></td>
        </tr>
        <tr>
            <td><label for="unit_input">单位</label> </td>
            <td><input id="unit_input" name="unit"></td>
        </tr>
    </tbody>
            <input type="submit" title="确定" value="submit" onclick="hello()">
        <input type="button" value="test" onclick="test()">
        <script >

            function test() {
                console.log("test ok");
                <%--var str1 = <%=good[0].name%>;--%>
                // var String
                alert(goods[0].name);
            }
            function hello() {
                console.log("hello");
                var x = document.getElementsByTagName("input");
                console.log(">>>>>> ",x[0].value," " ,x[1].value," ",x[2].value,"<<<<<<<<");
                for (var i = 0;i < x.length;i++){
                    if(x[i] == ''){
                        alert("请填写完整信息");
                        return ;
                    }
                }
                // onsubmit();
            }
        </script>
    </table>
</form>
</body>
</html>