<%@page import ="java.sql.*;"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">
  <title>SB Admin - Start Bootstrap Template</title>
  <!-- Bootstrap core CSS-->
  <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
  <!-- Custom fonts for this template-->
  <link href="vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
  <!-- Custom styles for this template-->
  <link href="css/sb-admin.css" rel="stylesheet">
</head>

<body class="fixed-nav sticky-footer bg-dark" id="page-top">
  <!-- Navigation-->
  <nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top" id="mainNav">
    <a class="navbar-brand" href="index.html">University Dashboard</a>
    <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarResponsive">
      <ul class="navbar-nav navbar-sidenav" id="exampleAccordion">
        <li class="nav-item" data-toggle="tooltip" data-placement="right" title="Dashboard">
          <a class="nav-link" href="index.html">
            <i class="fa fa-fw fa-dashboard"></i>

          </a>
        </li>

        <li class="nav-item" data-toggle="tooltip" data-placement="right" title="Tables">
            <a class="nav-link" href=""></a>
                      <i class="fa fa-fw fa-table"></i>
                      <!--< class="nav-link-text">--><a href="idead.jsp">Ideas</a>
          
            <ul class="sidenav-second-level collapse" id="collapseComponents">
              <li>
                <a href="ucalander.jsp">University Calander</a>
              </li>
              <li>
                <a href="icalendar.jsp">Industry Calander</a>
              </li>
            </ul>

        </li>
        <li class="nav-item" data-toggle="tooltip" data-placement="right" title="Tables">
            <a class="nav-link" href=""></a>
                      <i class="fa fa-fw fa-table"></i>
                      <!--<class="nav-link-text"> --><a href="cards.html">Events and News</a>
          </a>

        </li>
        <li class="nav-item" data-toggle="tooltip" data-placement="right" title="Components">
          <a class="nav-link nav-link-collapse collapsed" data-toggle="collapse" href="#collapseComponents" data-parent="#exampleAccordion">
            <i class="fa fa-fw fa-wrench"></i>
            <span class="nav-link-text">Calenders</span>
          </a>
          <ul class="sidenav-second-level collapse" id="collapseComponents">
            <li>
              <a href="navbar.html">Ideas</a>
            </li>
            <li>
              <a href="cards.html">Events and News</a>
            </li>
          </ul>
        </li>
        </ul>
      <ul class="navbar-nav sidenav-toggler">
        <li class="nav-item">
          <a class="nav-link text-center" id="sidenavToggler">
            <i class="fa fa-fw fa-angle-left"></i>
          </a>
        </li>
      </ul>
      <!-- Event Cards-->
      <ul class="navbar-nav ml-auto">


        <li class="nav-item">
          <form class="form-inline my-2 my-lg-0 mr-lg-2">
            <div class="input-group">
              <input class="form-control" type="text" placeholder="Search for...">
              <span class="input-group-append">
                <button class="btn btn-primary" type="button">
                  <i class="fa fa-search"></i>
                </button>
              </span>
            </div>
          </form>
        </li>
        <li class="nav-item">
          <a class="nav-link" data-toggle="modal" data-target="#exampleModal">
            <i class="fa fa-fw fa-sign-out"></i>Logout</a>
        </li>
      </ul>
    </div>
  </nav>
  <div class="content-wrapper">
    <div class="container-fluid">
      <!-- Breadcrumbs-->
      <ol class="breadcrumb">
        <li class="breadcrumb-item">
          <a href="index.html">University Dashboard</a>
        </li>
        <li class="breadcrumb-item active"></li>
      </ol>
      <div class="row">
        <div class="col-12">
            <h1>Industry Calender</h1>
          <p><form name="SelectCalendar"><center>
            <h4>Select the Industry</h4>
            <select name="company">
                <option>company 1</option>
                <option>Company 2</option>
                <option>Company 3</option>
            </select></center>
            <br><br>
             <h2> <center> Calendar</center></h2>
        <br><br>
        <table border="1" align="center" width = "100%">
            <thead>
                <tr>
                    
                    <th width = "25%">Event Name</th>
                    <th width = "25%">Date</th>
                    <th width = "25%">Time</th>
                    <th width = "25%">Venue</th>
                    <th width = "25%">Going/Not Going</th>
                </tr>
            </thead>
            <tbody>
                
                  <%
                      
                        try{
                            Class.forName("com.mysql.jdbc.Driver").newInstance();
                            Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/dae","root","");
                            String Query="Select Eventname,date,time,venue from calendar";
                            Statement stm = conn.createStatement();
                            ResultSet rs= stm.executeQuery(Query);
                            while(rs.next())
                            {
                                %>
                                <tr>
                                   
                                <td><%=rs.getString("Eventname")%></td>
                                 <td><%=rs.getString("date")%></td>
                                 <td><%=rs.getString("time")%></td>
                                 <td><%=rs.getString("venue")%>

                                 </td>
                                
                                 <td>
                             <form action="display.jsp" method="POST">
                             <input type="hidden" value="<%=rs.getString("Eventname")%>" name="event">
                            <input type="submit"  value="Going" name="go" >
                                                    </form>
                                      <form action="display1.jsp" method="POST">
                                           <input type="hidden" value="<%=rs.getString("Eventname")%>" name="event">
                        <input type="submit"  value="Not Going" name="not">
                        </form>
                                 </td>
                               
                                </tr>
                                
                                 <%
                            }
                            
                        }
                        
                        
                        catch(Exception ex){
                            out.println("Exception:"+ex.getMessage());
                            ex.printStackTrace();
                        }
                        
                        %>
                        
                        
        </tbody>
        </table>
        </form>
                        <br>
                        <h3>Adding Events</h3>
                        <form name="add" method="post" action="calendar">
                            <table border="0">
                                
                                <tbody>
                                    <tr>
                                        <td>Enter Event Name</td>
                                        <td><input type="text" name="name" value="" /></td></tr>
                                    <tr><td>Enter Date</td>
                                        <td><input type="text" name="date" value="" /></td></tr>
                                    <tr><td>Enter Time</td>
                                        <td><input type="text" name="time" value="" /></td></tr>
                                    <tr><td>Enter Venue </td>
                                        <td><input type="text" name="venue" value="" /></td></tr>
                                    <tr><td><input type="submit" value="Add Event" name="Add Event" /></td>
                                    </tr>
                                   
                                   
                                </tbody>
                            </table>

                        </form>
        
