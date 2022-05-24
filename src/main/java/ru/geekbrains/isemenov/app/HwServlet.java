package ru.geekbrains.isemenov.app;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "HwServlet", urlPatterns = "/hw_servlet")
public class HwServlet extends HttpServlet {
    private static Logger logger = LoggerFactory.getLogger(HwServlet.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("Log: GET-request received");
        resp.setContentType("text/html;charset=UTF-8");
        resp.getWriter().printf("<html><body>");

        resp.getWriter().printf("<h1>Homework #6 well done!</h1>");

        resp.getWriter().printf("</body></html>");
        resp.getWriter().close();
    }
}
