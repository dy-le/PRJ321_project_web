package org.apache.jsp.yummy;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class single_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("<html lang=\"en\">\r\n");
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
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        <!-- Preloader Start -->\r\n");
      out.write("        <!--        <div id=\"preloader\">\r\n");
      out.write("                    <div class=\"yummy-load\"></div>\r\n");
      out.write("                </div>-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- ****** Breadcumb Area Start ****** -->\r\n");
      out.write("        <div class=\"breadcumb-area\" style=\"background-image: url(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/yummy/img/bg-img/breadcumb.jpg);\">\r\n");
      out.write("            <div class=\"container h-100\">\r\n");
      out.write("                <div class=\"row h-100 align-items-center\">\r\n");
      out.write("                    <div class=\"col-12\">\r\n");
      out.write("                        <div class=\"bradcumb-title text-center\">\r\n");
      out.write("                            <h2>Single Post Blog</h2>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"breadcumb-nav\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-12\">\r\n");
      out.write("                        <nav aria-label=\"breadcrumb\">\r\n");
      out.write("                            <ol class=\"breadcrumb\">\r\n");
      out.write("                                <li class=\"breadcrumb-item\"><a href=\"#\"><i class=\"fa fa-home\" aria-hidden=\"true\"></i> Home</a></li>\r\n");
      out.write("                                <li class=\"breadcrumb-item\"><a href=\"#\">Archive</a></li>\r\n");
      out.write("                                <li class=\"breadcrumb-item active\" aria-current=\"page\">Single Post Blog</li>\r\n");
      out.write("                            </ol>\r\n");
      out.write("                        </nav>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- ****** Breadcumb Area End ****** -->\r\n");
      out.write("\r\n");
      out.write("        <!-- ****** Single Blog Area Start ****** -->\r\n");
      out.write("        <section class=\"single_blog_area section_padding_80\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row justify-content-center\">\r\n");
      out.write("                    <div class=\"col-12 col-lg-8\">\r\n");
      out.write("                        <div class=\"row no-gutters\">\r\n");
      out.write("\r\n");
      out.write("                            <!-- Single Post Share Info -->\r\n");
      out.write("                            <div class=\"col-2 col-sm-1\">\r\n");
      out.write("                                <div class=\"single-post-share-info mt-100\">\r\n");
      out.write("                                    <a href=\"#\" class=\"facebook\"><i class=\"fa fa-facebook\" aria-hidden=\"true\"></i></a>\r\n");
      out.write("                                    <a href=\"#\" class=\"twitter\"><i class=\"fa fa-twitter\" aria-hidden=\"true\"></i></a>\r\n");
      out.write("                                    <a href=\"#\" class=\"googleplus\"><i class=\"fa fa-google-plus\" aria-hidden=\"true\"></i></a>\r\n");
      out.write("                                    <a href=\"#\" class=\"instagram\"><i class=\"fa fa-instagram\" aria-hidden=\"true\"></i></a>\r\n");
      out.write("                                    <a href=\"#\" class=\"pinterest\"><i class=\"fa fa-pinterest\" aria-hidden=\"true\"></i></a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <!-- Single Post -->\r\n");
      out.write("                            <div class=\"col-10 col-sm-11\">\r\n");
      out.write("                                <div class=\"single-post\">\r\n");
      out.write("                                    <!-- Post Thumb -->\r\n");
      out.write("                                    <div class=\"post-thumb\">\r\n");
      out.write("                                        <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/yummy/img/blog-img/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${post.img}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" alt=\"\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <!-- Post Content -->\r\n");
      out.write("                                    <div class=\"post-content\">\r\n");
      out.write("                                        <div class=\"post-meta d-flex\">\r\n");
      out.write("                                            <div class=\"post-author-date-area d-flex\">\r\n");
      out.write("                                                <!-- Post Author -->\r\n");
      out.write("                                                <div class=\"post-author\">\r\n");
      out.write("                                                    <a href=\"#\">By  ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${post.acc}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</a>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <!-- Post Date -->\r\n");
      out.write("                                                <div class=\"post-date\">\r\n");
      out.write("                                                    <a href=\"#\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${post.date}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</a>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <!-- Post Comment & Share Area -->\r\n");
      out.write("                                            <div class=\"post-comment-share-area d-flex\">\r\n");
      out.write("                                                <!-- Post Favourite -->\r\n");
      out.write("                                                <div class=\"post-favourite\">\r\n");
      out.write("                                                    <a href=\"#\"><i class=\"fa fa-heart-o\" aria-hidden=\"true\"></i> 10</a>\r\n");
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
      out.write("                                        <a href=\"#\">\r\n");
      out.write("                                            <h2 class=\"post-headline\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${post.header}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h2>\r\n");
      out.write("                                        </a>\r\n");
      out.write("                                        ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${post.body}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                                <!-- Tags Area -->\r\n");
      out.write("                                <div class=\"tags-area\">\r\n");
      out.write("                                    <a href=\"#\">Multipurpose</a>\r\n");
      out.write("                                    <a href=\"#\">Design</a>\r\n");
      out.write("                                    <a href=\"#\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${post.typeId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</a>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                                <!-- Related Post Area -->\r\n");
      out.write("                                <div class=\"related-post-area section_padding_50\">\r\n");
      out.write("                                    <h4 class=\"mb-30\">Related post</h4>\r\n");
      out.write("\r\n");
      out.write("                                    <div class=\"related-post-slider owl-carousel\">\r\n");
      out.write("                                        ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                                <!-- Comment Area Start -->\r\n");
      out.write("                                <div class=\"comment_area section_padding_50 clearfix\">\r\n");
      out.write("                                    <h4 class=\"mb-30\">2 Comments</h4>\r\n");
      out.write("\r\n");
      out.write("                                    <ol>\r\n");
      out.write("                                        <!-- Single Comment Area -->\r\n");
      out.write("                                        <li class=\"single_comment_area\">\r\n");
      out.write("                                            <div class=\"comment-wrapper d-flex\">\r\n");
      out.write("                                                <!-- Comment Meta -->\r\n");
      out.write("                                                <div class=\"comment-author\">\r\n");
      out.write("                                                    <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/yummy/img/blog-img/17.jpg\" alt=\"\">\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <!-- Comment Content -->\r\n");
      out.write("                                                <div class=\"comment-content\">\r\n");
      out.write("                                                    <span class=\"comment-date text-muted\">27 Aug 2018</span>\r\n");
      out.write("                                                    <h5>Brandon Kelley</h5>\r\n");
      out.write("                                                    <p>Neque porro qui squam est, qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit, sed quia non numquam eius modi tempora.</p>\r\n");
      out.write("                                                    <a href=\"#\">Like</a>\r\n");
      out.write("                                                    <a class=\"active\" href=\"#\">Reply</a>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <ol class=\"children\">\r\n");
      out.write("                                                <li class=\"single_comment_area\">\r\n");
      out.write("                                                    <div class=\"comment-wrapper d-flex\">\r\n");
      out.write("                                                        <!-- Comment Meta -->\r\n");
      out.write("                                                        <div class=\"comment-author\">\r\n");
      out.write("                                                            <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/yummy/img/blog-img/18.jpg\" alt=\"\">\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                        <!-- Comment Content -->\r\n");
      out.write("                                                        <div class=\"comment-content\">\r\n");
      out.write("                                                            <span class=\"comment-date text-muted\">27 Aug 2018</span>\r\n");
      out.write("                                                            <h5>Brandon Kelley</h5>\r\n");
      out.write("                                                            <p>Neque porro qui squam est, qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit, sed quia non numquam eius modi tempora.</p>\r\n");
      out.write("                                                            <a href=\"#\">Like</a>\r\n");
      out.write("                                                            <a class=\"active\" href=\"#\">Reply</a>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </li>\r\n");
      out.write("                                            </ol>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                        <li class=\"single_comment_area\">\r\n");
      out.write("                                            <div class=\"comment-wrapper d-flex\">\r\n");
      out.write("                                                <!-- Comment Meta -->\r\n");
      out.write("                                                <div class=\"comment-author\">\r\n");
      out.write("                                                    <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/yummy/img/blog-img/19.jpg\" alt=\"\">\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <!-- Comment Content -->\r\n");
      out.write("                                                <div class=\"comment-content\">\r\n");
      out.write("                                                    <span class=\"comment-date text-muted\">27 Aug 2018</span>\r\n");
      out.write("                                                    <h5>Brandon Kelley</h5>\r\n");
      out.write("                                                    <p>Neque porro qui squam est, qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit, sed quia non numquam eius modi tempora.</p>\r\n");
      out.write("                                                    <a href=\"#\">Like</a>\r\n");
      out.write("                                                    <a class=\"active\" href=\"#\">Reply</a>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                    </ol>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                                <!-- Leave A Comment -->\r\n");
      out.write("                                <div class=\"leave-comment-area section_padding_50 clearfix\">\r\n");
      out.write("                                    <div class=\"comment-form\">\r\n");
      out.write("                                        <h4 class=\"mb-30\">Leave A Comment</h4>\r\n");
      out.write("\r\n");
      out.write("                                        <!-- Comment Form -->\r\n");
      out.write("                                        <form action=\"#\" method=\"post\">\r\n");
      out.write("                                            <div class=\"form-group\">\r\n");
      out.write("                                                <input type=\"text\" class=\"form-control\" id=\"contact-name\" placeholder=\"Name\">\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"form-group\">\r\n");
      out.write("                                                <input type=\"email\" class=\"form-control\" id=\"contact-email\" placeholder=\"Email\">\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"form-group\">\r\n");
      out.write("                                                <input type=\"text\" class=\"form-control\" id=\"contact-website\" placeholder=\"Website\">\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"form-group\">\r\n");
      out.write("                                                <textarea class=\"form-control\" name=\"message\" id=\"message\" cols=\"30\" rows=\"10\" placeholder=\"Message\"></textarea>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <button type=\"submit\" class=\"btn contact-btn\">Post Comment</button>\r\n");
      out.write("                                        </form>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!-- ****** Blog Sidebar ****** -->\r\n");
      out.write("                    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "status.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("account", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("Daemon Lee", request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("id", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("18", request.getCharacterEncoding()), out, true);
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("        <!-- ****** Single Blog Area End ****** -->\r\n");
      out.write("\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.html", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- Jquery-2.2.4 js -->\r\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/yummy/js/jquery/jquery-2.2.4.min.js\"></script>\r\n");
      out.write("        <!-- Popper js -->\r\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/yummy/js/bootstrap/popper.min.js\"></script>\r\n");
      out.write("        <!-- Bootstrap-4 js -->\r\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/yummy/js/bootstrap/bootstrap.min.js\"></script>\r\n");
      out.write("        <!-- All Plugins JS -->\r\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/yummy/js/others/plugins.js\"></script>\r\n");
      out.write("        <!-- Active JS -->\r\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/yummy/js/active.js\"></script>\r\n");
      out.write("    </body>\r\n");
      out.write("\r\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("pt");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listpost}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                            <!-- Single Related Post-->\r\n");
          out.write("                                            <div class=\"single-post\">\r\n");
          out.write("                                                <!-- Post Thumb -->\r\n");
          out.write("                                                <div class=\"post-thumb\">\r\n");
          out.write("                                                    <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("/yummy/img/blog-img/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pt.img}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pt.img}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\r\n");
          out.write("                                                </div>\r\n");
          out.write("                                                <!-- Post Content -->\r\n");
          out.write("                                                <div class=\"post-content\">\r\n");
          out.write("                                                    <div class=\"post-meta d-flex\">\r\n");
          out.write("                                                        <div class=\"post-author-date-area d-flex\">\r\n");
          out.write("                                                            <!-- Post Author -->\r\n");
          out.write("                                                            <div class=\"post-author\">\r\n");
          out.write("                                                                <a href=\"#\">By ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pt.acc}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a>\r\n");
          out.write("                                                            </div>\r\n");
          out.write("                                                            <!-- Post Date -->\r\n");
          out.write("                                                            <div class=\"post-date\">\r\n");
          out.write("                                                                <a href=\"#\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pt.date}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a>\r\n");
          out.write("                                                            </div>\r\n");
          out.write("                                                        </div>\r\n");
          out.write("                                                    </div>\r\n");
          out.write("                                                    <a href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("/post?idPost=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pt.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\r\n");
          out.write("                                                        <h6>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pt.header}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h6>\r\n");
          out.write("                                                    </a>\r\n");
          out.write("                                                </div>\r\n");
          out.write("                                            </div>\r\n");
          out.write("                                        ");
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
