<%--
  Created by IntelliJ IDEA.
  User: wilder
  Date: 28/05/18
  Time: 15:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="custom-hello.css" />
    <title>Title</title>
</head>
<body>
<h2>
<%
    String sample = (String) request.getAttribute("sample");
    out.println(sample);
%>
</h2>
</body>
</html>
