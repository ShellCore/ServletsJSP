<html>
    <head>
        <title>Ejemplo JavaBeans</title>
        <meta charset="UTF-8">
    </head>
    <body>
        <h1>Ejemplo de JavaBeans</h1>
        <br>
        <!-- JSP para modificar valores -->
        <a href="setterJsp.jsp">Modificar valores del JavaBean</a>
        <br>
        <!-- JSP para leer valores del JavaBean -->
        <a href="getterJsp.jsp">Leer valores del JavaBean</a>
        <br>
        <br>
        
        <!-- JSP para recuperar parámetros de un formulario -->
        <!-- Formulario 1 -->
        Formulario 1:
        <br>
        <form action="setterParamJsp.jsp"
              name="form1">
            Base: <input type="text"
                         name="baseParam">
            <br>
            Altura: <input type="text"
                           name="alturaParam">
            <br>
            <input type="submit"
                   value="Enviar">
        </form>
        <br><br>
        
        <!-- Formulario 2 -->
        <form action="setterAllParamsJsp.jsp"
              name="form2">
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
