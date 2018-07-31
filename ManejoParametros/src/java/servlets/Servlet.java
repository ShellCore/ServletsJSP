package servlets;

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
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("Método doGet() no soportado por el Servlet");
        out.println("</body>");
        out.println("</html>");
        out.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Leemos los parámetros del formulario
        // por default el formulario es de tipo Get
        String user = req.getParameter("user");
        String pass = req.getParameter("pass");
        
        System.out.println("Usuario: " + user);
        System.out.println("Contraseña: " + pass);
        
        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("El parámetro usuario es: " + user);
        out.println("<br>");
        out.println("El parámetro contraseña es: " + pass);
        out.println("</body>");
        out.println("</html>");
        out.close();
    }
}
