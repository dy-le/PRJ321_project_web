package org.apache.jsp.Register;

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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"../vendor/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"../vendor/bootstrap/js/bootstrap.bundle.js\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"../vendor/bootstrap/css/all.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"../vendor/jquery/jquery.slim.min.js\" rel=\"stylesheet\">\n");
      out.write("        <style>\n");
      out.write("            :root {\n");
      out.write("                --input-padding-x: 1.5rem;\n");
      out.write("                --input-padding-y: 0.75rem;\n");
      out.write("            }\n");
      out.write("            body {\n");
      out.write("                background: #007bff;\n");
      out.write("                background: linear-gradient(to right, #0062E6, #33AEFF);\n");
      out.write("            }\n");
      out.write("            .card-signin {\n");
      out.write("                border: 0;\n");
      out.write("                border-radius: 1rem;\n");
      out.write("                box-shadow: 0 0.5rem 1rem 0 rgba(0, 0, 0, 0.1);\n");
      out.write("                overflow: hidden;\n");
      out.write("            }\n");
      out.write("            .card-signin .card-title {\n");
      out.write("                margin-bottom: 2rem;\n");
      out.write("                font-weight: 300;\n");
      out.write("                font-size: 1.5rem;\n");
      out.write("            }\n");
      out.write("            .card-signin .card-img-left {\n");
      out.write("                width: 45%;\n");
      out.write("                /* Link to your background image using in the property below! */\n");
      out.write("                background: scroll center url(\"../media/LOGO.png\");\n");
      out.write("                background-size: cover;\n");
      out.write("            }\n");
      out.write("            .card-signin .card-body {\n");
      out.write("                padding: 2rem;\n");
      out.write("            }\n");
      out.write("            .form-signin {\n");
      out.write("                width: 100%;\n");
      out.write("            }\n");
      out.write("            .form-signin .btn {\n");
      out.write("                font-size: 80%;\n");
      out.write("                border-radius: 5rem;\n");
      out.write("                letter-spacing: .1rem;\n");
      out.write("                font-weight: bold;\n");
      out.write("                padding: 1rem;\n");
      out.write("                transition: all 0.2s;\n");
      out.write("            }\n");
      out.write("            .form-label-group {\n");
      out.write("                position: relative;\n");
      out.write("                margin-bottom: 1rem;\n");
      out.write("            }\n");
      out.write("            .form-label-group input {\n");
      out.write("                height: auto;\n");
      out.write("                border-radius: 2rem;\n");
      out.write("            }\n");
      out.write("            /*            .form-label-group>input,\n");
      out.write("                        .form-label-group>label {\n");
      out.write("                            padding: var(--input-padding-y) var(--input-padding-x);\n");
      out.write("                        }*/\n");
      out.write("            .form-label-group>label {\n");
      out.write("                position: absolute;\n");
      out.write("                top: 0;\n");
      out.write("                left: 0;\n");
      out.write("                display: block;\n");
      out.write("                width: 100%;\n");
      out.write("                margin-bottom: 0;\n");
      out.write("                /* Override default `<label>` margin */\n");
      out.write("                line-height: 1.5;\n");
      out.write("                color: #495057;\n");
      out.write("                border: 1px solid transparent;\n");
      out.write("                border-radius: .25rem;\n");
      out.write("                transition: all .1s ease-in-out;\n");
      out.write("            }\n");
      out.write("            .form-label-group input::-webkit-input-placeholder {\n");
      out.write("                color: transparent;\n");
      out.write("            }\n");
      out.write("            .form-label-group input:-ms-input-placeholder {\n");
      out.write("                color: transparent;\n");
      out.write("            }\n");
      out.write("            .form-label-group input::-ms-input-placeholder {\n");
      out.write("                color: transparent;\n");
      out.write("            }\n");
      out.write("            .form-label-group input::-moz-placeholder {\n");
      out.write("                color: transparent;\n");
      out.write("            }\n");
      out.write("            .form-label-group input::placeholder {\n");
      out.write("                color: transparent;\n");
      out.write("            }\n");
      out.write("            /*            .form-label-group input:not(:placeholder-shown) {\n");
      out.write("                            padding-top: calc(var(--input-padding-y) + var(--input-padding-y) * (2 / 3));\n");
      out.write("                            padding-bottom: calc(var(--input-padding-y) / 3);\n");
      out.write("                        }\n");
      out.write("                        .form-label-group input:not(:placeholder-shown)~label {\n");
      out.write("                            padding-top: calc(var(--input-padding-y) / 3);\n");
      out.write("                            padding-bottom: calc(var(--input-padding-y) / 3);\n");
      out.write("                            font-size: 12px;\n");
      out.write("                            color: #777;\n");
      out.write("                        }*/\n");
      out.write("            .btn-google {\n");
      out.write("                color: white;\n");
      out.write("                background-color: #ea4335;\n");
      out.write("            }\n");
      out.write("            .btn-facebook {\n");
      out.write("                color: white;\n");
      out.write("                background-color: #3b5998;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <!-- This snippet uses Font Awesome 5 Free as a dependency. You can download it at fontawesome.io! -->\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-10 col-xl-9 mx-auto\">\n");
      out.write("                        <div class=\"card card-signin flex-row my-5\">\n");
      out.write("                            <div class=\"card-img-left d-none d-md-flex\">\n");
      out.write("                                <!--Background image for card set in CSS!--> \n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("                                <h5 class=\"card-title text-center\"><br> </h5>\n");
      out.write("\n");
      out.write("                                <form class=\"form-signin\" action=\"register\" method=\"post\">\n");
      out.write("                                    <div>\n");
      out.write("                                        <label>UserName</label>\n");
      out.write("                                        <input type=\"text\"  class=\"form-control\" onfocus=\"if (this.value == 'Username') {\n");
      out.write("                                                    this.value = '';\n");
      out.write("                                                }\" value=\"Username\" required name=\"username\">\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <div>\n");
      out.write("                                        <label>Email address</label>\n");
      out.write("                                        <input type=\"email\"  class=\"form-control\" onfocus=\"if (this.value == 'Email address') {\n");
      out.write("                                                    this.value = '';\n");
      out.write("                                                }\" value=\"Email address\" required name=\"email\">\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <hr>\n");
      out.write("\n");
      out.write("                                    <div>\n");
      out.write("                                        <label>Password</label>\n");
      out.write("                                        <input type=\"password\" class=\"form-control\" onfocus=\"if (this.value == 'Password') {\n");
      out.write("                                                    this.value = '';\n");
      out.write("                                                }\" value=\"Password\" required name=\"password1\">\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <div>\n");
      out.write("                                        <label>Password</label>\n");
      out.write("                                        <input type=\"password\"  class=\"form-control\" onfocus=\"if (this.value == 'Password') {\n");
      out.write("                                                    this.value = '';\n");
      out.write("                                                }\" value=\"Password\" required name=\"password2\">\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <button class=\"btn btn-lg btn-primary btn-block text-uppercase\" type=\"submit\" name=\"register\" value=\"1\">Register</button>\n");
      out.write("                                    <a class=\"d-block text-center mt-2 small\" href=\"../login\">Sign In</a>\n");
      out.write("                                    <hr class=\"my-4\">\n");
      out.write("                                    <button class=\"btn btn-lg btn-google btn-block text-uppercase\" type=\"submit\"><i class=\"fab fa-google mr-2\"></i> Sign up with Google</button>\n");
      out.write("                                    <button class=\"btn btn-lg btn-facebook btn-block text-uppercase\" type=\"submit\"><i class=\"fab fa-facebook-f mr-2\"></i> Sign up with Facebook</button>\n");
      out.write("                                </form>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
