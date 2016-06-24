<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: liuzhe
  Date: 2016/5/17
  Time: 17:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome</title>
</head>
<body>
欢迎你,<s:property value="name"/>
<br><br>
ActionContext: ${applicationScope.ApplicationContextKey} <br><br>

ActionAware: ${applicationScope.ApplicationAwareKey} <br><br>
</body>
</html>
