package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Servlet", urlPatterns = {"/Servlet"})
public class Servlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        String user = request.getParameter("user");
        String pass = request.getParameter("pass");
        
        // El elemento Tecnología puede tener varios valores. Por ello lo procesamos como un arreglo
        String[] tecnologias = request.getParameterValues("tecnologia");
        
        String genero = request.getParameter("genero");
        
        String ocupacion = request.getParameter("ocupacion");
        
        // El componente de música indica que se pueden seleccionar múltiples elementos, por ello lo procesamos como un arreglo
        String[] musica = request.getParameterValues("musica");
        
        String comentario = request.getParameter("comentarios");
        
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Resultado Servlet</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Parámetros procesados por el servlet:</h1>");
        out.println("<table border='1'>");
        out.println("<tr>");
        out.println("<td>Usuario</td>");
        out.println("<td>" + user + "</td>");
        out.println("</tr>");
        out.println("<tr>");
        out.println("<td>Contraseña</td>");
        out.println("<td>" + pass + "</td>");
        out.println("</tr>");
        out.println("<tr>");
        out.println("<td>Tecnologias</td>");
        out.println("<td>");
        for (String tecnologia : tecnologias) {
            out.print(tecnologia + " / ");
        }
        out.println("</td>");
        out.println("</tr>");
        out.println("<tr>");
        out.println("<td>Género</td>");
        out.println("<td>" + genero + "</td>");
        out.println("</tr>");
        out.println("<tr>");
        out.println("<td>Ocupación</td>");
        out.println("<td>" + ocupacion + "</td>");
        out.println("</tr>");
        out.println("<tr>");
        out.println("<td>Música favorita</td>");
        out.println("<td>");
        if (musica != null) {
            for(String mus : musica) {
                out.print(mus);
            }
        }
        out.println("</td>");
        out.println("</tr>");
        out.println("<tr>");
        out.println("<td>Comentarios</td>");
        out.println("<td>" + comentario + "</td>");
        out.println("</tr>");
        out.println("</table>");
        out.println("</body>");
        out.println("</html>");
        out.close();
    }
}
