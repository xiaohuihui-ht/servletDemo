package com.lzh;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ServletTest extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String name = req.getParameter("username");
        String pwd = req.getParameter("pwd");
        if((name != null)&&(name.trim().equals("jsp"))){
            if((pwd != null)&&(pwd.trim().equals("1"))){

                String login = "hello.html";
                resp.sendRedirect(login);
            }
        }
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
