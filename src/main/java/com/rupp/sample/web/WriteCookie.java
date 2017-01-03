package com.rupp.sample.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WriteCookie extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        String name = request.getParameter("user");
        if (name ==null){
            name = "uid001";
        }
        Cookie userCookie = new Cookie("user", name);
        response.addCookie(userCookie);

        Cookie cookie = new Cookie("url", "www.google.com");
        cookie.setMaxAge(60 * 60); // 1 hour response.addCookie(cookie);
        cookie.setSecure(false);
        response.addCookie(cookie);
        response.setContentType("text/html");
        response.getWriter().write("<h1>cookie has been set</h1>");
        
    }
}
