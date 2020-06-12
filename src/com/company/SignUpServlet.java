package com.company;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class SignUpServlet extends HttpServlet {

    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {

        String str1 = req.getParameter("fName");
        String str2 = req.getParameter("lName");
        String str3 = req.getParameter("email");
        String str4 = req.getParameter("mobileNo");
        String str5 = req.getParameter("pass");
        String str6 = req.getParameter("country");

        PrintWriter out = res.getWriter();

        out.println("Name : " + str1 + " "+str2);
        out.println("Country : " + str6);
        out.println("Mobile : " + str4);
        out.println("Email : " + str3);
        out.println("Password : " + str5);


    }
}
