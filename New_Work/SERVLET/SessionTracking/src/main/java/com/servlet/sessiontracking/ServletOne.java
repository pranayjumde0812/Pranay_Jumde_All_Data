//package com.servlet.sessiontracking;
//
//import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
//import jakarta.servlet.http.HttpServlet;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//
//import java.io.IOException;
//import java.io.PrintWriter;
//
////@WebServlet(name = "servletOne", value = "/servlet-one")
//public class ServletOne extends HttpServlet {
//
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        response.setContentType("text/html");
//
//
//        try (PrintWriter out = response.getWriter()) {
//
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title> Servlet 1 </title>");
//            out.println("</head>");
//            out.println("<body>");
//
//            String name = request.getParameter("name");
//            out.println("<h1> Hello , " + name + " Welcome to servlet 1</h1>");
//
//            out.println("</body>");
//            out.println("</html>");
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//}
