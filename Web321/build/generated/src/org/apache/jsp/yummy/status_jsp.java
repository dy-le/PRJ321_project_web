package org.apache.jsp.yummy;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class status_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"icon\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/yummy/img/core-img/favicon.ico\">\r\n");
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
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("\r\n");
      out.write("        <!-- ****** Blog Sidebar ****** -->\r\n");
      out.write("        <div class=\"col-12 col-sm-8 col-md-6 col-lg-4\">\r\n");
      out.write("\r\n");
      out.write("            <div class=\"blog-sidebar mt-5 mt-lg-0\">\r\n");
      out.write("                <!-- Single Widget Area -->\r\n");
      out.write("                <form action=\"home\">\r\n");
      out.write("                    <div class=\"single-widget-area about-me-widget text-center\">\r\n");
      out.write("                        <div class=\"widget-title\">\r\n");
      out.write("                            <h6>About Me</h6>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"about-me-widget-thumb\">\r\n");
      out.write("                            <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/media/img/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.login.userID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(".jpg\" alt=\"\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                            <h4 class=\"font-shadow-into-light\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.login.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h4>\r\n");
      out.write("                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </form>\r\n");
      out.write("                <!-- Single Widget Area -->\r\n");
      out.write("                <div class=\"single-widget-area subscribe_widget text-center\">\r\n");
      out.write("                    <div class=\"widget-title\">\r\n");
      out.write("                        <h6>Subscribe &amp; Follow</h6>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"subscribe-link\">\r\n");
      out.write("                        <a href=\"#\"><i class=\"fa fa-facebook\" aria-hidden=\"true\"></i></a>\r\n");
      out.write("                        <a href=\"#\"><i class=\"fa fa-twitter\" aria-hidden=\"true\"></i></a>\r\n");
      out.write("                        <a href=\"#\"><i class=\"fa fa-google\" aria-hidden=\"true\"></i></a>\r\n");
      out.write("                        <a href=\"#\"><i class=\"fa fa-linkedin-square\" aria-hidden=\"true\"></i></a>\r\n");
      out.write("                        <a href=\"#\"><i class=\"fa fa-instagram\" aria-hidden=\"true\"></i></a>\r\n");
      out.write("                        <a href=\"#\"><i class=\"fa fa-vimeo\" aria-hidden=\"true\"></i></a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <!-- Single Widget Area -->\r\n");
      out.write("                <div class=\"single-widget-area popular-post-widget\">\r\n");
      out.write("                    <div class=\"widget-title text-center\">\r\n");
      out.write("                        <h6>Populer Post</h6>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!-- Single Popular Post -->\r\n");
      out.write("                    <div class=\"single-populer-post d-flex\">\r\n");
      out.write("                        <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/yummy/img/sidebar-img/1.jpg\" alt=\"\">\r\n");
      out.write("                        <div class=\"post-content\">\r\n");
      out.write("                            <a href=\"#\">\r\n");
      out.write("                                <h6>Top Wineries To Visit In England</h6>\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <p>Tuesday, October 3, 2017</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!-- Single Popular Post -->\r\n");
      out.write("                    <div class=\"single-populer-post d-flex\">\r\n");
      out.write("                        <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/yummy/img/sidebar-img/2.jpg\" alt=\"\">\r\n");
      out.write("                        <div class=\"post-content\">\r\n");
      out.write("                            <a href=\"#\">\r\n");
      out.write("                                <h6>The 8 Best Gastro Pubs In Bath</h6>\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <p>Tuesday, October 3, 2017</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!-- Single Popular Post -->\r\n");
      out.write("                    <div class=\"single-populer-post d-flex\">\r\n");
      out.write("                        <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/yummy/img/sidebar-img/3.jpg\" alt=\"\">\r\n");
      out.write("                        <div class=\"post-content\">\r\n");
      out.write("                            <a href=\"#\">\r\n");
      out.write("                                <h6>Zermatt Unplugged the best festival</h6>\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <p>Tuesday, October 3, 2017</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!-- Single Popular Post -->\r\n");
      out.write("                    <div class=\"single-populer-post d-flex\">\r\n");
      out.write("                        <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/yummy/img/sidebar-img/4.jpg\" alt=\"\">\r\n");
      out.write("                        <div class=\"post-content\">\r\n");
      out.write("                            <a href=\"#\">\r\n");
      out.write("                                <h6>Harrogate's Top 10 Independent Eats</h6>\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <p>Tuesday, October 3, 2017</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!-- Single Popular Post -->\r\n");
      out.write("                    <div class=\"single-populer-post d-flex\">\r\n");
      out.write("                        <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/yummy/img/sidebar-img/5.jpg\" alt=\"\">\r\n");
      out.write("                        <div class=\"post-content\">\r\n");
      out.write("                            <a href=\"#\">\r\n");
      out.write("                                <h6>Eating Out On A Budget In Oxford</h6>\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <p>Tuesday, October 3, 2017</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <!-- Single Widget Area -->\r\n");
      out.write("                <div class=\"single-widget-area add-widget text-center\">\r\n");
      out.write("                    <div class=\"add-widget-area\">\r\n");
      out.write("                        <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/yummy/img/sidebar-img/6.jpg\" alt=\"\">\r\n");
      out.write("                        <div class=\"add-text\">\r\n");
      out.write("                            <div class=\"yummy-table\">\r\n");
      out.write("                                <div class=\"yummy-table-cell\">\r\n");
      out.write("                                    <h2>Cooking Book</h2>\r\n");
      out.write("                                    <p>Buy Book Online Now!</p>\r\n");
      out.write("                                    <a href=\"#\" class=\"add-btn\">Buy Now</a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <!-- Single Widget Area -->\r\n");
      out.write("                <div class=\"single-widget-area newsletter-widget\">\r\n");
      out.write("                    <div class=\"widget-title text-center\">\r\n");
      out.write("                        <h6>Newsletter</h6>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <p>Subscribe our newsletter gor get notification about new updates, information discount, etc.</p>\r\n");
      out.write("                    <div class=\"newsletter-form\">\r\n");
      out.write("                        <form action=\"#\" method=\"post\">\r\n");
      out.write("                            <input type=\"email\" name=\"newsletter-email\" id=\"email\" placeholder=\"Your email\">\r\n");
      out.write("                            <button type=\"submit\"><i class=\"fa fa-paper-plane-o\" aria-hidden=\"true\"></i></button>\r\n");
      out.write("                        </form>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
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
