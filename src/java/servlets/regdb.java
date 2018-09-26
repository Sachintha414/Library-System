package servlets;

import javax.servlet.http.*;
import javax.servlet.*;
import java.sql.*;
import java.io.*;
 
/**
 * Servlet implementation class MySQLConnect
 */
 
public class regdb extends HttpServlet {
 
    private static final long serialVersionUID = 1L;
 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
       Connection connection = null;
        Statement stmt = null;
        String x = request.getParameter("name");
        String y = request.getParameter("email");
        String z = request.getParameter("psw");
       
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/dae","root","");
 
            PreparedStatement ps = con.prepareStatement("insert into register values(?,?,?,Eid)");
 
            ps.setString(1, x);
            ps.setString(2, y);
            ps.setString(3, z);
           
          
 
            int i = ps.executeUpdate();
            if (i > 0)
                out.println("<h1>Your Request Successfuly has been sent to the Admin</h1>");
            else{
            out.println("<h1>OOPS! Something Went Wrong</h1>");
            }
        } catch (ClassNotFoundException | SQLException e2) {
            out.println(e2);
        }
 
        out.close();
    }
}