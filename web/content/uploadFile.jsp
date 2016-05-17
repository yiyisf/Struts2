<%--
  Created by IntelliJ IDEA.
  User: liuzhe
  Date: 2016/5/17
  Time: 14:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%--<s:form action="upload" method="post" enctype="multipart/form-data">--%>
    <%--<s:file name="upload" label="File"/>--%>
    <%--<s:submit/>--%>
<%--</s:form>--%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="upload" method="post" enctype="multipart/form-data">
    <label for="upload">Upload your file</label>
    <input type="file" name="upload"/>
    <input type="submit" value="Upload"/>
</form>
</body>
</html>
