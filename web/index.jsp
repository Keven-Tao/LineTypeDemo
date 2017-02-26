<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: KevenTao
  Date: 2017/2/26
  Time: 下午2:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <center>
    <s:form action="line">
      <s:textfield name="line" label="Line input,please input (x1,y1,x2,y2)!"/>
      <s:submit/>
    </s:form>
  </center>
  </body>
</html>
