<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Hola Mundo JSPs</title>
    </head>
    <body>
        <h1>Ejercicio Hola Mundo con JSPs</h1>
        <!--Impresión de cadenas con diferentes tecnologías-->
        <ul>
            <li>Hola Mundo con HTML</li>
            <li><% out.print("Hola mundo con Scriptlets");%></li>
            <li>${"Hola mundo con Expression Language (EL)"}</li>
            <li><c:out value="Hola mundo con JSTL" /></li>
        </ul>
        
        <!-- Algunos valores del lado del servidor -->
        <ul>
            <li>Hola: <%= new java.util.Date() %></li>
            <li>
                Nombre del contexto de la aplicaci&oacute;n: 
                <%= request.getContextPath()%>
            </li>
            <li>
                Valor por par&aacute;metro x: 
                <%= request.getParameter("x")%>
            </li>
        </ul>
    </body>
</html>
