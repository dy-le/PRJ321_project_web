package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\r\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\r\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"></script>\r\n");
      out.write("        <!--<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"></script>-->\r\n");
      out.write("        <!--<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">-->\r\n");
      out.write("        <!--<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">-->\r\n");
      out.write("        <style>\r\n");
      out.write("            body {font-family: Arial, Helvetica, sans-serif;}\r\n");
      out.write("            * {box-sizing: border-box}\r\n");
      out.write("\r\n");
      out.write("            /* Full-width input fields */\r\n");
      out.write("            input[type=text], input[type=password] {\r\n");
      out.write("                width: 100%;\r\n");
      out.write("                padding: 15px;\r\n");
      out.write("                margin: 5px 0 22px 0;\r\n");
      out.write("                display: inline-block;\r\n");
      out.write("                border: none;\r\n");
      out.write("                background: #f1f1f1;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            input[type=text]:focus, input[type=password]:focus {\r\n");
      out.write("                background-color: #ddd;\r\n");
      out.write("                outline: none;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            hr {\r\n");
      out.write("                border: 1px solid #f1f1f1;\r\n");
      out.write("                margin-bottom: 25px;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            /* Set a style for all buttons */\r\n");
      out.write("            button {\r\n");
      out.write("                background-color: #4CAF50;\r\n");
      out.write("                color: white;\r\n");
      out.write("                padding: 14px 20px;\r\n");
      out.write("                margin: 8px 0;\r\n");
      out.write("                border: none;\r\n");
      out.write("                cursor: pointer;\r\n");
      out.write("                width: 100%;\r\n");
      out.write("                opacity: 0.9;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            button:hover {\r\n");
      out.write("                opacity:1;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            /* Extra styles for the cancel button */\r\n");
      out.write("            .cancelbtn {\r\n");
      out.write("                padding: 14px 20px;\r\n");
      out.write("                background-color: #f44336;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            /* Float cancel and signup buttons and add an equal width */\r\n");
      out.write("            .cancelbtn, .signupbtn {\r\n");
      out.write("                float: left;\r\n");
      out.write("                width: 50%;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            /* Add padding to container elements */\r\n");
      out.write("            .container {\r\n");
      out.write("                margin: 10px;\r\n");
      out.write("                padding: 16px;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            /* Clear floats */\r\n");
      out.write("            .clearfix::after {\r\n");
      out.write("                content: \"\";\r\n");
      out.write("                clear: both;\r\n");
      out.write("                display: table;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            /* Change styles for cancel button and signup button on extra small screens */\r\n");
      out.write("            @media screen and (max-width: 300px) {\r\n");
      out.write("                .cancelbtn, .signupbtn {\r\n");
      out.write("                    width: 100%;\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("        </style>\r\n");
      out.write("    <body>\r\n");
      out.write("        <form action=\"register\" method=\"post\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                ");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <form  style=\" border:1px solid #ccc\">\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <h1>Sign Up</h1>\r\n");
      out.write("                    <p>Please fill in this form to create an account.</p>\r\n");
      out.write("                    <hr>\r\n");
      out.write("                    <label for=\"Name\"><b>Name</b></label>\r\n");
      out.write("                    <input type=\"text\" placeholder=\"Name\" name=\"name\" required>\r\n");
      out.write("                    \r\n");
      out.write("                    <label for=\"username\"><b>Username</b></label>\r\n");
      out.write("                    <input type=\"text\" placeholder=\"Username\" name=\"username\" required>\r\n");
      out.write("\r\n");
      out.write("                    <label for=\"email\"><b>Email</b></label>\r\n");
      out.write("                    <input type=\"text\" placeholder=\"Enter Email\" name=\"email\" required>\r\n");
      out.write("\r\n");
      out.write("                    <label for=\"psw\"><b>Password</b></label>\r\n");
      out.write("                    <input type=\"password\" placeholder=\"Enter Password\" name=\"password1\" required>\r\n");
      out.write("\r\n");
      out.write("                    <label for=\"psw-repeat\"><b>Repeat Password</b></label>\r\n");
      out.write("                    <input type=\"password\" placeholder=\"Repeat Password\" name=\"password2\" required>\r\n");
      out.write("\r\n");
      out.write("                    <label>\r\n");
      out.write("                        <input type=\"checkbox\" checked=\"checked\" name=\"remember\" style=\"margin-bottom:15px\"> Remember me\r\n");
      out.write("                    </label>\r\n");
      out.write("\r\n");
      out.write("                    <p>If you have been account <a href=\"login\" style=\"color:dodgerblue\">Sign in</a>.</p>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"clearfix\">\r\n");
      out.write("                        <button type=\"submit\" name=\"register\" class=\"signupbtn\">Sign Up</button>\r\n");
      out.write("                        <button type=\"button\" class=\"cancelbtn\"><a href=\"home\"> Cancel</button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </form>\r\n");
      out.write("            <div class=\"footer\">\r\n");
      out.write("                ");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </form>\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
