package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "CarritoServlet", urlPatterns = {"/CarritoServlet"})
public class CarritoServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        
        // Procesamos el nuevo artículo
        String newArticle = req.getParameter("article");
        
        // Creamos o recuperamos la sesión http
        HttpSession session = req.getSession();
        
        // Recuperamos la lista de artículos previos si es que existen en la 
        // sesión
        List<String> articles = (List<String>) session.getAttribute("articles");
        if (articles == null) {
            articles = new ArrayList<>();
            session.setAttribute("articles", articles);
        }
        
        if (newArticle != null
                && !newArticle.trim().equals("")) {
            articles.add(newArticle);
        }
        
        try(PrintWriter out = resp.getWriter()) {
            out.println("<h1>Lista de artículos</h1>");
            out.println("<br>");
            for (String art : articles) {
                out.println("<li>" + art + "</li>");
            }
            out.println("<br>");
            out.println("<a href='/EjemploCarritoCompras'>Regresar</a>");
        }
    }
}
