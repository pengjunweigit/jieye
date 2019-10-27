<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2019/10/13
  Time: 13:56
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
        <form action="${pageContext.request.contextPath}/add.do" method="post" onsubmit="return checked()">
            <input type="hidden" name="projectId" value="${projectId}">
        <table border="1" cellpadding="5" cellspacing="0" width="50%">
            <tr>
                <td colspan="2"><h1>添加工单</h1></td>
            </tr>
            <tr>
                <td>执行人(*)</td>
                <td><input type="text" name="executor" id="executor"></td>
            </tr>
            <tr>
                <td>任务描述(*)</td>
                <td><textarea name="description" id="description"></textarea> </td>
            </tr>
            <tr>
                <td>级别</td>
                <td><select name="orderLevel" id="orderLevel">
                    <option value="1">1级</option>
                    <option value="2">2级</option>
                    <option value="3">3级</option>
                </select></td>
            </tr>
            <tr>
                <td colspan="2" align="center ">
                    <input type="submit" value="提交">
                </td>
            </tr>
        </table>
        </form>
    </center>
    <script>
        function checked() {
            if ($("#executor").val()==''){
                alert("执行人不能为空！")
                return false
            }
            if ($("#description").val()==''){
                alert("任务描述不能为空！")
                return false
            }
            return true
        }
    </script>
</body>
</html>
