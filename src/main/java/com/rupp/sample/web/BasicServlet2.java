/**
 * 
 */
package com.rupp.sample.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author sopheamak
 *
 */
public class BasicServlet2 extends HttpServlet {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    
    @Override
    public void init() throws ServletException {
        System.out.println("=====init method is called====");
    }

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("=====service method is called ====");
        //render to html page
       // Set response content type
        response.setContentType("text/html");

        // Actual logic goes here.
        PrintWriter out = response.getWriter();
        out.println(String.format("<h1>getServletConfig().getInitParameter -  %s </h1>", getServletConfig().getInitParameter("initValue")));
        out.println(String.format("<h1> getServletContext().getInitParameter - %s </h1>", getServletContext().getInitParameter("email")));
    }

    @Override
    public void destroy() {
        System.out.println("=====destroy method is called====");
    }

}
