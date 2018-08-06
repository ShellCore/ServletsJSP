<html>
    <head>
        <title>Acceso Java Beans</title>
    </head>
    <body>
        <h1>Acceso Java Beans</h1>
        <jsp:useBean id="rectangulo"
                     class="beans.Rectangulo" />
        
        <!-- Asignamos los valores del formulario al JavaBean -->
        <jsp:setProperty name="rectangulo"
                         property="*" />
        <br>
        Valor base: ${rectangulo.base}
        <br>
        Valor altura: ${rectangulo.altura}
        <br>
        Valor &aacute;rea: ${rectangulo.area}
        <br><br>
        <a href="index.jsp">Volver al inicio</a>
    </body>
</html>
