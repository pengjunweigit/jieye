<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2019/10/13
  Time: 13:47
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
<table border="1" cellpadding="5" cellspacing="0" width="60%">
    <tr>
        <td colspan="2"> <h1>企业工单管理系统</h1></td>
    </tr>
    <tr>
        <td>选择项目</td>
        <td>
            <form action="${pageContext.request.contextPath}/toAdd.do" method="post">
            <select name="projectId" id="projectId">
            <c:forEach items="${projectList}" var="project">
                <option value="${project.id}">${project.projectName}</option>
            </c:forEach>
        </select>
                <input type="submit" value="确定">
            </form>
        </td>
    </tr>
</table>
</center>

</body>
</html>
