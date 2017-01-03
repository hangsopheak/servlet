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
public class BasicServlet extends HttpServlet {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    //resource
    private String message;
    
    @Override
    public void init() throws ServletException {
        System.out.println("=====init method is called====");
        //populate initialize resources
        message = "Hello world - my Basic Servlet";
    }

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        System.out.println("=====service method is called ====");
        //render to html page
       // Set response content type
        response.setContentType("text/html");

        // Actual logic goes here.
        PrintWriter out = response.getWriter();
        out.println(String.format("<h1> %s </h1>", message));
        
      //  throw new ServletException("GET method is not supported.");
    }

    @Override
    public void destroy() {
        System.out.println("=====destroy method is called====");
    }

}
