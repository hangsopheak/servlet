package com.rupp.sample.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ResponseError  extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Set error code and reason.
        // resp.sendError(407, "Need authentication!!!" );
        
        //error basic authentication
      //  resp.setHeader("WWW-Authenticate", "Basic realm=\"servlet\"");
        resp.sendError(401, "Unauthencitation!!!");
    }
}
