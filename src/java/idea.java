/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ruwantha
 */
public class idea extends HttpServlet {

   private static final long serialVersionUID = 1L;
 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
       Connection connection = null;
        Statement stmt = null;
        String x = request.getParameter("University Name");
        String y = request.getParameter("Messege");
        
       
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/dae","root","");
 
            PreparedStatement ps = con.prepareStatement("insert into idea values(?,?)");
 
            ps.setString(1, x);
            ps.setString(2, y);
          
           
          
 
            int i = ps.executeUpdate();
            if (i > 0)
                out.println("<h1>Your Idea Successfuly has been sent to the Admin</h1>");
            else{
            out.println("<h1>OOPS! Something Went Wrong</h1>");
            }
        } catch (ClassNotFoundException | SQLException e2) {
            out.println(e2);
        }
 
        out.close();
    }
}