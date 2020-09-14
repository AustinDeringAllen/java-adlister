import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name="CountServlet",urlPatterns = "/count")
public class CountServlet extends HttpServlet {
    private int count = 0;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        String countValue = req.getParameter("count");
        if (countValue == null) {
            count++;
        } else {
            count = Integer.parseInt(countValue);
        }
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<h2>This page has been viewed " + count + " times!</h2>");
    }
}
