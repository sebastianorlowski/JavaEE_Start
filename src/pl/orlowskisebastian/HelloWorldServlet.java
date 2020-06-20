package pl.orlowskisebastian;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloWorldServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();
        pw.println("<html><head><title>Pierwsza aplikacja webowa</title></head>");
        pw.println("<body>");
        pw.println("<h2>Hello, world!</h2>");
        pw.println("Second line");
        pw.println("</body></html>");

    }
}
