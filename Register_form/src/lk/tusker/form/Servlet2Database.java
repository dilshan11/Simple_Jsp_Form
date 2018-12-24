package lk.tusker.form;

import lk.tusker.Dto.User;
import lk.tusker.hibernate.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@WebServlet(urlPatterns = "/database")
public class Servlet2Database extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("database");
        String fname=req.getParameter("fname");
        String sname=req.getParameter("sname");
        int age=Integer.parseInt(req.getParameter("age"));
        String userName=req.getParameter("userName");
        String password=req.getParameter("password");

        SessionFactory sessionFactory= HibernateUtil.getSessionFactory();
        Session session=sessionFactory.openSession();
        try {
            session.getTransaction().begin();
            session.save(new User(fname, sname, age, userName, password));

            session.getTransaction().commit();

        }
        catch (HibernateException e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        }
       // resp.sendRedirect();
        resp.sendRedirect("/Login.jsp");



        }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("this is post");
    }
}
