<html>
    <head>
        <meta charset="UTF-8">
        <title>Despliegue de variables</title>
    </head>
    <body>
        <h1>Despliegue de variables</h1>
        
        Variable en alcance request:
        <br>
        ${mensaje}
        <br><br>
        
        Variable en alcance session:
        <br>
        Rect&aacute;ngulo:
        Base: ${rectangulo.base}
        Altura: ${rectangulo.altura}
        Area: ${rectangulo.area}
        <br><br>
        <a href="${pageContext.request.contextPath}/index.jsp">Volver al inicio</a>
    </body>
</html>
