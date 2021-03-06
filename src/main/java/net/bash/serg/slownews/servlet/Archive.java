package net.bash.serg.slownews.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by bso05702 on 18.11.2015.
 */
public class Archive extends HttpServlet {
    private static final String BEGIN = "/WEB-INF/view/archive.jsp";

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        ServletContext application = getServletContext();
        RequestDispatcher dispatcher = application.getRequestDispatcher(BEGIN);
        dispatcher.forward(req, res);
    }
}