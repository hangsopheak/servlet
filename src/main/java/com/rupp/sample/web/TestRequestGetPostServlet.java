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
 * Test HttpServlet Request
 * @author sopheamak
 *
 */
@SuppressWarnings("serial")
public class TestRequestGetPostServlet extends HttpServlet {
    @Override
    public void init() throws ServletException {
        System.out.println("=====init method is called====");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println(String.format("=====%s method is called ====", request.getMethod()));
     // Set response content type
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        String title = String.format("Using %s Method to Read Form Data", request.getMethod());
          
        out.println("<html>\n" +
           "<head><title>" + title + "</title></head>\n" +
           "<body bgcolor=\"#f0f0f0\">\n" +
           "<h1 align=\"center\">" + title + "</h1>\n" +
           "<ul>\n" +
           "  <li><b>First Name</b>: "
           + request.getParameter("firstName") + "\n" +
           "  <li><b>Last Name</b>: "
           + request.getParameter("lastName") + "\n" +
           "</ul>\n" +
           "request.getQueryString() :"  +
           request.getQueryString() +
           "</body></html>");
    }

    // Method to handle POST method request
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
    @Override
    public void destroy() {
        System.out.println("=====destroy method is called====");
    }
}
