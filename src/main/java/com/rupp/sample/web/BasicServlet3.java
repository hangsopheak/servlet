/**
 * 
 */
package com.rupp.sample.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author sopheamak
 *
 */
public class BasicServlet3 extends HttpServlet {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    @Override
    public void init() throws ServletException {
        System.out.println("=====Basic Servlet init method is called====");
    }

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        System.out.println("=====service method is called ====");
        request.setAttribute("attrib", "attribValue3333");

        RequestDispatcher rd = request.getRequestDispatcher("/Test.jsp");
        rd.forward(request, response);
    }

    @Override
    public void destroy() {
        System.out.println("=====destroy method is called====");
    }

}
