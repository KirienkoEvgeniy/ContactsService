<%--
  Created by IntelliJ IDEA.
  User: Evgeniy
  Date: 10.05.2016
  Time: 15:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border= "0" cellpadding="10" bgcolor="#ffcc00" align="left"
       width="200px" height="150px">
    <th>ID</th>
    <th>ID_file</th>
    <th>MAX</th>
    <th>MIN</th>
    <th>AVER</th>
    <th>LENGHT</th>

    <c:forEach var="rowFile" items="${listFile}" varStatus="status">
        <tr>
            <td>${aRowFile.id_row}</td>
            <td>${aRowFile.id}</td>
            <td>${aRowFile.maxWordr}</td>
            <td>${aRowFile.minWordr}</td>
            <td>${aRowFile.averWordr}</td>
            <td>${aRowFile.lenghtrow}</td>

        </tr>
    </c:forEach>
</table>
</body>
</html>
