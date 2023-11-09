package com.todo.todoapplication.servlet;

import com.todo.todoapplication.entity.Note;
import com.todo.todoapplication.helper.SessionFactoryProvider;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

//@WebServlet(name = "SaveNoteServlet", urlPatterns = {"/SaveNoteServlet"})
public class SaveNoteServlet extends HttpServlet {

    public SaveNoteServlet() {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
            // Title and content fetch
            String title = request.getParameter("title");
            String content = request.getParameter("content");

            Note note = new Note(title, content, new Date());

            // Hibernate save

            Session session = SessionFactoryProvider.getSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();

            session.save(note);

            transaction.commit();
            session.close();

            //////////////////////////////////
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<h1>Note is added successfully</h1>");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}