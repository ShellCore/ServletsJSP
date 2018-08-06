<html>
    <head>
        <title>JSP que modifica a un JavaBean por par&aacute;metros</title>
    </head>
    <body>
        <h1>JSP que modifica a un JavaBean por par&aacute;metros</h1>
        <br><br>
        
        <!-- Declaramos el JavaBean a utilizar -->
        <jsp:useBean id="rectangulo"
                     type="beans.Rectangulo"
                     scope="session" />
        
        <!-- 
            Modificamos todas las variables cuyo parámetro coincida con el 
            nombre de la propiedad
        -->
        <jsp:setProperty name="rectangulo"
                         property="*" />
        
        Se modificaron todos los atributos:
        <br>
        Nuevo valor base: <%= request.getParameter("base") %>
        <br>
        Nuevo valor altura: <%= request.getParameter("altura") %>
        <br><br>
        
        <a href="index.jsp">Volver al inicio</a>
    </body>
</html>
