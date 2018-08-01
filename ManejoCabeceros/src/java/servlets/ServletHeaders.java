package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ServletHeaders", urlPatterns = {"/ServletHeaders"})
public class ServletHeaders extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            // Procesamos los headers relacionados con la información de la petición
            String metodoHttp = request.getMethod();
            String uri = request.getRequestURI();
            
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Headers HTTP</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Headers HTTP</h1>");
            out.println("Metodo HTTP: " + metodoHttp);
            out.println("<br>");
            out.println("Uri solicitado: " + uri);
            out.println("<br>");
            // Procesamos algunos cabeceros que son parte de la petición
            out.println("<br>");
            out.println("Host: " + request.getHeader("Host"));
            out.println("<br>");
            out.println("Navegador: " + request.getHeader("User-Agent"));
            out.println("<br>");
            // Procesamos todos los cabeceros. Estos pueden variar según el navegador que se utilice
            out.println("<br>");
            Enumeration cabeceros = request.getHeaderNames();
            while(cabeceros.hasMoreElements()) {
                String nombreCabecero = (String) cabeceros.nextElement();
                out.println("<b>" + nombreCabecero + "</b>: " + request.getHeader(nombreCabecero) + "");
                out.println("<br>");
            }
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }
}
