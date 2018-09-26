/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.Connection;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ruwantha
 */
@WebServlet(urlPatterns = {"/accept"})
public class accept extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet accept</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet accept at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
         PrintWriter out = response.getWriter();
       Connection connection = null;
        Statement stmt = null;
         

     try {
      
          Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/dae","root","");
            
           
            if (request.getParameter("accept") != null) {
           
       
            PreparedStatement ps = con.prepareStatement("Select * from accept" );
 
            String x= "User Name";
            String y = "Password";
            String z = "Category";
           // int q = "Eid";
            
            
             
             PreparedStatement ps1 = con.prepareStatement("insert into register values(x,y,z,?)");
 
           
          
 
            int i = ps.executeUpdate();
            }
            /*if (i > 0)
                out.println("<h1>Your Request Successfuly has been sent to the Admin</h1>");
            else{
            out.println("<h1>OOPS! Something Went Wrong</h1>");
            }
       
 */
        out.close();
    }  catch (ClassNotFoundException | SQLException e2) {
            out.println(e2);
        }
           
     
    }
 
 
}
