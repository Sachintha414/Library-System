package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;;

public final class idead_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("  <meta name=\"description\" content=\"\">\n");
      out.write("  <meta name=\"author\" content=\"\">\n");
      out.write("  <title>SB Admin - Start Bootstrap Template</title>\n");
      out.write("  <!-- Bootstrap core CSS-->\n");
      out.write("  <link href=\"vendor/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("  <!-- Custom fonts for this template-->\n");
      out.write("  <link href=\"vendor/font-awesome/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("  <!-- Custom styles for this template-->\n");
      out.write("  <link href=\"css/sb-admin.css\" rel=\"stylesheet\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body class=\"fixed-nav sticky-footer bg-dark\" id=\"page-top\">\n");
      out.write("  <!-- Navigation-->\n");
      out.write("  <nav class=\"navbar navbar-expand-lg navbar-dark bg-dark fixed-top\" id=\"mainNav\">\n");
      out.write("    <a class=\"navbar-brand\" href=\"index.html\">Industry Dashboard</a>\n");
      out.write("    <button class=\"navbar-toggler navbar-toggler-right\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarResponsive\" aria-controls=\"navbarResponsive\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("      <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("    </button>\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"navbarResponsive\">\n");
      out.write("      <ul class=\"navbar-nav navbar-sidenav\" id=\"exampleAccordion\">\n");
      out.write("        <li class=\"nav-item\" data-toggle=\"tooltip\" data-placement=\"right\" title=\"Dashboard\">\n");
      out.write("          <a class=\"nav-link\" href=\"index.html\">\n");
      out.write("            <i class=\"fa fa-fw fa-dashboard\"></i>\n");
      out.write("\n");
      out.write("          </a>\n");
      out.write("        </li>\n");
      out.write("\n");
      out.write("        <li class=\"nav-item\" data-toggle=\"tooltip\" data-placement=\"right\" title=\"Tables\">\n");
      out.write("            <a class=\"nav-link\" ></a>\n");
      out.write("                      <i class=\"fa fa-fw fa-table\"></i>\n");
      out.write("                    <!--< class=\"nav-link-text\">--><a href=\"idead.jsp\">Ideas</a>\n");
      out.write("          \n");
      out.write("            <ul class=\"sidenav-second-level collapse\" id=\"collapseComponents\">\n");
      out.write("              <li>\n");
      out.write("                <a href=\"\">University Calander</a>\n");
      out.write("              </li>\n");
      out.write("              <li>\n");
      out.write("                <a href=\"icalendar.jsp\">Industry Calander</a>\n");
      out.write("              </li>\n");
      out.write("            </ul>\n");
      out.write("\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item\" data-toggle=\"tooltip\" data-placement=\"right\" title=\"Tables\">\n");
      out.write("            <a class=\"nav-link\" href=\"\"></a>\n");
      out.write("                      <i class=\"fa fa-fw fa-table\"></i>\n");
      out.write("                      <!--< class=\"nav-link-text\">--><a href=\"\">Events and News</a>\n");
      out.write("          \n");
      out.write("\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item\" data-toggle=\"tooltip\" data-placement=\"right\" title=\"Components\">\n");
      out.write("          <a class=\"nav-link nav-link-collapse collapsed\" data-toggle=\"collapse\" href=\"#collapseComponents\" data-parent=\"#exampleAccordion\">\n");
      out.write("            <i class=\"fa fa-fw fa-wrench\"></i>\n");
      out.write("            <span class=\"nav-link-text\">Calenders</span>\n");
      out.write("          </a>\n");
      out.write("          <ul class=\"sidenav-second-level collapse\" id=\"collapseComponents\">\n");
      out.write("            <li>\n");
      out.write("              <a href=\"ucalander.jsp\">Lol</a>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("              <a href=\"cards.html\">Events and News</a>\n");
      out.write("            </li>\n");
      out.write("          </ul>\n");
      out.write("        </li>\n");
      out.write("        </ul>\n");
      out.write("      <ul class=\"navbar-nav sidenav-toggler\">\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link text-center\" id=\"sidenavToggler\">\n");
      out.write("            <i class=\"fa fa-fw fa-angle-left\"></i>\n");
      out.write("          </a>\n");
      out.write("        </li>\n");
      out.write("      </ul>\n");
      out.write("      <!-- Event Cards-->\n");
      out.write("      <ul class=\"navbar-nav ml-auto\">\n");
      out.write("\n");
      out.write("\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("          <form class=\"form-inline my-2 my-lg-0 mr-lg-2\">\n");
      out.write("            <div class=\"input-group\">\n");
      out.write("              <input class=\"form-control\" type=\"text\" placeholder=\"Search for...\">\n");
      out.write("              <span class=\"input-group-append\">\n");
      out.write("                <button class=\"btn btn-primary\" type=\"button\">\n");
      out.write("                  <i class=\"fa fa-search\"></i>\n");
      out.write("                </button>\n");
      out.write("              </span>\n");
      out.write("            </div>\n");
      out.write("          </form>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link\" data-toggle=\"modal\" data-target=\"#exampleModal\">\n");
      out.write("            <i class=\"fa fa-fw fa-sign-out\"></i>Logout</a>\n");
      out.write("        </li>\n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("  </nav>\n");
      out.write("  <div class=\"content-wrapper\">\n");
      out.write("    <div class=\"container-fluid\">\n");
      out.write("      <!-- Breadcrumbs-->\n");
      out.write("      <ol class=\"breadcrumb\">\n");
      out.write("        <li class=\"breadcrumb-item\">\n");
      out.write("          <a href=\"index.html\">Industry Dashboard</a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"breadcrumb-item active\"></li>\n");
      out.write("      </ol>\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col-12\">\n");
      out.write("          <h1>Ideas</h1>\n");
      out.write("          <p>\n");
      out.write("<form name=\"SelectCalendar\"><center>        \n");
      out.write("        <table border=\"1\" align=\"center\" width = \"100%\">\n");
      out.write("            <thead>\n");
      out.write("                <tr>\n");
      out.write("                    \n");
      out.write("                    <th width = \"25%\">Name</th>\n");
      out.write("                    <th width = \"25%\">Messege</th>                   \n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("                \n");
      out.write("                  ");

                      
                        try{
                            Class.forName("com.mysql.jdbc.Driver").newInstance();
                            Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/dae","root","");
                            String Query="Select name,messege from idea";
                            Statement stm = conn.createStatement();
                            ResultSet rs= stm.executeQuery(Query);
                            while(rs.next())
                            {
                                
      out.write("\n");
      out.write("                                <tr>\n");
      out.write("                                   \n");
      out.write("                                <td>");
      out.print(rs.getString("name"));
      out.write("</td>\n");
      out.write("                                 <td>");
      out.print(rs.getString("messege"));
      out.write("</td>                              \n");
      out.write("\n");
      out.write("                                 </td>\n");
      out.write("                                </tr>\n");
      out.write("                                 ");

                            }
                            
                        }
                        
                        
                        catch(Exception ex){
                            out.println("Exception:"+ex.getMessage());
                            ex.printStackTrace();
                        }
                        
                        
      out.write("\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("        </tbody>\n");
      out.write("        </table>\n");
      out.write("        </form>\n");
      out.write("          </p>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- /.container-fluid-->\n");
      out.write("    <!-- /.content-wrapper-->\n");
      out.write("    <footer class=\"sticky-footer\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"text-center\">\n");
      out.write("          <small>Copyright © Your Website 2018</small>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </footer>\n");
      out.write("    <!-- Scroll to Top Button-->\n");
      out.write("    <a class=\"scroll-to-top rounded\" href=\"#page-top\">\n");
      out.write("      <i class=\"fa fa-angle-up\"></i>\n");
      out.write("    </a>\n");
      out.write("    <!-- Logout Modal-->\n");
      out.write("    <div class=\"modal fade\" id=\"exampleModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\n");
      out.write("      <div class=\"modal-dialog\" role=\"document\">\n");
      out.write("        <div class=\"modal-content\">\n");
      out.write("          <div class=\"modal-header\">\n");
      out.write("            <h5 class=\"modal-title\" id=\"exampleModalLabel\">Ready to Leave?</h5>\n");
      out.write("            <button class=\"close\" type=\"button\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("              <span aria-hidden=\"true\">×</span>\n");
      out.write("            </button>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"modal-body\">Select \"Logout\" below if you are ready to end your current session.</div>\n");
      out.write("          <div class=\"modal-footer\">\n");
      out.write("            <button class=\"btn btn-secondary\" type=\"button\" data-dismiss=\"modal\">Cancel</button>\n");
      out.write("            <a class=\"btn btn-primary\" href=\"login.jsp\">Logout</a>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- Bootstrap core JavaScript-->\n");
      out.write("    <script src=\"vendor/jquery/jquery.min.js\"></script>\n");
      out.write("    <script src=\"vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("    <!-- Core plugin JavaScript-->\n");
      out.write("    <script src=\"vendor/jquery-easing/jquery.easing.min.js\"></script>\n");
      out.write("    <!-- Custom scripts for all pages-->\n");
      out.write("    <script src=\"js/sb-admin.min.js\"></script>\n");
      out.write("  </div>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
