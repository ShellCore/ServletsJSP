package controller;

import java.io.IOException;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Rectangulo;

@WebServlet(name = "ServletControlador", urlPatterns = {"/ServletControlador"})
public class ServletControlador extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        // Procesar la petición
        // 1. Procesamos los parámetros
        String accion = req.getParameter("accion");
        
        // 2. Creamos los JavaBeans a compartir
        Rectangulo recRequest = new Rectangulo(1, 2);
        Rectangulo recSession = new Rectangulo(3, 4);
        Rectangulo recApplication = new Rectangulo(5, 6);
        
        if (accion != null) {
            switch (accion) {
                case "agregaVariables":
                    // 3. Compartimos las variables en el alcance seleccionado

                    // Alcance request
                    req.setAttribute("rectanguloRequest", recRequest);

                    // Alcance session
                    HttpSession session = req.getSession();
                    session.setAttribute("rectanguloSession", recSession);

                    // Alcance application
                    ServletContext context = getServletContext();
                    context.setAttribute("rectanguloApplication", recApplication);

                    // Agregamos un mensaje
                    req.setAttribute("mensaje", "Las variables fueron agregadas");

                    // 4. Redireccionamos al JSP seleccionado
                    req.getRequestDispatcher("index.jsp")
                            .forward(req, resp);
                    break;
                case "listarVariables":
                    // 4. Redireccionamos, ya no agregamos variables y se 
                    // desplegarán solamente las que sigan disponibles según el
                    // alcance de cada variable
                    req.getRequestDispatcher("/WEB-INF/alcanceVariables.jsp")
                            .forward(req, resp);
                    break;
                default:
                    // 4. Redireccionamos a la página de inicio y agregamos un
                    // mensaje
                    req.setAttribute("mensaje", "Acción no proporcionada o desconocida");
                    req.getRequestDispatcher("index.jsp")
                            .forward(req, resp);

                    // Esta línea no agregaría información al JSP, sino que es una
                    // petición al navegador web
                    // response.sendRedirect("index.jsp");
            }
        } else {
            // 4. Redireccionamos a la página de inicio y agregamos un
                // mensaje
                req.setAttribute("mensaje", "Acción no proporcionada o desconocida");
                req.getRequestDispatcher("index.jsp")
                        .forward(req, resp);
        }
    }
}
