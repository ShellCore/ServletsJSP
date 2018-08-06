<html>
    <head>
        <meta charset="UTF-8">
        <title>JSP que modifica un JavaBean</title>
    </head>
    <body>
        <h1>JSP que modifica un JavaBean</h1>
        <br>
        <br>
        
        <!-- Declaramos el JavaBean a utilizar -->
        <jsp:useBean id="rectangulo"
                     type="beans.Rectangulo"
                     scope="session" />
        Modificamos los atributos:
        <br><br>
        <%
            // Valores en código duro
            int baseValor = 5;
            int alturaValor = 10;
        %>
        
        <jsp:setProperty name="rectangulo"
                         property="base"
                         value="<%= baseValor %>" />
        <jsp:setProperty name="rectangulo"
                         property="altura"
                         value="<%= alturaValor %>" />
                         
        Nuevo valor base: <%= baseValor %>
        <br>
        Nuevo valor altura: <%= alturaValor %>
        <br><br>
        <a href="index.jsp">Volver al inicio</a>
    </body>
</html>
