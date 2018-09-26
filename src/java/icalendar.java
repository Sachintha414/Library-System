/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ruwantha
 */
@WebServlet(urlPatterns = {"/icalendar"})
public class icalendar extends HttpServlet {

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
         
                                     try{
                            
                       
                            String x = request.getParameter("name");
                            String y = request.getParameter("date");
                            String z = request.getParameter("time");
                            String q = request.getParameter("venue");
       
                            Class.forName("com.mysql.jdbc.Driver").newInstance();
                            Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/calendar","root","");
                          PreparedStatement ps = conn.prepareStatement("insert into calendar values(?,?,?,?)");
                            ps.setString(1,x);
      ps.setString(2,y);
      ps.setString(3,z);
      ps.setString(4,q);
      
      int i = ps.executeUpdate();
      if(i>0){
          out.println("<h1>Event added successfully</h1>");
                  }
                  else{
          out.println("<h1>try again</h1>");
      }
                        }                  
          
                        
                        catch(       ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e2){
              out.println(e2);
              }
       out.close();
                        
                        
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
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
