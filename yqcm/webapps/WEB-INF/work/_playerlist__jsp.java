/*
 * JSP generated by Resin 2.1.17 (built Tue Jul 11 09:01:03 PDT 2006)
 */

import javax.servlet.*;
import javax.servlet.jsp.*;
import javax.servlet.http.*;
import com.jrj.yqcm.utils.OperateUtil;

public class _playerlist__jsp extends com.caucho.jsp.JavaPage{
  private boolean _caucho_isDead;
  
  public void
  _jspService(javax.servlet.http.HttpServletRequest request,
              javax.servlet.http.HttpServletResponse response)
    throws java.io.IOException, javax.servlet.ServletException
  {
    com.caucho.jsp.QPageContext pageContext = (com.caucho.jsp.QPageContext) com.caucho.jsp.QJspFactory.create().getPageContext(this, request, response, null, true, 8192, true);
    javax.servlet.jsp.JspWriter out = (javax.servlet.jsp.JspWriter) pageContext.getOut();
    javax.servlet.ServletConfig config = getServletConfig();
    javax.servlet.Servlet page = this;
    javax.servlet.http.HttpSession session = pageContext.getSession();
    javax.servlet.ServletContext application = pageContext.getServletContext();
    response.setContentType("text/html; charset=gbk");
    request.setCharacterEncoding("GBK");
    try {
      pageContext.write(_jsp_string0, 0, _jsp_string0.length);
      pageContext.write(_jsp_string1, 0, _jsp_string1.length);
      
String user = request.getParameter("user");
String content = OperateUtil.getPlayerList(user);
out.print(content);

      pageContext.write(_jsp_string2, 0, _jsp_string2.length);
    } catch (java.lang.Throwable _jsp_e) {
      pageContext.handlePageException(_jsp_e);
    } finally {
      JspFactory.getDefaultFactory().releasePageContext(pageContext);
    }
  }

  private com.caucho.java.LineMap _caucho_line_map;
  private java.util.ArrayList _caucho_depends = new java.util.ArrayList();

  public boolean _caucho_isModified()
  {
    if (_caucho_isDead)
      return true;
    if (com.caucho.util.CauchoSystem.getVersionId() != -2089842218)
      return true;
    for (int i = _caucho_depends.size() - 1; i >= 0; i--) {
      com.caucho.vfs.Depend depend;
      depend = (com.caucho.vfs.Depend) _caucho_depends.get(i);
      if (depend.isModified())
        return true;
    }
    return false;
  }

  public long _caucho_lastModified()
  {
    return 0;
  }

  public com.caucho.java.LineMap _caucho_getLineMap()
  {
    return _caucho_line_map;
  }

  public void destroy()
  {
      _caucho_isDead = true;
      super.destroy();
  }

  public void init(com.caucho.java.LineMap lineMap,
                   com.caucho.vfs.Path appDir)
    throws javax.servlet.ServletException
  {
    com.caucho.vfs.Path resinHome = com.caucho.util.CauchoSystem.getResinHome();
    com.caucho.vfs.MergePath mergePath = new com.caucho.vfs.MergePath();
    mergePath.addMergePath(appDir);
    mergePath.addMergePath(resinHome);
    mergePath.addClassPath(getClass().getClassLoader());
    _caucho_line_map = new com.caucho.java.LineMap("_playerlist__jsp.java", "/playerlist.jsp");
    _caucho_line_map.add(3, 1);
    _caucho_line_map.add(2, 27);
    _caucho_line_map.add(11, 29);
    com.caucho.vfs.Depend depend;
    depend = new com.caucho.vfs.Depend(appDir.lookup("playerlist.jsp"), 1324524282000L, 830L);
    _caucho_depends.add(depend);
  }

  protected void _caucho_clearDepends()
  {
    _caucho_depends.clear();
  }

  private static byte []_jsp_string2;
  private static byte []_jsp_string1;
  private static byte []_jsp_string0;
  static {
    try {
      _jsp_string2 = "\r\n</body>\r\n<script type=\"text/javascript\">\r\n$(\"#chk_all\").click(function(){\r\n	var flag = $(\"#chk_all\").attr(\"checked\");\r\n	$(\"input[name='ids']\").each(function () {\r\n		if (flag) {\r\n			$(this).attr(\"checked\", true);\r\n		} else {\r\n			$(this).attr(\"checked\", false);\r\n		}\r\n	}); \r\n	//$(\"input[name='ids']\").attr(\"checked\",$(this).attr(\"checked\"));\r\n});\r\n</script>\r\n</html>\r\n    ".getBytes("GBK");
      _jsp_string1 = "\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\" />\r\n<title>\u5217\u8868</title>\r\n<script type=\"text/javascript\" src=\"jquery-1.7.1.min.js\"></script>\r\n</head>\r\n<body>\r\n".getBytes("GBK");
      _jsp_string0 = "\r\n".getBytes("GBK");
    } catch (java.io.UnsupportedEncodingException e) {
      e.printStackTrace();
    }
  }
}