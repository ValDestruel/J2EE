import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "SimpleHelloServlet", urlPatterns = {"/simple-hello", "/custom-hello"})
public class SimpleHelloServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // get parameters from request
        String firstname = request.getParameter("firstname");
        String lastname = request.getParameter("lastname");
        String hour = request.getParameter("hour");
        String hello = "";
        int intHour = Integer.valueOf(hour.substring(0,2));

        if (intHour > 0 && intHour <= 8){

            hello = "Good morning";
        }

        if (intHour > 8 && intHour <= 16){

            hello = "Good afternoon";
        }

        if (intHour > 16 && intHour <= 24){

            hello = "Good night";
        }

        String message = hello + " " + firstname + " " + lastname;
        request.setAttribute("sample", message);
        this.getServletContext().getRequestDispatcher("/custom-hello.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
