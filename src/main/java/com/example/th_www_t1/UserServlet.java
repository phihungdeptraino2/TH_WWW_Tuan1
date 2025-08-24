package com.example.th_www_t1;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.User;

import java.io.IOException;
@WebServlet("/user")
public class UserServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Tạo 1 đối tượng User
        User user = new User(1, "Nguyen Van A", "nguyenvana@example.com");

        // Chuyển User sang JSON string bằng Jackson
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(user);

        // Set kiểu dữ liệu trả về là JSON
        resp.setContentType("application/json");
        resp.setCharacterEncoding("UTF-8");

        // Gửi JSON về client
        resp.getWriter().write(json);
    }
}
