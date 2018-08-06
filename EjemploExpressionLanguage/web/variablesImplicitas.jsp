<html>
    <head>
        <title>EL y variables impl&iacute;citas</title>
    </head>
    <body>
        <h1>EL y variables impl&iacute;citas</h1>
        <br>
        <ul>
            <li>Nombre aplicaci&oacute;n: ${pageContext.request.contextPath}</li>
            <li>Navegador del cliente: ${header["User-Agent"]}</li>
            <li>Id Sesi&oacute;n: ${cookie.JSESSIONID.value}</li>
            <li>Web Servler: ${pageContext.servletContext.serverInfo}</li>
            <li>Valor par&aacute;metro Usuario: ${param["usuario"]}</li>
        </ul>
        <br> <br>
        <a href="index.jsp">Volver al inicio</a>
    </body>
</html>
