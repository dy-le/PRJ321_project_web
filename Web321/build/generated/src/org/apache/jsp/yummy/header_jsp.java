package org.apache.jsp.yummy;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"description\" content=\"\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("        <!-- The above 4 meta tags *must* come first in the head; any other head content must come *after* these tags -->\r\n");
      out.write("\r\n");
      out.write("        <!-- Title -->\r\n");
      out.write("        <title>Yummy Blog - Food Blog Template</title>\r\n");
      out.write("\r\n");
      out.write("        <!-- Favicon -->\r\n");
      out.write("        <!--<link rel=\"icon\" href=\"img/core-img/favicon.ico\">-->\r\n");
      out.write("        <link rel=\"icon\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/media/LOGO.png\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Core Stylesheet -->\r\n");
      out.write("        <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/yummy/style.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Responsive CSS -->\r\n");
      out.write("        <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/yummy/css/responsive/responsive.css\" rel=\"stylesheet\">\r\n");
      out.write("        \r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <!-- ****** Top Header Area Start ****** -->\r\n");
      out.write("        <div class=\"top_header_area\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-5 col-sm-6\">\r\n");
      out.write("                        <!--  Top Social bar start -->\r\n");
      out.write("                        <div class=\"top_social_bar\">\r\n");
      out.write("                            <a href=\"#\"><i class=\"fa fa-facebook\" aria-hidden=\"true\"></i></a>\r\n");
      out.write("                            <a href=\"#\"><i class=\"fa fa-twitter\" aria-hidden=\"true\"></i></a>\r\n");
      out.write("                            <a href=\"#\"><i class=\"fa fa-linkedin\" aria-hidden=\"true\"></i></a>\r\n");
      out.write("                            <a href=\"#\"><i class=\"fa fa-skype\" aria-hidden=\"true\"></i></a>\r\n");
      out.write("                            <a href=\"#\"><i class=\"fa fa-dribbble\" aria-hidden=\"true\"></i></a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!--  Login Register Area   -->\r\n");
      out.write("                    <div class=\"col-7 col-sm-6\">\r\n");
      out.write("                        <div class=\"signup-search-area d-flex align-items-center justify-content-end\">\r\n");
      out.write("                            <div class=\"login_register_area d-flex\">\r\n");
      out.write("                                <div class=\"login\">\r\n");
      out.write("                                    <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/login/login.jsp\">Sign in</a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"register\">\r\n");
      out.write("                                    <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/register.jsp\">Sign up</a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"\">\r\n");
      out.write("                                    <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/register.jsp\">Sign out</a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <!-- Search Button Area -->\r\n");
      out.write("                            <!--                            <div class=\"search_button\">\r\n");
      out.write("                                                            <a class=\"searchBtn\" href=\"#\"><i class=\"fa fa-search\" aria-hidden=\"true\"></i></a>\r\n");
      out.write("                                                        </div>-->\r\n");
      out.write("                            <!-- Search Form -->\r\n");
      out.write("                            <!--                            <div class=\"search-hidden-form\">\r\n");
      out.write("                                                            <form action=\"#\" method=\"get\">\r\n");
      out.write("                                                                <input type=\"search\" name=\"search\" id=\"search-anything\" placeholder=\"Search Anything...\">\r\n");
      out.write("                                                                <input type=\"submit\" value=\"\" class=\"d-none\">\r\n");
      out.write("                                                                <span class=\"searchBtn\"><i class=\"fa fa-times\" aria-hidden=\"true\"></i></span>\r\n");
      out.write("                                                            </form>\r\n");
      out.write("                                                        </div>-->\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- ****** Top Header Area End ****** -->\r\n");
      out.write("        <!-- ****** Header Area Start ****** -->\r\n");
      out.write("        <header class=\"header_area\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <!-- Logo Area Start -->\r\n");
      out.write("                    <div class=\"col-12\">\r\n");
      out.write("                        <div class=\"logo_area text-center\">\r\n");
      out.write("                            <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/home\" class=\"yummy-logo\">Yummy Blog</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-12\">\r\n");
      out.write("                        <nav class=\"navbar navbar-expand-lg\">\r\n");
      out.write("                            <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#yummyfood-nav\" aria-controls=\"yummyfood-nav\" aria-expanded=\"false\" aria-label=\"Toggle navigation\"><i class=\"fa fa-bars\" aria-hidden=\"true\"></i> Menu</button>\r\n");
      out.write("                            <!-- Menu Area Start -->\r\n");
      out.write("                            <div class=\"collapse navbar-collapse justify-content-center\" id=\"yummyfood-nav\">\r\n");
      out.write("                                <ul class=\"navbar-nav\" id=\"yummy-nav\">\r\n");
      out.write("                                    <li class=\"nav-item active\">\r\n");
      out.write("                                        <a class=\"nav-link\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/home\">Home <span class=\"sr-only\">(current)</span></a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    <li class=\"nav-item dropdown\">\r\n");
      out.write("                                        <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"yummyDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">Pages</a>\r\n");
      out.write("                                        <div class=\"dropdown-menu\" aria-labelledby=\"yummyDropdown\">\r\n");
      out.write("                                            <a class=\"dropdown-item\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/home\">Home</a>\r\n");
      out.write("                                            <a class=\"dropdown-item\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/archive\">Archive</a>\r\n");
      out.write("                                            <a class=\"dropdown-item\" href=\"single.html\">Single Blog</a>\r\n");
      out.write("                                            <a class=\"dropdown-item\" href=\"static.html\">Static Page</a>\r\n");
      out.write("                                            <a class=\"dropdown-item\" href=\"contact.html\">Contact</a>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    <li class=\"nav-item\">\r\n");
      out.write("                                        <a class=\"nav-link\" href=\"#\">Features</a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    <li class=\"nav-item\">\r\n");
      out.write("                                        <a class=\"nav-link\" href=\"#\">Categories</a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    <li class=\"nav-item\">\r\n");
      out.write("                                        <a class=\"nav-link\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/archive\">Archive</a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    <li class=\"nav-item\">\r\n");
      out.write("                                        <a class=\"nav-link\" href=\"#\">About</a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    <li class=\"nav-item\">\r\n");
      out.write("                                        <a class=\"nav-link\" href=\"contact.html\">Contact</a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </nav>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </header>\r\n");
      out.write("        <!-- ****** Header Area End ****** -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
