import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name="NameServlet",urlPatterns = "/name")
public class NameServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        String first_name = "Austin", last_name = "Dering-Allen";
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.printf("%s %s",first_name,last_name);
    }
}

// 1. Create a servlet that returns your first and last name in a heading element to the user if navigating to ```/name```.