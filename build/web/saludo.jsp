<%-- 
    Document   : saludo.jsp
    Created on : 02-mar-2020, 20:43:52
    Author     : W10
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1><s:property value="mensaje" /></h1>
          <a href="index.jsp">Index</a>
        </br>
        <a href="saludoUsuario">Saludo Usuario</a>
    </body>
</html>
