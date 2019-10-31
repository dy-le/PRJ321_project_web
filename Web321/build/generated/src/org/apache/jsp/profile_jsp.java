package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class profile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_if_test.release();
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

      out.write('c');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"></script>\n");
      out.write("        <!--<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"></script>-->\n");
      out.write("        <!--<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">-->\n");
      out.write("        <!--<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">-->\n");
      out.write("        <style>\n");
      out.write("            body {font-family: Arial, Helvetica, sans-serif;}\n");
      out.write("            * {box-sizing: border-box}\n");
      out.write("\n");
      out.write("            /* Full-width input fields */\n");
      out.write("            input[type=text], input[type=password] {\n");
      out.write("                width: 100%;\n");
      out.write("                padding: 15px;\n");
      out.write("                margin: 5px 0 22px 0;\n");
      out.write("                display: inline-block;\n");
      out.write("                border: none;\n");
      out.write("                background: #f1f1f1;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            input[type=text]:focus, input[type=password]:focus {\n");
      out.write("                background-color: #ddd;\n");
      out.write("                outline: none;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            hr {\n");
      out.write("                border: 1px solid #f1f1f1;\n");
      out.write("                margin-bottom: 25px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Set a style for all buttons */\n");
      out.write("            button {\n");
      out.write("                background-color: #4CAF50;\n");
      out.write("                color: white;\n");
      out.write("                padding: 14px 20px;\n");
      out.write("                margin: 8px 0;\n");
      out.write("                border: none;\n");
      out.write("                cursor: pointer;\n");
      out.write("                width: 100%;\n");
      out.write("                opacity: 0.9;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            button:hover {\n");
      out.write("                opacity:1;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Extra styles for the cancel button */\n");
      out.write("            .cancelbtn {\n");
      out.write("                padding: 14px 20px;\n");
      out.write("                background-color: #f44336;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Float cancel and signup buttons and add an equal width */\n");
      out.write("            .cancelbtn, .signupbtn {\n");
      out.write("                float: left;\n");
      out.write("                width: 50%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Add padding to container elements */\n");
      out.write("            .container {\n");
      out.write("                top: 0;\n");
      out.write("                margin: 10px;\n");
      out.write("                padding: 16px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Clear floats */\n");
      out.write("            .clearfix::after {\n");
      out.write("                content: \"\";\n");
      out.write("                clear: both;\n");
      out.write("                display: table;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Change styles for cancel button and signup button on extra small screens */\n");
      out.write("            @media screen and (max-width: 300px) {\n");
      out.write("                .cancelbtn, .signupbtn {\n");
      out.write("                    width: 100%;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "yummy/header.jsp", out, false);
      out.write("\n");
      out.write("        <form action=\"profile\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                ");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <form  style=\" border:1px solid #ccc\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("            <div class=\"footer\">\n");
      out.write("                ");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("<script>\n");
      out.write("    function changeValue() {\n");
      out.write("        var x = document.getElementById(\"1\").value;\n");
      out.write("        if (x === \"Change\") {\n");
      out.write("            document.getElementById(\"1\").innerHTML = \"Cancel changing\";\n");
      out.write("            document.getElementById(\"1\").value = \"Cancel changing\";\n");
      out.write("            $(\"input\").prop('disabled', false);\n");
      out.write("        } else {\n");
      out.write("            document.getElementById(\"1\").innerHTML = \"Change\";\n");
      out.write("            document.getElementById(\"1\").value = \"Change\";\n");
      out.write("            $(\"input\").prop('disabled', true);\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("</script>\n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty sessionScope.login}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                        <img src=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("/media/img/");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.login.userID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write(".jpg\" alt=\"\" width=\"250\" height=\"250\">\n");
        out.write("                        <hr>\n");
        out.write("                        <label for=\"name\">\n");
        out.write("                            <b>Name</b>\n");
        out.write("                        </label>\n");
        out.write("                        <!--<input type=\"text\" placeholder=\"Empty\"  name=\"name\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write('"');
        out.write(' ');
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${change==\"0\"?\"disabled\":\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("  required>-->\n");
        out.write("                        <input type=\"text\" placeholder=\"Empty\"  name=\"name\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"  required disabled>\n");
        out.write("\n");
        out.write("\n");
        out.write("                        <label for=\"age\"><b>Age</b></label>\n");
        out.write("                        <input type=\"text\" placeholder=\"Empty\"   name=\"age\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.age}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" required disabled>\n");
        out.write("\n");
        out.write("                        <label for=\"phone\"><b>Phone</b></label>\n");
        out.write("                        <input type=\"text\" placeholder=\"Empty\"   name=\"phone\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.phone}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" required disabled>\n");
        out.write("\n");
        out.write("                        <label for=\"email\"><b>Email</b></label>\n");
        out.write("                        <input type=\"text\" placeholder=\"Empty\"  name=\"email\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" required disabled>\n");
        out.write("\n");
        out.write("                        <div class=\"clearfix\">               \n");
        out.write("                            <button type=\"button\" name=\"change\" id=\"1\" onclick=\"changeValue();\"  value=\"Change\" class=\"signupbtn\">Change</button>\n");
        out.write("                            <button type=\"submit\" class=\"cancelbtn\" name=\"save\" value=\"save\">Save</button>\n");
        out.write("\n");
        out.write("                            <button type=\"button\" name=\"home\" class=\"signupbtn\" style=\"background: #3366FF; width: 100%;\"><a href=\"home\">HOME</button>\n");
        out.write("                        </div>\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }
}
