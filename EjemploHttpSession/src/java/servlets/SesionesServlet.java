package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "SesionesServlet", urlPatterns = {"/SesionesServlet"})
public class SesionesServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        HttpSession session = req.getSession();
        String titulo = null;
        
        // Pedimos el atributo, y verificamos si existe
        Integer contadorVisitas = (Integer) session.getAttribute("contadorVisitas");
        
        // Si es igual a nulo, quiere decir que es la primera vez que entramos 
        // al recurso
        
        if (contadorVisitas == null) {
            contadorVisitas = 1;
            titulo = "Bienvenido por primera vez...";
        } else {
            // Si es distinto de nulo, incrementamos el contador
            contadorVisitas++;
            titulo = "Bienvenido nuevamente...";
        }
        
        // En cualquier caso, agregamos el valor del contador a la sesión
        session.setAttribute("contadorVisitas", contadorVisitas);
        
        // Mostramos los valores en el cliente
        PrintWriter out = resp.getWriter();
        out.println("Título: " + titulo + "");
        out.println("<br>");
        out.println("No. de accesos al recurso: " + contadorVisitas + "");
        out.println("<br>");
        out.println("Id de la sesión: " + session.getId());
    }
}
