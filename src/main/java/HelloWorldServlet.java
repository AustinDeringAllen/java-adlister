import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name="HelloWorldServlet",urlPatterns = "/hello")
public class HelloWorldServlet extends HttpServlet {
    private int count = 0;

//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
//        String name = req.getParameter("name"), countValue = req.getParameter("count");
//        if(countValue == null) {
//            count++;
//        } else {
//            count = Integer.parseInt(countValue);
//        }
//        res.setContentType("text/html");
//        PrintWriter out = res.getWriter();
//        if(name == null) {
//            name = "World";
//        }
//        out.println("<h1>Hello, " + name + "!</h1>");
//        out.println("<h2>This page has been viewed " + count + " times!</h2>");

// 1. Create a servlet that returns your first and last name in a heading element to the user if navigating to ```/name```.
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
//        String first_name = "Austin", last_name = "Dering-Allen";
//        res.setContentType("text/html");
//        PrintWriter out = res.getWriter();
//        out.printf("%s %s",first_name,last_name);
//    }

// 2. Create a servlet that returns a simple form if the user navigates to ```/order-form```.
// In servering up HTML, you may need to include ```response.setHeader("content-type", "text/html");```.
// The form should include an input for the name of a product and an input for how many of the product they want to order.
// The method of the form should be ```POST``` and the action should be ```/order-summary```.
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
//
//    }
}

//3. Create a servlet that listens for POST requests to ```/order-summary``` and souts out the name of the product ordered by the user and the quantity. HINT: you will probably need to use the request object to get the parameters!
//4. Create a servlet that listens for requests to ```/ping``` and a servlet that listens for requests to ```/pong```. The former servlet should simply return a link that sends a request to the latter, and vice versa! If successfully built, the user should be able to cycle back and forth between two pages by clicking on a ```PING!``` or ```PONG!``` link.
