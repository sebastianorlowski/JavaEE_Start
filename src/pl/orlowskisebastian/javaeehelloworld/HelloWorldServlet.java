package pl.orlowskisebastian.javaeehelloworld;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloWorldServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter pw = response.getWriter();
        pw.println("<html><head><title>Pierwsza aplikacja webowa</title></head>");
        pw.println("<body>");
        pw.println("<h2>Hello, world!</h2>");
        pw.println("Second line");
        pw.println("<form method=\"post\">");
        pw.println("<p>Podaj imię: <p><input name=\"imie\" / ><input type =\"submit\" value=\"OK\" />");
        pw.println("</form>");
        pw.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws  IOException {
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter pw = response.getWriter();
        String imie = request.getParameter("imie");
        if (imie != null && !"".equals(imie))
            pw.println("Witaj, " + imie);
    }
}
