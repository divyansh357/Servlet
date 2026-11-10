package com.divyansh;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public void service(HttpServletRequest req, HttpServletResponse res) {
        System.out.println("In Service");
    }

}
