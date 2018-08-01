package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "FechaServlet", urlPatterns = {"/FechaServlet"})
public class FechaServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try (PrintWriter out = resp.getWriter()) {
            resp.setContentType("text/html;charset=UTF-8");
            resp.setHeader("refresh", "1"); // Dado en segundos
            Date fecha = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("'Hora actualizada' HH:mm:ss");
            String fechaConFormato = sdf.format(fecha);
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet FechaServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Fecha actualizada: " + fechaConFormato + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
