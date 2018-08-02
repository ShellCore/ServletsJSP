<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    String fondo = request.getParameter("backgroundColor");
    // Si no se envió un color, ponemos un color por default
    if (fondo == null || fondo.trim().equals("")) {
        fondo = "white";
    }
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cambio de color de fondo</title>
    </head>
    <body bgcolor="<%= fondo %>">
        <h1>Fondo de color aplicado: <%= fondo %></h1>
        <br>
        <a href="index.html">Regresar al inicio</a>
    </body>
</html>
