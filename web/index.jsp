<%--
  Created by IntelliJ IDEA.
  User: liuzhe
  Date: 2016/5/17
  Time: 9:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Hello World</title>
</head>
<body>
<h1>Hello World From Struts2</h1>
<form action="hello" method="post">
    <label for="name">Please enter your name</label><br/>
    <input type="text" name="name"/>
    <input type="submit" value="Say Hello"/>
</form>
<br><br>
<a type="button" href="content/uploadFile.jsp">上传文件</a><br><br>

<a href="content/Login.jsp">登录</a>
</body>
</html>
