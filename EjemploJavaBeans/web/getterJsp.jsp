<html>
    <head>
        <title>JSP que lee valores del Java Bean</title>
    </head>
    <body>
        <h1>JSP que lee valores del Java Bean</h1>
        <br>
        <!-- 
            Declaramos el JavaBean a utilizar. Si ya existe un bean en la sesión
            llamado "rectangulo", regresa el mismo objeto y no crea uno nuevo.
        -->
        <jsp:useBean id="rectangulo"
                     class="beans.Rectangulo"
                     scope="session" />
        
        <!-- Recuperamos los valores y los desplegamos -->
        <br>
        Valor base:<jsp:getProperty name="rectangulo"
                         property="base" />
        <br>
        Valor altura: <jsp:getProperty name="rectangulo"
                         property="altura" />
        <br>
        <!--
            En este caso, no importa que la propiedad no exista en el JavaBean,
            solo con tener un método llamado getArea() es posible simular una
            propiedad
        -->
        Valor &aacute;rea: <jsp:getProperty name="rectangulo"
                         property="area" />
        <br><br>
        <a href="index.jsp">Regresar al inicio</a>
    </body>
</html>
