package org.apache.jsp.UserInf;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class userInf_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("        <script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("                background-color: #25274d;\n");
      out.write("            }\n");
      out.write("            .contact{\n");
      out.write("                padding: 4%;\n");
      out.write("                height: 400px;\n");
      out.write("            }\n");
      out.write("            .col-md-3{\n");
      out.write("                background: #ff9b11 ;\n");
      out.write("                padding: 4%;\n");
      out.write("                border-top-left-radius: 0.5rem;\n");
      out.write("                border-bottom-left-radius: 0.5rem;\n");
      out.write("            }\n");
      out.write("            .contact-info{\n");
      out.write("                margin-top:10%;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("            .contact-info img{\n");
      out.write("                margin-bottom: 15%;\n");
      out.write("            }\n");
      out.write("            .contact-info h2{\n");
      out.write("                margin-bottom: 10%;\n");
      out.write("            }\n");
      out.write("            .col-md-9{\n");
      out.write("                background: #fff;\n");
      out.write("                padding: 3%;\n");
      out.write("                border-top-right-radius: 0.5rem;\n");
      out.write("                border-bottom-right-radius: 0.5rem;\n");
      out.write("            }\n");
      out.write("            .contact-form label{\n");
      out.write("                font-weight:600;\n");
      out.write("            }\n");
      out.write("            .contact-form button{\n");
      out.write("                background: #25274d;\n");
      out.write("                color: #fff;\n");
      out.write("                font-weight: 600;\n");
      out.write("                width: 25%;\n");
      out.write("            }\n");
      out.write("            .contact-form button:focus{\n");
      out.write("                box-shadow:none;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container contact\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-3\">\n");
      out.write("                    <div class=\"contact-info\">\n");
      out.write("                        <img src=\"../media/LOGO.png\" style=\"width:100%; height: 100%\" height=40 width=40 alt=\"image\"/>\n");
      out.write("                        <h2 >Your Information</h2>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-9\">\n");
      out.write("                    <div class=\"contact-form\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label class=\"control-label col-sm-2\" for=\"fname\">Name:</label>\n");
      out.write("                            <div class=\"col-sm-10\">          \n");
      out.write("                                <input type=\"text\" class=\"form-control\" id=\"fname\" placeholder=\"Enter First Name\" name=\"fname\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label class=\"control-label col-sm-2\" for=\"lname\">Birth Day:</label>\n");
      out.write("                            <div class=\"col-sm-10\">          \n");
      out.write("                                <input type=\"text\" class=\"form-control\" id=\"lname\" placeholder=\"Enter Last Name\" name=\"lname\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label class=\"control-label col-sm-2\" for=\"email\">Email:</label>\n");
      out.write("                            <div class=\"col-sm-10\">\n");
      out.write("                                <input type=\"email\" class=\"form-control\" id=\"email\" placeholder=\"Enter email\" name=\"email\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label class=\"control-label col-sm-2\" for=\"comment\">Detail</label>\n");
      out.write("                            <div class=\"col-sm-10\">\n");
      out.write("                                <textarea class=\"form-control\" rows=\"5\" id=\"comment\"></textarea>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">        \n");
      out.write("                            <div class=\"col-sm-offset-2 col-sm-10\">\n");
      out.write("                                <button type=\"homeback\" class=\"btn btn-default\">Home Back</button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
