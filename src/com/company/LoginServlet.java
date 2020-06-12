package com.company;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginServlet extends HttpServlet {

    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {

        String str1 = req.getParameter("email");
        String str2 = req.getParameter("password");

        PrintWriter out = res.getWriter();

        out.println("email : " + str1 + "\npassword : " + str2);

    }
}
