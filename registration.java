package com.uniquedeveloper.registration;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.sql.Statement;


/**
 * Servlet implementation class RegistrationServelet
 */
@WebServlet("/registration")
public class registration extends HttpServlet {
    private static final long serialVersionUID = 1L;



    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uname=request.getParameter("name");
        String uemail=request.getParameter("email");
        String upswd=request.getParameter("pass");
        String Reupswd=request.getParameter("re_pass");
        String umobile=request.getParameter("contact");
        RequestDispatcher dispatcher=null;
        if(uname==null || uname.equals("")) {
            request.setAttribute("status","invalidName");
            dispatcher=request.getRequestDispatcher("registration.jsp");
            dispatcher.forward(request,response);
        }

        if(uemail==null || uemail.equals("")) {
            request.setAttribute("status","invalidEmail");
            dispatcher=request.getRequestDispatcher("registration.jsp");
            dispatcher.forward(request,response);
        }
        if(upswd==null || upswd.equals("")) {
            request.setAttribute("status","invalidPassword");
            dispatcher=request.getRequestDispatcher("registration.jsp");
            dispatcher.forward(request,response);
        }
        if(!upswd.equals(Reupswd)) {
            request.setAttribute("status","invalidConfirmPassword");
            dispatcher=request.getRequestDispatcher("registration.jsp");
            dispatcher.forward(request,response);
        }
        if(umobile==null || umobile.equals("")) {
            request.setAttribute("status","invalidMobile");
            dispatcher=request.getRequestDispatcher("registration.jsp");
            dispatcher.forward(request,response);
        }
//		else if(umobile.length()>10) {
//			request.setAttribute("status","invalidMobileLength");
//			dispatcher=request.getRequestDispatcher("registration.jsp");
//			dispatcher.forward(request,response);
//		}



        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager. getConnection("jdbc:mysql://localhost:3306/company?useSSL=false","root","root");
            PreparedStatement ps = con.prepareStatement("select * from users where uemail=?");
            ps.setString(1, uemail);
            ResultSet rs = ps.executeQuery();
            //if true
            if (rs.next()) {
                //sending error message on Register page
                request.setAttribute("status","failed");
                request.getRequestDispatcher("registration.jsp").forward(request, response);

            }
            else {

                PreparedStatement pst= con.prepareStatement("insert into users(uname,upwd,uemail,umobile) values(?,?,?,?)");

                pst.setString(1, uname);
                pst.setString(2, upswd);
                pst.setString(3, uemail);
                pst.setString(4, umobile);


                int rowCount=pst.executeUpdate();
                dispatcher=request.getRequestDispatcher("registration.jsp");
                if(rowCount > 0) {
                    request.setAttribute("status","success");
                }
                else {
                    request.setAttribute("status","failed");
                    dispatcher=request.getRequestDispatcher("registration .jsp");
                }

                dispatcher.forward(request, response);
            }

        }catch(Exception e){
            e.printStackTrace();
        }

    }





}
