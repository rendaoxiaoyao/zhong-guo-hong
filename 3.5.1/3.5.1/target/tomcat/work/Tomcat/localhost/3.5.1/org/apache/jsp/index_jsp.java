/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2023-04-27 05:09:26 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("  <title>用户综合管理软件</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"div_1\">\r\n");
      out.write("  <button id=\"add\">增加</button><br>\r\n");
      out.write("  <button id=\"logout\">退出</button><br>\r\n");
      out.write("  <button id=\"update\">修改</button><br>\r\n");
      out.write("  <button id=\"select\">查询</button><br>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("  document.getElementById('add').addEventListener('click',function () {\r\n");
      out.write("    location.href=\"/3.5.1/page/insert.jsp\"\r\n");
      out.write("  })\r\n");
      out.write("  document.getElementById('logout').addEventListener('click',function () {\r\n");
      out.write("    location.href=\"/3.5.1/LogoutServlet\"\r\n");
      out.write("  })\r\n");
      out.write("  document.getElementById('update').addEventListener('click',function () {\r\n");
      out.write("    location.href=\"/3.5.1/page/update.jsp\"\r\n");
      out.write("  })\r\n");
      out.write("  document.getElementById('select').addEventListener('click',function () {\r\n");
      out.write("    location.href=\"/3.5.1/users/UserServlet?method=select\"\r\n");
      out.write("  })\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("<style>\r\n");
      out.write("  *{\r\n");
      out.write("    margin: 0;\r\n");
      out.write("    padding: 0;\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("  body{\r\n");
      out.write("    background-color: #66afe9;\r\n");
      out.write("  }\r\n");
      out.write("  .div_1{\r\n");
      out.write("    background-color: #466BAF;\r\n");
      out.write("    margin: 250px auto;\r\n");
      out.write("    /*margin-top: 10%;*/\r\n");
      out.write("    /*margin-left: 20%;*/\r\n");
      out.write("    width: 50%;\r\n");
      out.write("    border: 2px solid #466BAF;\r\n");
      out.write("    border-radius: 5px;\r\n");
      out.write("\r\n");
      out.write("  }\r\n");
      out.write("  button{\r\n");
      out.write("    background-color:#f66f6a;\r\n");
      out.write("    color:white;\r\n");
      out.write("    width: 80px;\r\n");
      out.write("    height: 40px;\r\n");
      out.write("    border:0;\r\n");
      out.write("    font-size: 16px;\r\n");
      out.write("    box-sizing: content-box;\r\n");
      out.write("    border: 2px solid #f66f6a;\r\n");
      out.write("    border-radius: 5px;\r\n");
      out.write("\r\n");
      out.write("    margin-top: 10px;\r\n");
      out.write("    margin-left: 30%;\r\n");
      out.write("    /*padding: 100px;*/\r\n");
      out.write("  }\r\n");
      out.write("  button:hover{\r\n");
      out.write("    background-color: #a54b4a;\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
