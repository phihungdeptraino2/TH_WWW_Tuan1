package com.example.th_www_t1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/context")
public class ContextServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Lấy context-param
        String appName = getServletContext().getInitParameter("appName");
        String adminEmail = getServletContext().getInitParameter("adminEmail");

        resp.setContentType("text/plain");
        resp.getWriter().println("Application: " + appName);
        resp.getWriter().println("Admin Email: " + adminEmail);
    }
}
