<!-- Con esta directiva importamos la librer�a de core JSTL -->
<%@taglib prefix="c"
          uri="http://java.sun.com/jsp/jstl/core" %>

<html>
    <head>
        <title>JSTL Core</title>
    </head>
    <body>
        <h1>JSTL Core</h1>
        <br>
        
        <!-- Manipulaci�n de variables -->
        <c:set var="nombre"
               value="Ernesto" />
        
        Variable nombre: <c:out value="${nombre}" />
        <br><br>
        
        Variable con c&oacute;digo HTML:
        <c:out value="<h1>Hola</h1>"
               escapeXml="true" />
        <br><br>
        
        <!-- C�digo condicionado, uso del if -->
        <c:set var="bandera" 
               value="true" />
        
        <c:if test="${bandera}">
            La bandera es verdadera
        </c:if>
        <br><br>
        
        <!-- C�digo condicionado, similar al switch -->
        <c:if test="${param.opcion != null}">
            <c:choose>
                <c:when test="${param.opcion == 1}">
                    Opci�n 1 Proporcionada
                </c:when>
                <c:when test="${param.opcion == 2}">
                    Opci�n 2 Proporcionada
                </c:when>
                <c:otherwise>
                    Opci�n proporcionada desconocida: ${param.opcion}
                </c:otherwise>
            </c:choose>
        </c:if>
        <br><br>
        
        <!-- Iteraci�n de una lista -->
        <%
            // Uso del scriptlet
            // Crearemos un arreglo con un scriptlet (aunque no es una buena pr�ctica)
            
            String[] nombres = {"Claudia", "Pedro", "Carlos", "Ana"};
            // Compartimos el arreglo de nombres en el alcance de request
            request.setAttribute("nombres", nombres);
        %>
        Lista de nombres en el arreglo:
        <br>
        <ul>
            <c:forEach varStatus="status"
                       var="persona"
                       items="${nombres}">
                <li>
                    ${status.count}. ${persona}
                </li>
            </c:forEach>
        </ul>
        <br><br>
        
        <a href="index.jsp">Volver al inicio</a>
    </body>
</html>
