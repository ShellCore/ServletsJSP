<html>
    <head>
        <title>Ejemplo de inclusi�n est�tica</title>
        <script type="text/javascript"
                src="recursos/funciones.js">
        </script>
        <link rel="stylesheet" 
              type="text/css"
              href="recursos/estilos.css"/>
    </head>
    <body>
        <h1>Inclusi�n de Archivos est�ticos</h1>
        
        <!-- Esto es por cada men� -->
        <br>
        <!-- Men� principal -->
        <span class="noticias"
              align="left">
            <a href="javascript:desplegar('noticias');">
                <img src="http://icursos.net/cursos/ServletsJSPs/Leccion14/noticias.gif" 
                     border='0'>
            </a>
        </span>
        <span id="noticias" 
              class="ocultar_menu">
            <!-- Submenu -->
            <ul>
                <li><%@include file="pages/noticia1.html" %></li>
                <li><%@include file="pages/noticia2.html" %></li>
            </ul>
        </span>
        
        <!-- Esto es por cada men� -->
        <br>
        <!-- Men� principal -->
        <span class="videos" 
              align="left">
            <a href="javascript:desplegar('videos');">
                <img src="http://icursos.net/cursos/ServletsJSPs/Leccion14/videos.gif"
                     border='0'>
            </a>
        </span>
        <span id="videos" 
              class="ocultar_menu">
            <!-- Submenu -->
            <ul>
                <li><%@include file="pages/video1.html" %></li>
            </ul>
        </span>
    </body>
</html>
 