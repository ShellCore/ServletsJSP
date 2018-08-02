<%-- Agregamos una declaraciones --%>
<%!
    // Declaramos una variable con su metodo get
    private String usuario = "Alberto";

    public String getUsuario() {
        return this.usuario;
    }

    // Declaramos un contador de vusutas
    private int contadorVisitas = 1;
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Uso de Declaraciones</title>
    </head>
    <body>
        <h1>Uso de Declaraciones</h1>
        Usuario por medio del atributo: <%= this.usuario %>
        <br>
        Usuario por medio del metodo: <%= this.getUsuario() %>
        <br>
        
        Contador de vusutas desde que se reinici� el servidor:
        <%= this.contadorVisitas++ %>
    </body>
</html>
