<%--
  Created by IntelliJ IDEA.
  User: liuzhe
  Date: 2016/5/17
  Time: 10:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Hello World</title>
</head>
<body>
Hello World, <s:property value="name"/></body><br>

<s:select name="color" list="{'red','yellow','green'}" /><br>

<s:date name="date" format="YYYYMMDD" /><br>
</body>
</html>
