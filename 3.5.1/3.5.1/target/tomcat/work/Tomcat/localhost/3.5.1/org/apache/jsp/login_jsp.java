/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2023-05-11 15:43:14 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>登录界面</title>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"content\">\r\n");
      out.write("\r\n");
      out.write("    <!--  登录面板    -->\r\n");
      out.write("    <div class=\"panel\">\r\n");
      out.write("\r\n");
      out.write("        <!--  账号和密码组    -->\r\n");
      out.write("        <div class=\"group\">\r\n");
      out.write("            <label>账号</label>\r\n");
      out.write("            <input id=\"name\" placeholder=\"请输入账号\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"group\">\r\n");
      out.write("            <label>密码</label>\r\n");
      out.write("            <input id=\"password\" placeholder=\"请输入密码\" type=\"password\">\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!--  登录按钮    -->\r\n");
      out.write("        <div id=\"login\" class=\"login\">\r\n");
      out.write("            <button>登录</button>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <!--  注册按钮    -->\r\n");
      out.write("    <div class=\"register\">\r\n");
      out.write("        <button onclick=\"add()\">创建新账号</button>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    document.getElementById('login').addEventListener('click',function () {\r\n");
      out.write("\r\n");
      out.write("        name=document.getElementById('name').value\r\n");
      out.write("        password=document.getElementById('password').value\r\n");
      out.write("        console.log(name+\" \"+password)\r\n");
      out.write("\r\n");
      out.write("        if(name!=\"\"&&password!=\"\"){\r\n");
      out.write("            location.href=\"http://localhost:8080/3.5.1/login?name=\"+name+\"&password=\"+password;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("    })\r\n");
      out.write("\r\n");
      out.write("    function add() {\r\n");
      out.write("        location.href=\"http://localhost:8080/3.5.1/register.jsp\";\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("<style>\r\n");
      out.write("    /*按照样图要求，添加一个浅灰色背景*/\r\n");
      out.write("    body{\r\n");
      out.write("        background-color: #F2F2F2;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    /*设置内容模块距离顶部一个有一段距离150px*/\r\n");
      out.write("    .content {\r\n");
      out.write("        margin-top: 150px;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    /*登录和注册按钮的整体样式*/\r\n");
      out.write("    .content button {\r\n");
      out.write("        height: 30px;/*登录和注册按钮的高度*/\r\n");
      out.write("        color:  white;/*登录和注册按钮字体颜色为白色*/\r\n");
      out.write("        font-size: 18px;/*登录和注册按钮的字体大小*/\r\n");
      out.write("        border: 0px;/*无边框*/\r\n");
      out.write("        padding: 0px;/*无内边距*/\r\n");
      out.write("        cursor: pointer;/*登录和注册按钮的选择时为手形状*/\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    /*登录面板*/\r\n");
      out.write("    .content .panel {\r\n");
      out.write("        background-color: white;/*登录面板背景颜色为白色*/\r\n");
      out.write("        width: 302px;/*宽度为302px*/\r\n");
      out.write("        text-align: center;/*子内容居中*/\r\n");
      out.write("        margin: 0px auto;/*自身居中*/\r\n");
      out.write("        padding-top: 20px;/*顶部的内边距为20px*/\r\n");
      out.write("        padding-bottom: 20px;/*底部的内边距为20px*/\r\n");
      out.write("        border: 1px solid #ddd;/*边框颜色为灰色*/\r\n");
      out.write("        border-radius: 5px;/*边框边角有5px的弧度*/\r\n");
      out.write("\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    /*登录和密码组*/\r\n");
      out.write("    .content .panel .group {\r\n");
      out.write("        text-align: left;/*子内容居中*/\r\n");
      out.write("        width: 262px;/*宽度为262px*/\r\n");
      out.write("        margin: 0px auto 20px;/*自身居中，并距离底部有20px的间距*/\r\n");
      out.write("    }\r\n");
      out.write("    .content .panel .group label {\r\n");
      out.write("        line-height: 30px;/*高度为30px*/\r\n");
      out.write("        font-size: 18px;/*字体大小为18px*/\r\n");
      out.write("    }\r\n");
      out.write("    .content .panel .group input {\r\n");
      out.write("        display: block;/*设置为块，是为了让输入框独占一行*/\r\n");
      out.write("        width: 250px;/*宽度为250px*/\r\n");
      out.write("        height: 30px;/*高度为30px*/\r\n");
      out.write("        border: 1px solid #ddd;/*输入框的边框*/\r\n");
      out.write("        padding: 0px 0px 0px 10px;/*左边内边距为10px，显得美观*/\r\n");
      out.write("        font-size: 16px;/*字体大小*/\r\n");
      out.write("    }\r\n");
      out.write("    .content .panel .group input:focus{\r\n");
      out.write("\r\n");
      out.write("        border-left: 1px solid #CC865E;/*当输入框成为焦点时，左边框颜色编程褐色*/\r\n");
      out.write("    }\r\n");
      out.write("    .content .panel .login button {\r\n");
      out.write("        background-color: #CC865E;/*按钮的背景颜色*/\r\n");
      out.write("        width: 260px;/*按钮的宽度*/\r\n");
      out.write("    }\r\n");
      out.write("    .content .panel .login button:hover {\r\n");
      out.write("        background-color: white;/*按钮选中后背景颜色为白色*/\r\n");
      out.write("        color:  #CC865E;/*按钮选中后字体颜色为褐色*/\r\n");
      out.write("        border: 1px solid #CC865E;/*按钮选中后边框颜色为褐色*/\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    /*注册按钮*/\r\n");
      out.write("    .content .register {\r\n");
      out.write("        text-align: center;/*子内容居中*/\r\n");
      out.write("        margin-top: 20px;/*顶部的内边距为20px*/\r\n");
      out.write("    }\r\n");
      out.write("    .content .register button {\r\n");
      out.write("        background-color: #466BAF;/*按钮的背景颜色为蓝色*/\r\n");
      out.write("        width: 180px;/*按钮的宽度*/\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .content .register button:hover {\r\n");
      out.write("        background-color: white;/*按钮选中后背景颜色为白色*/\r\n");
      out.write("        color: #466BAF;/*按钮选中后字体颜色为蓝色*/\r\n");
      out.write("        border: 1px solid #466BAF;/*按钮选中后边框颜色为蓝色*/\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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
