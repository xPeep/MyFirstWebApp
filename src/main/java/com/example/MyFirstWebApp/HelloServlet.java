package com.example.MyFirstWebApp;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet", urlPatterns = "/hello")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("a POST request was sent to /hello");

    }


    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("a GET request was sent to /hello");
        response.setContentType("text/html");
        response.getWriter().println("<h1>Greetings!!!</h1>");
        response.getWriter().println("<h3>Pickles are delicious</h3>");

    }

    public void destroy() {
    }
}