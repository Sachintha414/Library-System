/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mysql.cj.protocol.Resultset;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.lang.invoke.MethodHandles;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import sun.net.www.content.audio.x_aiff;

/**
 *
 * @author ruwantha
 */
@WebServlet(urlPatterns = {"/accept1"})
public class accept1 extends HttpServlet {
@Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         Connection connection = null;
        Statement stmt = null;
        String id=request.getParameter("name");
        String id1=request.getParameter("t1");
        String id2=request.getParameter("t2");
        String id3=request.getParameter("t3");
        int d = Integer.parseInt(id);
       String sql="SELECT * FROM register WHERE Eid=?";
       String sql2="INSERT INTO accept1 (Eid,User_Name,Password,Category) VALUES(NULL,?,?,?);";
                      try{
                          System.out.println("eeeeee");
                            Class.forName("com.mysql.jdbc.Driver");
                            Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/dae","root","");
                            PreparedStatement ps2 =con.prepareStatement(sql);
                            PreparedStatement ps = con.prepareStatement(sql2);
                            ps2.execute();
                            ps.setString(1,id1);
                            ps.setString(2,id2);
                            ps.setString(3,id3);
                            ps.execute();
                            response.sendRedirect("admin.jsp");
                        }catch(Exception ex){
                           out.println("Exception:"+ex.getMessage());
                            ex.printStackTrace();
                        }
                       
 
       
            
    
}
}


                
    
    


     