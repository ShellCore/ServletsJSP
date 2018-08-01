package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "RedireccionamientoServlet", urlPatterns = {"/RedireccionamientoServlet"})
public class RedireccionamientoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String url = null;
        String tipoNavegador = req.getHeader("User-Agent");
        System.out.println("Tipo Navegador: " + tipoNavegador);
        if (tipoNavegador != null) {
            if (tipoNavegador.contains("Trident")) {
                url = "http://www.microsoft.com";
            } else if (tipoNavegador.contains("Firefox")) {
                url = "http://www.firefox.com";
            } else if (tipoNavegador.contains("Chrome")) {
                url = "http://www.google.com";
            }
        }
        
        // Redireccionamos al URL seleccionado
        resp.sendRedirect(url);
    }
}
