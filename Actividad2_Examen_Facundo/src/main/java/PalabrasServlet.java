import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(
        name="PalabrasServlet",
        urlPatterns = {"/PalabrasServlet"}
)
public class PalabrasServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Concatenacion concatenacion = new Concatenacion();
        ArrayList<String> palabras = new ArrayList<>();
        palabras.add(req.getParameter("palabra1"));
        palabras.add(req.getParameter("palabra2"));
        palabras.add(req.getParameter("palabra3"));
        concatenacion.concatenar(palabras);
        req.setAttribute("palabrasConcatenadas", concatenacion.concatenar(palabras));
        req.setAttribute("listaPalabras", palabras);
        RequestDispatcher view = req.getRequestDispatcher("Palabras_encadenadas.jsp");
        view.forward(req,resp);
    }
}
