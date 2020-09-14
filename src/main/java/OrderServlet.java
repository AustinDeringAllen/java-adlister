import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name="OrderServlet",urlPatterns = "/order-form")
public class OrderServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        String form =
                "<form method=\"POST\" action=\"/order-summary\">" +
                "<label for=\"productName\">Product Name: </label> <br>" +
                "<input type=\"text\" name=\"productName\"> <br>" +
                "<label for=\"productName\">Product Amount: </label> <br>" +
                "<input type=\"number\" name=\"productAmount\"> <br>" +
                "<input type=\"submit\">" +
                "</form>";
        res.setHeader("content-type","text/html");
        PrintWriter out = res.getWriter();
        out.print(form);
    }
}

// 2. Create a servlet that returns a simple form if the user navigates to ```/order-form```.
// In servering up HTML, you may need to include ```response.setHeader("content-type", "text/html");```.
// The form should include an input for the name of a product and an input for how many of the product they want to order.
// The method of the form should be ```POST``` and the action should be ```/order-summary```.