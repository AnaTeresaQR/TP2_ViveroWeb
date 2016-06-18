package org.apache.jsp.Menusjsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ContactUs_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id = \"showConsultForm\">\n");
      out.write("\n");
      out.write("            <a onclick=\"ocultarDiv('#showConsultForm')\">Cerrar</a>  \n");
      out.write("\n");
      out.write("            <h1>Formulario de Registro</h1>\n");
      out.write("\n");
      out.write("            <form id=\"saveContultForm\" onsubmit=\" return  confirmAction('#saveContultForm')\" method=\"post\" action=\"\" required>          \n");
      out.write("\n");
      out.write("                <label>Nombre Completo:&nbsp;&nbsp;</label> \n");
      out.write("                <input type=\"text\" id =\"completeName\" name=\"completeName\" placeholder=\"Escriba su nombre completo\" required/>\n");
      out.write("                <br><br/>\n");
      out.write("                <label>Email:</label>\n");
      out.write("                <input type=\"text\" id=\"email\"  name=\"email\" placeholder=\"hola@ejemplo.com\" required/>\n");
      out.write("                <br><br/>\n");
      out.write("                <label>Message:</label>\n");
      out.write("                <br><br/>\n");
      out.write("                <textarea id =\"message\" name=\"message\" placeholder=\"Escriba su consulta\"  rows=\"10\" cols=\"70\" required></textarea>\n");
      out.write("                <br><br/>\n");
      out.write("                <input type=\"submit\" value=\"Enviar\"/>\n");
      out.write("                <input type=\"reset\" value=\"Vaciar Campos\"/>\n");
      out.write("\n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
