
package Controladores;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author javil
 */
@WebServlet(name = "Salir", urlPatterns = {"/Salir"})
public class Salir extends HttpServlet {
        protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
          HttpSession sesion = request.getSession();
          sesion.setAttribute("usuario", null);
          response.sendRedirect("index.jsp?mensaje=Sesion finalizada");
    }
}
