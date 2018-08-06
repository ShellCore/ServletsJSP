<html>
    <head>
        <title>Ejemplo Expression Language</title>
    </head>
    <body>
        <h1>Ejemplo Expression Language</h1>
        <br><br>
        <a href="variablesImplicitas.jsp?usuario=juan">Objetos impl&iacute;citos con EL</a>
        <br><br>
        
        <!-- Entramos al JSP que accede al JavaBean -->
        Formulario HTML:
        <br>
        <form action="accesoJavaBeans.jsp"
              name="form1">
            Base: <input type="text"
                           name="base">
            <br>
            Altura: <input type="text"
                           name="altura">
            <br>
            <input type="submit"
                    value="Enviar">
        </form>
    </body>
</html>
