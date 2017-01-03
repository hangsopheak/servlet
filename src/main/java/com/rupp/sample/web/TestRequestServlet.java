/**
 * 
 */
package com.rupp.sample.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Test HttpServlet Request
 * @author sopheamak
 *
 */
@SuppressWarnings("serial")
public class TestRequestServlet extends HttpServlet {
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
        //get param1 value
        String param1Value = request.getParameter("param1");
        //get param2 value
        String param2Value = request.getParameter("param2");

        // Actual logic goes here.
        PrintWriter out = response.getWriter();
        out.println(String.format("<h1>param1 value: %s </h1>", param1Value));
        out.println(String.format("<h1>param2 value: %s </h1>", param2Value));
        
        out.println(String.format("<h1> request.getParameterNames </h1>"));
        
        Enumeration parameterNames = request.getParameterNames();
        while (parameterNames.hasMoreElements()) {
            String name = (String) parameterNames.nextElement();
            out.println(String.format("<h1>param2 name: %s , value is %s </h1>", name, request.getParameter(name)));
        }
    }

    @Override
    public void destroy() {
        System.out.println("=====destroy method is called====");
    }
}
