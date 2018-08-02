<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP con Scriptlets</title>
    </head>
    <body>
        <h1>JSP con Scriptlets</h1>
        <br>
        <!-- Scriptlet para enviar información al navegador -->
        <%
            out.println("Saludos desde un scriptlet");
        %>
        <br>
        
        <!-- Scriptlet para manipular los objetos implícitos -->
        <%
            String nombreApp = request.getContextPath();
            out.println("Nombre de aplicación: " + nombreApp);
        %>
        
        <!-- Scriptlet con código condicionado -->
        <%
            if (session != null
                    && session.isNew()) {
        %>
        La sesión SI es nueva
        <%
            } else if (session != null) {
        %>
        La sesión NO es nueva
        <%
            }
        %>
    </body>
</html>
