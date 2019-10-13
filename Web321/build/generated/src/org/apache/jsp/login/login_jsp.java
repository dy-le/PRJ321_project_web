package org.apache.jsp.login;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <link type=\"text/css\" id=\"dark-mode\" rel=\"stylesheet\" href=\"https://getbootstrap.com/docs/4.0/examples/sign-in/\">\n");
      out.write("    <style type=\"text/css\" id=\"dark-mode-custom-style\"></style>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"author\" content=\"\">\n");
      out.write("        <link rel=\"icon\" href=\"../media/LOGO.png\">\n");
      out.write("        <title>Login Page</title>\n");
      out.write("        <link rel=\"canonical\" href=\"https://getbootstrap.com/docs/4.0/examples/sign-in/\">\n");
      out.write("        <!--<linkS rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">-->\n");
      out.write("        <!--<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>-->\n");
      out.write("        <!-- Bootstrap core CSS -->\n");
      out.write("        <link href=\"../vendor/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Custom styles for this template -->\n");
      out.write("        <link href=\"../vendor/bootstrap/css/signin.css\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("    <body class=\"text-center\" data-gr-c-s-loaded=\"true\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <form class=\"form-signin\">\n");
      out.write("                <img class=\"mb-4\" src=\"../media/LOGO.png\" alt=\"\" width=\"72\" height=\"72\">\n");
      out.write("                <h1 class=\"h3 mb-3 font-weight-normal\">Please sign in</h1>\n");
      out.write("                <label for=\"inputEmail\" class=\"sr-only\">Email address</label>\n");
      out.write("                <input type=\"email\" id=\"inputEmail\" class=\"form-control\" placeholder=\"Email address\" required=\"\" autofocus=\"\">\n");
      out.write("                <label for=\"inputPassword\" class=\"sr-only\">Password</label>\n");
      out.write("                <input type=\"password\" id=\"inputPassword\" class=\"form-control\" placeholder=\"Password\" required=\"\">\n");
      out.write("                <div class=\"checkbox mb-3\">\n");
      out.write("                    <label>\n");
      out.write("                        <input type=\"checkbox\" value=\"remember-me\"> Remember me\n");
      out.write("                    </label>\n");
      out.write("                </div>\n");
      out.write("                <button class=\"btn btn-lg btn-primary btn-block\" type=\"submit\">Sign in</button>\n");
      out.write("                <!--<p class=\"mt-5 mb-3 text-muted\">© 2017-2018</p>-->\n");
      out.write("                \n");
      out.write("            </form>\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../footer/footer.html", out, false);
      out.write("\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("</body>\n");
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
