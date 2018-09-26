<%-- 
    Document   : display
    Created on : 11-Jul-2018, 02:33:32
    Author     : chanduwarnakulasooriya
--%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.beans.*"%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
     <%
            String bt = request.getParameter("go");
            String ename = request.getParameter("event");
            //String firstname=request.getParameter("notgo"); 
          //  out.println(ename);
                         try{
           Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/dae","root","");
 
            PreparedStatement ps = con
                    .prepareStatement("INSERT INTO `event_con` (`Id`,`Name`,`Going`,`Not_going`) VALUES (NULL,?,?,'no');");
 
            ps.setString(2, bt);
           ps.setString(1,ename);
          // out.println(ps); 
            int i = ps.executeUpdate();
          //  out.println(i);
            if (i > 0)
                out.println("You are successfully registered...");}
        catch(Exception e){
        System.out.print(e);
        e.printStackTrace();
         out.close();
        }
        %>

    </body>
</html>
