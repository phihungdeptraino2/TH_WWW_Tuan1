package com.example.th_www_t1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/registration")
public class RegistrationForm extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");

        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String[] hobbies = request.getParameterValues("hobby");
        String country = request.getParameter("country");
        String shortBio = request.getParameter("shortBio");

        // gắn dữ liệu vào request attribute
        request.setAttribute("name", name);
        request.setAttribute("email", email);
        request.setAttribute("hobbies", hobbies);
        request.setAttribute("country", country);
        request.setAttribute("shortBio", shortBio);

        // forward sang JSP để hiển thị
        request.getRequestDispatcher("/result.jsp").forward(request, response);
    }
}
