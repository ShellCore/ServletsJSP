package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "HolaMundo", urlPatterns = {"/HolaMundo"})
public class HolaMundo extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = resp.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>HTML Hola mundo</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Hola mundo. La aplicación se llama: " + req.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
    
    
}