</p>
        </div>
      </div>
    </div>
    <!-- /.container-fluid-->
    <!-- /.content-wrapper-->
    <footer class="sticky-footer">
      <div class="container">
        <div class="text-center">
          <small>Copyright � Your Website 2018</small>
        </div>
      </div>
    </footer>
    <!-- Scroll to Top Button-->
    <a class="scroll-to-top rounded" href="#page-top">
      <i class="fa fa-angle-up"></i>
    </a>
    <!-- Logout Modal-->
    <div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
      <div class="modal-dialog" role="document">
        <div class="modal-content">
          <div class="modal-header">
            <h5 class="modal-title" id="exampleModalLabel">Ready to Leave?</h5>
            <button class="close" type="button" data-dismiss="modal" aria-label="Close">
              <span aria-hidden="true">�</span>
            </button>
          </div>
          <div class="modal-body">Select "Logout" below if you are ready to end your current session.</div>
          <div class="modal-footer">
            <button class="btn btn-secondary" type="button" data-dismiss="modal">Cancel</button>
            <a class="btn btn-primary" href="login.html">Logout</a>
          </div>
        </div>
      </div>
    </div>
    <!-- Bootstrap core JavaScript-->
    <script src="vendor/jquery/jquery.min.js"></script>
    <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
    <!-- Core plugin JavaScript-->
    <script src="vendor/jquery-easing/jquery.easing.min.js"></script>
    <!-- Custom scripts for all pages-->
    <script src="js/sb-admin.min.js"></script>
  </div>
</body>

</html>
