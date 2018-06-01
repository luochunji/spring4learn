<%--
  Created by IntelliJ IDEA.
  User: luocj
  Date: 2018/5/31
  Time: 15:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>UserList</title>
</head>
<body>
<c:forEach items="${userList}" var="user">
    <div>
        ${user.username}:${user.age}
    </div>
</c:forEach>
</body>
</html>
