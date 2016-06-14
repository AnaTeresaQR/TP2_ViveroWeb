package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import objectModel.UserModel;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Index</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        ");

            String email;
            UserModel sessionUser = (UserModel) session.getAttribute("user");
            if (sessionUser == null) {
                email = "No hay login";
            } else {
                email = sessionUser.getEmail();
            }
        
      out.write("\n");
      out.write("        <p> El email login es: ");
      out.print(email);
      out.write("</p>\n");
      out.write("\n");
      out.write("    <li><a id=\"registerUser\" href=\"UserDatajsp/RegisterUpdateUser.jsp?typeValue=1\">Registrarme</a></li> </br>\n");
      out.write("    <li><a id=\"loginUser\" href=\"UserDatajsp/UserLogin.jsp\">Ingresar Usuario</a></li> </br>\n");
      out.write("    <li><a id=\"deleteUser\" href=\"UserDatajsp/DeleteUser.jsp\">Borrar Usuario</a></li> </br>\n");
      out.write("    <li><a id=\"updateUser\" href=\"UserDatajsp/RegisterUpdateUser.jsp?typeValue=2\">Actualizar Usuario</a></li> </br>\n");
      out.write("\n");
      out.write("    <br></br>\n");
      out.write("    <li><a href=\"AdminData/AdminLogin.jsp\">Ingresar Administrador</a></li> </br>\n");
      out.write("\n");
      out.write("</body>\n");
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
}
