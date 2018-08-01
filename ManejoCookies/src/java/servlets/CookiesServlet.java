package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "CookiesServlet", urlPatterns = {"/CookiesServlet"})
public class CookiesServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
            throws ServletException, IOException {
        // Suponemos que el usuario está visitando por primera vez nuestro sitio
        boolean nuevoUsuario = true;
        
        // Obtenemos todas las cookies
        Cookie[] cookies = req.getCookies();
        
        // Buscamos si ya existe una cookie creada con anterioridad llamada 
        // visitanteRecurrente
        if (cookies != null) {
            for (Cookie c : cookies) {
                if (c.getName().equals("visitanteRecurrente")
                        && c.getValue().equals("si")) {
                    // En caso de que ya exista una cookie indicando que ya 
                    // existe un usuario registrado con anterioridad, ponemos la
                    // bandera en falso y salimos del ciclo
                    nuevoUsuario = false;
                    break;
                }
            }
        }
        // Revisamos si el nuevo usuario es un nuevo visitante
        String mensaje = null;
        if (nuevoUsuario) {
            // En caso de ser un nuevo usuario creamos el objeto Cookie
            Cookie visitanteRecurrente = new Cookie("visitanteRecurrente", "si");
            // Agregamos la cookie en la respuesta
            resp.addCookie(visitanteRecurrente);
            mensaje = "Gracias por visitar nuestro sitio";
        } else {
            mensaje = "Gracias por visitar NUEVAMENTE nuestro sitio";
        }
        
        // Escribimos la salida
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        out.println("Mensaje: " + mensaje);
        out.close();
    }
}
