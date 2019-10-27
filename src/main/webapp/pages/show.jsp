<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2019/10/13
  Time: 14:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="utf-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="../static/jquery-1.12.4.js"></script>
</head>
<body>
<center>
    <table  border="1" cellpadding="5" cellspacing="0" width="60%">
        <tr><td colspan="6" align="center"><h1>产品信息列表</h1></td></tr>
        <tr>
            <th>产品名称</th>
            <th>生产日期</th>
            <th>产品描述</th>
            <th>质检结果</th>
            <th>生产数量</th>
            <th>产品价格</th>
            <th>操作</th>
        </tr>
        <c:forEach items="${productsList}" var="work">
            <tr class="col">
                <td>${work.productName }</td>
                <td><fmt:formatDate value="${work.productDare}" pattern="yyyy-MM-dd"/></td>
                <td>${work.productDesc}</td>
                <td>${work.qualities.score}</td>
                <td>${work.productSum}</td>
                <td>${work.productPrice}</td>
                <td>
                    <a href="javascript:toUpdate(${work.id})">修改</a>&nbsp;&nbsp;
                    <a href="javascript:toDel(${work.id})">删除</a>
                </td>
            </tr>
        </c:forEach>

        <tr>
            <td colspan="6" id="msg" align="center"> <font color="red">${insert}</font></td>
        </tr>
    </table>
</center>
<script>

</script>
</body>
</html>
