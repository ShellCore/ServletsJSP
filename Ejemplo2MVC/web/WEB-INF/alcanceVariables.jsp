<html>
    <head>
        <meta charset="UTF-8">
        <title>Alcance de variables</title>
    </head>
    <body>
        <h1>Alcance de variables</h1>
        <br>
        Variable request:
        Base: ${rectanguloRequest.base}
        Altura: ${rectanguloRequest.altura}
        Area: ${rectanguloRequest.area}
        <br><br>
        Variable Session:
        Base: ${rectanguloSession.base}
        Altura: ${rectanguloSession.altura}
        Area: ${rectanguloSession.area}
        <br><br>
        Variable Application:
        Base: ${rectanguloApplication.base}
        Altura: ${rectanguloApplication.altura}
        Area: ${rectanguloApplication.area}
        <br><br>
        <a href="${pageContext.request.contextPath}/index.jsp">Volver al inicio</a>
    </body>
</html>
