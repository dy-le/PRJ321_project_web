package org.apache.jsp.yummy;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class typePost_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_set_var_value_nobody.release();
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <!-- The above 4 meta tags *must* come first in the head; any other head content must come *after* these tags -->\n");
      out.write("\n");
      out.write("        <!-- Title -->\n");
      out.write("        <title>Yummy Blog - Food Blog Template</title>\n");
      out.write("\n");
      out.write("        <!-- Favicon -->\n");
      out.write("        <link rel=\"icon\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/yummy/img/core-img/favicon.ico\">\n");
      out.write("\n");
      out.write("        <!-- Core Stylesheet -->\n");
      out.write("        <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/yummy/style.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Responsive CSS -->\n");
      out.write("        <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/yummy/css/responsive/responsive.css\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!-- Preloader Start -->\n");
      out.write("        <div id=\"preloader\">\n");
      out.write("            <div class=\"yummy-load\"></div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("        <!-- ****** Breadcumb Area Start ****** -->\n");
      out.write("\n");
      out.write("        <div class=\"breadcumb-area\" style=\"background-image: url(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/yummy/img/bg-img/breadcumb.jpg);\">\n");
      out.write("            <div class=\"container h-100\">\n");
      out.write("                <div class=\"row h-100 align-items-center\">\n");
      out.write("                    <div class=\"col-12\">\n");
      out.write("                        <div class=\"bradcumb-title text-center\">\n");
      out.write("                            <h2>Archive Page</h2>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"breadcumb-nav\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-12\">\n");
      out.write("                        <nav aria-label=\"breadcrumb\">\n");
      out.write("                            <ol class=\"breadcrumb\">\n");
      out.write("                                <li class=\"breadcrumb-item\"><a href=\"#\"><i class=\"fa fa-home\" aria-hidden=\"true\"></i> Home</a></li>\n");
      out.write("                                <li class=\"breadcrumb-item active\" aria-current=\"page\">Archive Page</li>\n");
      out.write("                            </ol>\n");
      out.write("                        </nav>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- ****** Breadcumb Area End ****** -->\n");
      out.write("\n");
      out.write("        <!-- ****** Categories Area Start ****** -->\n");
      out.write("        <section class=\"categories_area clearfix\" id=\"about\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <h2>type</h2>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-12 col-md-4 col-lg-2\">\n");
      out.write("                        <div class=\"single_catagory\">\n");
      out.write("                            <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/yummy/img/catagory-img/1.jpg\" alt=\"\">\n");
      out.write("                            <div class=\"catagory-title\">\n");
      out.write("                                <a href=\"#\">\n");
      out.write("                                    <h5>News</h5>\n");
      out.write("                                </a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-12 col-md-4 col-lg-2\">\n");
      out.write("                        <div class=\"single_catagory\">\n");
      out.write("                            <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/yummy/img/catagory-img/2.jpg\" alt=\"\">\n");
      out.write("                            <div class=\"catagory-title\">\n");
      out.write("                                <a href=\"#\">\n");
      out.write("                                    <h5>sport</h5>\n");
      out.write("                                </a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-12 col-md-4 col-lg-2\">\n");
      out.write("                        <div class=\"single_catagory\">\n");
      out.write("                            <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/yummy/img/catagory-img/3.jpg\" alt=\"\">\n");
      out.write("                            <div class=\"catagory-title\">\n");
      out.write("                                <a href=\"#\">\n");
      out.write("                                    <h5>fashion</h5>\n");
      out.write("                                </a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-12 col-md-4 col-lg-2\">\n");
      out.write("                        <div class=\"single_catagory\">\n");
      out.write("                            <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/yummy/img/catagory-img/1.jpg\" alt=\"\">\n");
      out.write("                            <div class=\"catagory-title\">\n");
      out.write("                                <a href=\"#\">\n");
      out.write("                                    <h5>Food</h5>\n");
      out.write("                                </a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-12 col-md-4 col-lg-2\">\n");
      out.write("                        <div class=\"single_catagory\">\n");
      out.write("                            <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/yummy/img/catagory-img/2.jpg\" alt=\"\">\n");
      out.write("                            <div class=\"catagory-title\">\n");
      out.write("                                <a href=\"#\">\n");
      out.write("                                    <h5>Others</h5>\n");
      out.write("                                </a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        <!-- ****** Categories Area End ****** -->\n");
      out.write("\n");
      out.write("        <!-- ****** Blog Area Start ****** -->\n");
      out.write("        <div class=\"blog_area section_padding_0_80\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row justify-content-center\">\n");
      out.write("                    <div class=\"col-12 col-lg-8\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            ");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            <!-- Single Post -->\n");
      out.write("                            <div class=\"col-12\">\n");
      out.write("                                <div class=\"single-post\">\n");
      out.write("                                    <!-- Post Thumb -->\n");
      out.write("                                    <div class=\"post-thumb\">\n");
      out.write("                                        <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/yummy/img/blog-img/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${first.img}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" alt=\"\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <!-- Post Content -->\n");
      out.write("                                    <div class=\"post-content\">\n");
      out.write("                                        <div class=\"post-meta d-flex\">\n");
      out.write("                                            <div class=\"post-author-date-area d-flex\">\n");
      out.write("                                                <!-- Post Author -->\n");
      out.write("                                                <div class=\"post-author\">\n");
      out.write("                                                    <a href=\"#\">By ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${first.acc}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</a>\n");
      out.write("                                                </div>\n");
      out.write("                                                <!-- Post Date -->\n");
      out.write("                                                <div class=\"post-date\">\n");
      out.write("                                                    <a href=\"#\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${first.date}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</a>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                            <!-- Post Comment & Share Area -->\n");
      out.write("                                            <div class=\"post-comment-share-area d-flex\">\n");
      out.write("                                                <!-- Post Favourite -->\n");
      out.write("                                                <div class=\"post-favourite\">\n");
      out.write("                                                    <a href=\"#\"><i class=\"fa fa-heart-o\" aria-hidden=\"true\"></i> 10</a>\n");
      out.write("                                                </div>\n");
      out.write("                                                <!-- Post Comments -->\n");
      out.write("                                                <div class=\"post-comments\">\n");
      out.write("                                                    <a href=\"#\"><i class=\"fa fa-comment-o\" aria-hidden=\"true\"></i> 12</a>\n");
      out.write("                                                </div>\n");
      out.write("                                                <!-- Post Share -->\n");
      out.write("                                                <div class=\"post-share\">\n");
      out.write("                                                    <a href=\"#\"><i class=\"fa fa-share-alt\" aria-hidden=\"true\"></i></a>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/post?idPost=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${first.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                            <h2 class=\"post-headline\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${first.header}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h2>\n");
      out.write("                                        </a>\n");
      out.write("                                        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/post?idPost=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${first.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"read-more\">Continue Reading..</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "status.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("account", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("Daemon Lee", request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("id", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("18", request.getCharacterEncoding()), out, true);
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- ****** Blog Area End ****** -->\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.html", out, false);
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Jquery-2.2.4 js -->\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/yummy/js/jquery/jquery-2.2.4.min.js\"></script>\n");
      out.write("        <!-- Popper js -->\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/yummy/js/bootstrap/popper.min.js\"></script>\n");
      out.write("        <!-- Bootstrap-4 js -->\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/yummy/js/bootstrap/bootstrap.min.js\"></script>\n");
      out.write("        <!-- All Plugins JS -->\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/yummy/js/others/plugins.js\"></script>\n");
      out.write("        <!-- Active JS -->\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/yummy/js/active.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("post");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listpost.subList(1, 5)}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                <!-- Single Post -->\n");
          out.write("                                <div class=\"col-12 col-md-6\">\n");
          out.write("                                    <div class=\"single-post wow fadeInUp\" data-wow-delay=\".4s\">\n");
          out.write("                                        <!-- Post Thumb -->\n");
          out.write("                                        <div class=\"post-thumb\">\n");
          out.write("                                            <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("/yummy/img/blog-img/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${post.img}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"\">\n");
          out.write("                                        </div>\n");
          out.write("                                        <!-- Post Content -->\n");
          out.write("                                        <div class=\"post-content\">\n");
          out.write("                                            <div class=\"post-meta d-flex\">\n");
          out.write("                                                <div class=\"post-author-date-area d-flex\">\n");
          out.write("                                                    <!-- Post Author -->\n");
          out.write("                                                    <div class=\"post-author\">\n");
          out.write("                                                        <a href=\"#\">By ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${post.acc}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a>\n");
          out.write("                                                    </div>\n");
          out.write("                                                    <!-- Post Date -->\n");
          out.write("                                                    <div class=\"post-date\">\n");
          out.write("                                                        <a href=\"#\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${post.date}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a>\n");
          out.write("                                                    </div>\n");
          out.write("                                                </div>\n");
          out.write("                                                <!-- Post Comment & Share Area -->\n");
          out.write("                                                <div class=\"post-comment-share-area d-flex\">\n");
          out.write("                                                    <!-- Post Favourite -->\n");
          out.write("                                                    <div class=\"post-favourite\">\n");
          out.write("                                                        <a href=\"#\"><i class=\"fa fa-heart-o\" aria-hidden=\"true\"></i> 10</a>\n");
          out.write("                                                    </div>\n");
          out.write("                                                    <!-- Post Comments -->\n");
          out.write("                                                    <div class=\"post-comments\">\n");
          out.write("                                                        <a href=\"#\"><i class=\"fa fa-comment-o\" aria-hidden=\"true\"></i> 12</a>\n");
          out.write("                                                    </div>\n");
          out.write("                                                    <!-- Post Share -->\n");
          out.write("                                                    <div class=\"post-share\">\n");
          out.write("                                                        <a href=\"#\"><i class=\"fa fa-share-alt\" aria-hidden=\"true\"></i></a>\n");
          out.write("                                                    </div>\n");
          out.write("                                                </div>\n");
          out.write("                                            </div>\n");
          out.write("                                            <a href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("/post?idPost=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${post.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                                                <h4 class=\"post-headline\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${post.header}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h4>\n");
          out.write("                                            </a>\n");
          out.write("                                        </div>\n");
          out.write("                                    </div>\n");
          out.write("                                </div>\n");
          out.write("                            ");
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
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
