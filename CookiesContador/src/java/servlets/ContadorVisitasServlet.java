package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ContadorVisitasServlet", urlPatterns = {"/ContadorVisitasServlet"})
public class ContadorVisitasServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
            throws ServletException, IOException {
        // Declaramos la variable contador
        int contador = 0;
        
        // Si existe obtenemos el contador de visitas actual
        Cookie[] cookies = req.getCookies();
        if (cookies != null) {
            for (Cookie c : cookies) {
                if (c.getName().equals("contadorVisitas")) {
                    try {
                        // Obtenemos el valor del contador de visitas actual
                        contador = Integer.parseInt(c.getValue());
                    } catch (NumberFormatException e) {
                        // En caso de error, reiniciamos el contador de visitas
                        contador = 0;
                    }
                }
            }
        }
        
        // Incrementamos el contador de visitas y actualizamos la cookie en la 
        // respuesta
        contador++;
        Cookie c = new Cookie("contadorVisitas", String.valueOf(contador));
        // La cookie se almacenará en el cliente por 1 hora (3600 segundos)
        c.setMaxAge(3600);
        resp.addCookie(c);
        
        // Mandamos el mensaje al navegador
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        out.println("Contador de visitas de cada cliente: " + contador);
    }
}
