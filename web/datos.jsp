<%-- 
    Document   : datos
    Created on : 02-mar-2020, 20:55:15
    Author     : W10
--%>
<%@taglib uri="/struts-tags" prefix="s" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <s:form action="saludoUsuario">
            <s:textfield label="Nombre" name="nombre" />
            <s:textfield label="Número de la suerte" name="numero" />
            <s:submit value="Enviar" />
        </s:form>
    </body>
</html>
