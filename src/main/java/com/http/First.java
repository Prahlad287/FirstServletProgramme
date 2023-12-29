package com.http;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class First extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	PrintWriter out=resp.getWriter();
    	out.println("<h1> Hello Prahld </h1>");
        Cookie cookie = new Cookie("username", "john_doe");
        cookie.setMaxAge(3600); 
        resp.addCookie(cookie);

        // Redirect to the JSP page
        resp.sendRedirect("your-jsp-page.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
