package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "FormularioServlet", urlPatterns = {"/FormularioServlet"})
public class FormularioServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        
        // Simulando valores
        String correctUser = "Juan";
        String correctPass = "123";
        
        String user = req.getParameter("user");
        String pass = req.getParameter("pass");
        
        if (correctUser.equals(user)
                && correctPass.equals(pass)) {
            out.println("<h1>");
            out.println("Datos correctos");
            out.println("<br>");
            out.println("<br>User: " + user + "");
            out.println("<br>Pass: " + pass + "");
            out.println("</h1>");
        } else {
            // Respondemos al navegador con un código de estado no autorizado
            resp.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Las credenciales son incorrectas");
        }
        
        // Listado de códigos de error
        // http://docstore.mik.ua/orelly/java-ent/servlet/appc_01.htm
        out.close();
    }
}
