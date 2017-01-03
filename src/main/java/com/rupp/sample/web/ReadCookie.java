package com.rupp.sample.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ReadCookie extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
        // read cookie by httpServletRequest
        final Cookie[] cookies = request.getCookies();
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        for(Cookie cookie : cookies) {
            out.print("Name : " + cookie.getName() + ", ");
            out.print("Value: " + cookie.getValue() + " <br/>");
        }
    }
}
