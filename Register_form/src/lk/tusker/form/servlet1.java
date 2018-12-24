package lk.tusker.form;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns ="/form")
public class servlet1 extends HttpServlet {
    public servlet1() {
        System.out.println("SErvelt is created");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("this ius servise");
        resp.sendRedirect("/form.jsp");
    }


}
