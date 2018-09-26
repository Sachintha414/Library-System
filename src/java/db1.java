/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
/**
 *
 * @author ruwantha
 */
public class db1 extends HttpServlet {
 
    private static final long serialVersionUID = 1L;
 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String user = request.getParameter("user");
        String pass = request.getParameter("pass");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dae", "root", "");
            PreparedStatement pst = conn.prepareStatement("Select username,password from login where username=? and password=?");
            pst.setString(1, user);
            pst.setString(2, pass);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                 response.sendRedirect("cards.html");
            } 
            else {
                out.println("<h1>Invalid Login.Plese Try Again</h1>");
               
            }
        } 
        catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            out.println(e);
        }
    }
    }
