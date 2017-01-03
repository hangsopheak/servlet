/**
 * 
 */
package com.rupp.sample.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
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
public class TestRequestAttributeServlet extends HttpServlet {
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
         //set attriName1
         request.setAttribute("attriName1", "Attribute value 1");
         //set attriName2
         request.setAttribute("attriName2", new Date());
         
         
        // Actual logic goes here.
        final PrintWriter out = response.getWriter();
        out.println(String.format("<h1>attriName1: %s </h1>", request.getAttribute("attriName1")));
        out.println(String.format("<h1>attriName2: %s </h1>", request.getAttribute("attriName2")));
    }

    @Override
    public void destroy() {
        System.out.println("=====destroy method is called====");
    }
}
