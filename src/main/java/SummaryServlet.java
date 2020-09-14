import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name="SummaryServlet",urlPatterns = "/order-summary")
public class SummaryServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
        String productName = req.getParameter("productName"), productAmount = req.getParameter("productAmount");
        System.out.println("User wants to buy " +productAmount+ " " + productName);

        res.setHeader("content-type","text/html");
        PrintWriter out = res.getWriter();
        out.print("User wants to buy " +productAmount+ " " + productName);
    }
}

//3. Create a servlet that listens for POST requests to ```/order-summary``` and souts out the name of the product ordered by the user and the quantity.
// HINT: you will probably need to use the request object to get the parameters!