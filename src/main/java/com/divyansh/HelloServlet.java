package com.divyansh;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, IOException {
        System.out.println("In Service");
        res.setContentType("text/html");

        // Getting the PrintWriter object from res
        PrintWriter out = res.getWriter();

        out.println("<h2><b>Hello World</h2></b>");
    }

}
