package com.example.th_www_t1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
@WebServlet(
        name = "ConfigServlet",
        urlPatterns = {"/config"},
        initParams = {
                @WebInitParam(name = "dbUrl", value = "jdbc:mysql://localhost:3306/appdb"),
                @WebInitParam(name = "dbUser", value = "root")
        }
)

public class ConfigServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Lấy init-param
        String dbUrl = getServletConfig().getInitParameter("dbUrl");
        String dbUser = getServletConfig().getInitParameter("dbUser");

        resp.setContentType("text/plain");
        resp.getWriter().println("DB URL: " + dbUrl);
        resp.getWriter().println("DB User: " + dbUser);
    }
}