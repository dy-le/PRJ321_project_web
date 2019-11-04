package org.apache.jsp.yummy;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_005f1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

static private org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_0;

static {
  _jspx_fnmap_0= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("fn:substring", org.apache.taglibs.standard.functions.Functions.class, "substring", new Class[] {java.lang.String.class, int.class, int.class});
}

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_end_begin;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_var_end_begin = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_c_forEach_var_end_begin.release();
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
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
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        <!--Preloader Start--> \r\n");
      out.write("        <!--        <div id=\"preloader\">\r\n");
      out.write("                    <div class=\"yummy-load\"></div>\r\n");
      out.write("                </div>-->\r\n");
      out.write("\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("        <!-- ****** Welcome Post Area Start ****** -->\r\n");
      out.write("        <div class=\"welcome-post-sliders owl-carousel\">\r\n");
      out.write("            <!-- Single Slide -->\r\n");
      out.write("            <div class=\"welcome-single-slide\">\r\n");
      out.write("                <!-- Post Thumb -->\r\n");
      out.write("                <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/yummy/img/bg-img/slide-1.jpg\" alt=\"\">\r\n");
      out.write("                <!-- Overlay Text -->\r\n");
      out.write("                <div class=\"project_title\">\r\n");
      out.write("                    <div class=\"post-date-commnents d-flex\">\r\n");
      out.write("                        <a href=\"#\">May 19, 2017</a>\r\n");
      out.write("                        <a href=\"#\">5 Comment</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <a href=\"#\">\r\n");
      out.write("                        <h5>“I’ve Come and I’m Gone”: A Tribute to Istanbul’s Street</h5>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <!-- Single Slide -->\r\n");
      out.write("            <div class=\"welcome-single-slide\">\r\n");
      out.write("                <!-- Post Thumb -->\r\n");
      out.write("                <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/yummy/img/bg-img/slide-2.jpg\" alt=\"\">\r\n");
      out.write("                <!-- Overlay Text -->\r\n");
      out.write("                <div class=\"project_title\">\r\n");
      out.write("                    <div class=\"post-date-commnents d-flex\">\r\n");
      out.write("                        <a href=\"#\">May 19, 2017</a>\r\n");
      out.write("                        <a href=\"#\">5 Comment</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <a href=\"#\">\r\n");
      out.write("                        <h5>“I’ve Come and I’m Gone”: A Tribute to Istanbul’s Street</h5>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <!-- Single Slide -->\r\n");
      out.write("            <div class=\"welcome-single-slide\">\r\n");
      out.write("                <!-- Post Thumb -->\r\n");
      out.write("                <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/yummy/img/bg-img/slide-1.jpg\" alt=\"\">\r\n");
      out.write("                <!-- Overlay Text -->\r\n");
      out.write("                <div class=\"project_title\">\r\n");
      out.write("                    <div class=\"post-date-commnents d-flex\">\r\n");
      out.write("                        <a href=\"#\">May 19, 2017</a>\r\n");
      out.write("                        <a href=\"#\">5 Comment</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <a href=\"#\">\r\n");
      out.write("                        <h5>“I’ve Come and I’m Gone”: A Tribute to Istanbul’s Street</h5>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <!-- Single Slide -->\r\n");
      out.write("            <div class=\"welcome-single-slide\">\r\n");
      out.write("                <!-- Post Thumb -->\r\n");
      out.write("                <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/yummy/img/bg-img/slide-3.jpg\" alt=\"\">\r\n");
      out.write("                <!-- Overlay Text -->\r\n");
      out.write("                <div class=\"project_title\">\r\n");
      out.write("                    <div class=\"post-date-commnents d-flex\">\r\n");
      out.write("                        <a href=\"#\">May 19, 2017</a>\r\n");
      out.write("                        <a href=\"#\">5 Comment</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <a href=\"#\">\r\n");
      out.write("                        <h5>“I’ve Come and I’m Gone”: A Tribute to Istanbul’s Street</h5>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <!-- Single Slide -->\r\n");
      out.write("            <div class=\"welcome-single-slide\">\r\n");
      out.write("                <!-- Post Thumb -->\r\n");
      out.write("                <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/yummy/img/bg-img/slide-4.jpg\" alt=\"\">\r\n");
      out.write("                <!-- Overlay Text -->\r\n");
      out.write("                <div class=\"project_title\">\r\n");
      out.write("                    <div class=\"post-date-commnents d-flex\">\r\n");
      out.write("                        <a href=\"#\">May 19, 2017</a>\r\n");
      out.write("                        <a href=\"#\">5 Comment</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <a href=\"#\">\r\n");
      out.write("                        <h5>“I’ve Come and I’m Gone”: A Tribute to Istanbul’s Street</h5>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- ****** Welcome Area End ****** -->\r\n");
      out.write("        <!-- ****** Categories Area Start ****** -->\r\n");
      out.write("        <section class=\"categories_area clearfix\" id=\"about\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <h2>type</h2>\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-12 col-md-4 col-lg-2\">\r\n");
      out.write("                        <div class=\"single_catagory\">\r\n");
      out.write("                            <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/yummy/img/catagory-img/1.jpg\" alt=\"\">\r\n");
      out.write("                            <div class=\"catagory-title\">\r\n");
      out.write("                                <a href=\"#\">\r\n");
      out.write("                                    <h5>News</h5>\r\n");
      out.write("                                </a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-12 col-md-4 col-lg-2\">\r\n");
      out.write("                        <div class=\"single_catagory\">\r\n");
      out.write("                            <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/yummy/img/catagory-img/2.jpg\" alt=\"\">\r\n");
      out.write("                            <div class=\"catagory-title\">\r\n");
      out.write("                                <a href=\"#\">\r\n");
      out.write("                                    <h5>sport</h5>\r\n");
      out.write("                                </a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-12 col-md-4 col-lg-2\">\r\n");
      out.write("                        <div class=\"single_catagory\">\r\n");
      out.write("                            <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/yummy/img/catagory-img/3.jpg\" alt=\"\">\r\n");
      out.write("                            <div class=\"catagory-title\">\r\n");
      out.write("                                <a href=\"#\">\r\n");
      out.write("                                    <h5>fashion</h5>\r\n");
      out.write("                                </a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-12 col-md-4 col-lg-2\">\r\n");
      out.write("                        <div class=\"single_catagory\">\r\n");
      out.write("                            <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/yummy/img/catagory-img/1.jpg\" alt=\"\">\r\n");
      out.write("                            <div class=\"catagory-title\">\r\n");
      out.write("                                <a href=\"#\">\r\n");
      out.write("                                    <h5>Food</h5>\r\n");
      out.write("                                </a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-12 col-md-4 col-lg-2\">\r\n");
      out.write("                        <div class=\"single_catagory\">\r\n");
      out.write("                            <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/yummy/img/catagory-img/2.jpg\" alt=\"\">\r\n");
      out.write("                            <div class=\"catagory-title\">\r\n");
      out.write("                                <a href=\"#\">\r\n");
      out.write("                                    <h5>Others</h5>\r\n");
      out.write("                                </a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("        <!-- ****** Categories Area End ****** -->\r\n");
      out.write("\r\n");
      out.write("        <!-- ****** Blog Area Start ****** -->\r\n");
      out.write("        <div class=\"blog_area section_padding_0_80\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row justify-content-center\">\r\n");
      out.write("                    <div class=\"col-12 col-lg-8\">\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            ");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                            <!-- Single Post -->\r\n");
      out.write("                            <div class=\"col-12\">\r\n");
      out.write("                                <div class=\"single-post\">\r\n");
      out.write("                                    <!-- Post Thumb -->\r\n");
      out.write("                                    <div class=\"post-thumb\">\r\n");
      out.write("                                        <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/yummy/img/blog-img/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${first.img}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" alt=\"\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <!-- Post Content -->\r\n");
      out.write("                                    <div class=\"post-content\">\r\n");
      out.write("                                        <div class=\"post-meta d-flex\">\r\n");
      out.write("                                            <div class=\"post-author-date-area d-flex\">\r\n");
      out.write("                                                <!-- Post Author -->\r\n");
      out.write("                                                <div class=\"post-author\">\r\n");
      out.write("                                                    <a href=\"#\">By ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${first.acc}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</a>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <!-- Post Date -->\r\n");
      out.write("                                                <div class=\"post-date\">\r\n");
      out.write("                                                    <a href=\"#\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${first.date}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</a>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <!-- Post Comment & Share Area -->\r\n");
      out.write("                                            <div class=\"post-comment-share-area d-flex\">\r\n");
      out.write("                                                <!-- Post Favourite -->\r\n");
      out.write("                                                <div class=\"post-favourite\">\r\n");
      out.write("                                                    <a onclick=\"focusMethod()\"><i class=\"fa fa-heart-o\" aria-hidden=\"true\"></i> 10</a>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <!-- Post Comments -->\r\n");
      out.write("                                                <div class=\"post-comments\">\r\n");
      out.write("                                                    <a href=\"#\"><i class=\"fa fa-comment-o\" aria-hidden=\"true\"></i> 12</a>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <!-- Post Share -->\r\n");
      out.write("                                                <div class=\"post-share\">\r\n");
      out.write("                                                    <a href=\"#\"><i class=\"fa fa-share-alt\" aria-hidden=\"true\"></i></a>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/post?idPost=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${first.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("                                            <h2 class=\"post-headline\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${first.header}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h2>\r\n");
      out.write("                                        </a>\r\n");
      out.write("                                        <p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:substring(first.body,0,150)}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("...</p>\r\n");
      out.write("                                        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/post?idPost=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${first.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"read-more\">Continue Reading..</a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "status.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("account", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("Daemon Lee", request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("id", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("18", request.getCharacterEncoding()), out, true);
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- ****** Blog Area End ****** -->\r\n");
      out.write("\r\n");
      out.write("        <!-- ****** Instagram Area Start ****** -->\r\n");
      out.write("        <div class=\"instargram_area owl-carousel section_padding_100_0 clearfix\" id=\"portfolio\">\r\n");
      out.write("\r\n");
      out.write("            <!-- Instagram Item -->\r\n");
      out.write("            <div class=\"instagram_gallery_item\">\r\n");
      out.write("                <!-- Instagram Thumb -->\r\n");
      out.write("                <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/yummy/img/instagram-img/1.jpg\" alt=\"\">\r\n");
      out.write("                <!-- Hover -->\r\n");
      out.write("                <div class=\"hover_overlay\">\r\n");
      out.write("                    <div class=\"yummy-table\">\r\n");
      out.write("                        <div class=\"yummy-table-cell\">\r\n");
      out.write("                            <div class=\"follow-me text-center\">\r\n");
      out.write("                                <a href=\"#\"><i class=\"fa fa-instagram\" aria-hidden=\"true\"></i> Follow me</a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <!-- Instagram Item -->\r\n");
      out.write("            <div class=\"instagram_gallery_item\">\r\n");
      out.write("                <!-- Instagram Thumb -->\r\n");
      out.write("                <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/yummy/img/instagram-img/2.jpg\" alt=\"\">\r\n");
      out.write("                <!-- Hover -->\r\n");
      out.write("                <div class=\"hover_overlay\">\r\n");
      out.write("                    <div class=\"yummy-table\">\r\n");
      out.write("                        <div class=\"yummy-table-cell\">\r\n");
      out.write("                            <div class=\"follow-me text-center\">\r\n");
      out.write("                                <a href=\"#\"><i class=\"fa fa-instagram\" aria-hidden=\"true\"></i> Follow me</a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <!-- Instagram Item -->\r\n");
      out.write("            <div class=\"instagram_gallery_item\">\r\n");
      out.write("                <!-- Instagram Thumb -->\r\n");
      out.write("                <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/yummy/img/instagram-img/3.jpg\" alt=\"\">\r\n");
      out.write("                <!-- Hover -->\r\n");
      out.write("                <div class=\"hover_overlay\">\r\n");
      out.write("                    <div class=\"yummy-table\">\r\n");
      out.write("                        <div class=\"yummy-table-cell\">\r\n");
      out.write("                            <div class=\"follow-me text-center\">\r\n");
      out.write("                                <a href=\"#\"><i class=\"fa fa-instagram\" aria-hidden=\"true\"></i> Follow me</a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <!-- Instagram Item -->\r\n");
      out.write("            <div class=\"instagram_gallery_item\">\r\n");
      out.write("                <!-- Instagram Thumb -->\r\n");
      out.write("                <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/yummy/img/instagram-img/4.jpg\" alt=\"\">\r\n");
      out.write("                <!-- Hover -->\r\n");
      out.write("                <div class=\"hover_overlay\">\r\n");
      out.write("                    <div class=\"yummy-table\">\r\n");
      out.write("                        <div class=\"yummy-table-cell\">\r\n");
      out.write("                            <div class=\"follow-me text-center\">\r\n");
      out.write("                                <a href=\"#\"><i class=\"fa fa-instagram\" aria-hidden=\"true\"></i> Follow me</a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <!-- Instagram Item -->\r\n");
      out.write("            <div class=\"instagram_gallery_item\">\r\n");
      out.write("                <!-- Instagram Thumb -->\r\n");
      out.write("                <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/yummy/img/instagram-img/5.jpg\" alt=\"\">\r\n");
      out.write("                <!-- Hover -->\r\n");
      out.write("                <div class=\"hover_overlay\">\r\n");
      out.write("                    <div class=\"yummy-table\">\r\n");
      out.write("                        <div class=\"yummy-table-cell\">\r\n");
      out.write("                            <div class=\"follow-me text-center\">\r\n");
      out.write("                                <a href=\"#\"><i class=\"fa fa-instagram\" aria-hidden=\"true\"></i> Follow me</a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <!-- Instagram Item -->\r\n");
      out.write("            <div class=\"instagram_gallery_item\">\r\n");
      out.write("                <!-- Instagram Thumb -->\r\n");
      out.write("                <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/yummy/img/instagram-img/6.jpg\" alt=\"\">\r\n");
      out.write("                <!-- Hover -->\r\n");
      out.write("                <div class=\"hover_overlay\">\r\n");
      out.write("                    <div class=\"yummy-table\">\r\n");
      out.write("                        <div class=\"yummy-table-cell\">\r\n");
      out.write("                            <div class=\"follow-me text-center\">\r\n");
      out.write("                                <a href=\"#\"><i class=\"fa fa-instagram\" aria-hidden=\"true\"></i> Follow me</a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <!-- Instagram Item -->\r\n");
      out.write("            <div class=\"instagram_gallery_item\">\r\n");
      out.write("                <!-- Instagram Thumb -->\r\n");
      out.write("                <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/yummy/img/instagram-img/1.jpg\" alt=\"\">\r\n");
      out.write("                <!-- Hover -->\r\n");
      out.write("                <div class=\"hover_overlay\">\r\n");
      out.write("                    <div class=\"yummy-table\">\r\n");
      out.write("                        <div class=\"yummy-table-cell\">\r\n");
      out.write("                            <div class=\"follow-me text-center\">\r\n");
      out.write("                                <a href=\"#\"><i class=\"fa fa-instagram\" aria-hidden=\"true\"></i> Follow me</a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <!-- Instagram Item -->\r\n");
      out.write("            <div class=\"instagram_gallery_item\">\r\n");
      out.write("                <!-- Instagram Thumb -->\r\n");
      out.write("                <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/yummy/img/instagram-img/7.jpg\" alt=\"\">\r\n");
      out.write("                <!-- Hover -->\r\n");
      out.write("                <div class=\"hover_overlay\">\r\n");
      out.write("                    <div class=\"yummy-table\">\r\n");
      out.write("                        <div class=\"yummy-table-cell\">\r\n");
      out.write("                            <div class=\"follow-me text-center\">\r\n");
      out.write("                                <a href=\"#\"><i class=\"fa fa-instagram\" aria-hidden=\"true\"></i> Follow me</a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- ****** Our Creative Portfolio Area End ****** -->\r\n");
      out.write("\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.html", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!--Jquery-2.2.4 js--> \r\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/yummy/js/jquery/jquery-2.2.4.min.js\"></script>\r\n");
      out.write("        <!--Popper js--> \r\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/yummy/js/bootstrap/popper.min.js\"></script>\r\n");
      out.write("        <!--Bootstrap-4 js--> \r\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/yummy/js/bootstrap/bootstrap.min.js\"></script>\r\n");
      out.write("        <!--All Plugins JS--> \r\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/yummy/js/others/plugins.js\"></script>\r\n");
      out.write("        <!--Active JS--> \r\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/yummy/js/active.js\"></script>\r\n");
      out.write("    </body>\r\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_end_begin.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("i");
    _jspx_th_c_forEach_0.setBegin(1);
    _jspx_th_c_forEach_0.setEnd(5);
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                <!-- Single Slide -->\r\n");
          out.write("                <div class=\"welcome-single-slide\">\r\n");
          out.write("                    <!-- Post Thumb -->\r\n");
          out.write("                    <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("/yummy/img/bg-img/slide-4.jpg\" alt=\"\">\r\n");
          out.write("                    <!-- Overlay Text -->\r\n");
          out.write("                    <div class=\"project_title\">\r\n");
          out.write("                        <div class=\"post-date-commnents d-flex\">\r\n");
          out.write("                            <a href=\"#\">May 19, 2017</a>\r\n");
          out.write("                            <a href=\"#\">5 Comment</a>\r\n");
          out.write("                        </div>\r\n");
          out.write("                        <a href=\"#\">\r\n");
          out.write("                            <h5>“I’ve Come </h5>\r\n");
          out.write("                        </a>\r\n");
          out.write("                    </div>\r\n");
          out.write("                </div>\r\n");
          out.write("            ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_end_begin.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent(null);
    _jspx_th_c_set_0.setVar("first");
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listpost[0]}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setVar("post");
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listpost.subList(1, 5)}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                <!-- Single Post -->\r\n");
          out.write("                                <div class=\"col-12 col-md-6\">\r\n");
          out.write("                                    <div class=\"single-post wow fadeInUp\" data-wow-delay=\".4s\">\r\n");
          out.write("                                        <!-- Post Thumb -->\r\n");
          out.write("                                        <div class=\"post-thumb\">\r\n");
          out.write("                                            <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("/yummy/img/blog-img/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${post.img}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"\">\r\n");
          out.write("                                        </div>\r\n");
          out.write("                                        <!-- Post Content -->\r\n");
          out.write("                                        <div class=\"post-content\">\r\n");
          out.write("                                            <div class=\"post-meta d-flex\">\r\n");
          out.write("                                                <div class=\"post-author-date-area d-flex\">\r\n");
          out.write("                                                    <!-- Post Author -->\r\n");
          out.write("                                                    <div class=\"post-author\">\r\n");
          out.write("                                                        <a href=\"#\">By ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${post.acc}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a>\r\n");
          out.write("                                                    </div>\r\n");
          out.write("                                                    <!-- Post Date -->\r\n");
          out.write("                                                    <div class=\"post-date\">\r\n");
          out.write("                                                        <a href=\"#\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${post.date}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a>\r\n");
          out.write("                                                    </div>\r\n");
          out.write("                                                </div>\r\n");
          out.write("                                                <!-- Post Comment & Share Area -->\r\n");
          out.write("                                                <div class=\"post-comment-share-area d-flex\">\r\n");
          out.write("                                                    <!-- Post Favourite -->\r\n");
          out.write("                                                    <div class=\"post-favourite\">\r\n");
          out.write("                                                        <a href=\"#\"><i class=\"fa fa-heart-o\" aria-hidden=\"true\"></i> 10</a>\r\n");
          out.write("                                                    </div>\r\n");
          out.write("                                                    <!-- Post Comments -->\r\n");
          out.write("                                                    <div class=\"post-comments\">\r\n");
          out.write("                                                        <a href=\"#\"><i class=\"fa fa-comment-o\" aria-hidden=\"true\"></i> 12</a>\r\n");
          out.write("                                                    </div>\r\n");
          out.write("                                                    <!-- Post Share -->\r\n");
          out.write("                                                    <div class=\"post-share\">\r\n");
          out.write("                                                        <a href=\"#\"><i class=\"fa fa-share-alt\" aria-hidden=\"true\"></i></a>\r\n");
          out.write("                                                    </div>\r\n");
          out.write("                                                </div>\r\n");
          out.write("                                            </div>\r\n");
          out.write("                                            <a href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("/post?idPost=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${post.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\r\n");
          out.write("                                                <h4 class=\"post-headline\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${post.header}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h4>\r\n");
          out.write("                                            </a>\r\n");
          out.write("                                        </div>\r\n");
          out.write("                                    </div>\r\n");
          out.write("                                </div>\r\n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }
}
