package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import objectModel.UserModel;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(4);
    _jspx_dependants.add("/General/header.jsp");
    _jspx_dependants.add("/General/informationMenu.jsp");
    _jspx_dependants.add("/General/userMenu.jsp");
    _jspx_dependants.add("/General/footer.jsp");
  }

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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/2.2.2/jquery.min.js\"></script>\n");
      out.write("        <script src=\"Menujs/JavaScriptMenu.js\" type=\"text/javascript\"></script>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"cssPrincipalViews/CssPrincipal.css\"></>\n");
      out.write("        <title>Sitio</title>\n");
      out.write("        ");
      out.write("<header id=\"header\">\n");
      out.write("    <a href=\"index.jsp\" >\n");
      out.write("        <img id =\"imageLogo\" src=\"img/logo.png\" width=\"80\" height=\"70\" alt=\"planta\"/>\n");
      out.write("    </a>\n");
      out.write("    <h1 id=\"tittle\"> Vivero la Semilla Web </h1>\n");
      out.write("</header>");
      out.write("    \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        ");
      out.write("<menu class=\"menu\" id=\"informationMenu\">\n");
      out.write("    <a id=\"start\">Inicio</a>\n");
      out.write("    <a id=\"information\">Quienes somos</a>\n");
      out.write("    <a id=\"contact\">Contactenos</a>\n");
      out.write("</menu>");
      out.write("\n");
      out.write("\n");
      out.write("        ");
      out.write("<menu class=\"menu\" id=\"userMenu\" >\n");
      out.write("    <a id=\"newAccount\"> crear cuenta</a>\n");
      out.write("    </br>\n");
      out.write("    </br>\n");
      out.write("    <a id=\"startSesion\"> iniciar sesion</a>\n");
      out.write("</menu>");
      out.write("\n");
      out.write("\n");
      out.write("        <input type=\"hidden\" name=\"type\" value=\"1\" />\n");
      out.write("\n");
      out.write("        <div id=\"start\">\n");
      out.write("            Inicio: enlace a la página inicial, la cual contiene el top 10 de los productos más vendidos \n");
      out.write("            (siendo el primero el más vendido). El formato de la página será el mismo que para los productos de una\n");
      out.write("            categoría mencionado más adelante.  ◦ \n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div id=\"information\"> \n");
      out.write("            Quiénes somos: enlace a una página que contiene una reseña de la empresa,\n");
      out.write("            su misión y visión (deben tener sentido, investigar cómo se realiza). ◦\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div id=\"contact\">\n");
      out.write("            Contáctenos: enlace a una página que\n");
      out.write("            contiene el correo electrónico, acceso a redes sociales y la opción de realizar una consulta que corresponde\n");
      out.write("            a un formulario con los campos de nombre completo, correo electrónico, área de texto para la redacción de la \n");
      out.write("            consulta y el botón de enviar. Al presionar el botón se muestra un mensaje indicando que será contactado próximamente\n");
      out.write("            y se redirecciona a la página de inicio\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div id=\"newAccount\">\n");
      out.write("            ");

                String email;
                UserModel sessionUser = (UserModel) session.getAttribute("user");
                if (sessionUser == null) {
                    email = "No hay login";
                } else {
                    email = sessionUser.getEmail();
                }
            
      out.write("\n");
      out.write("            <p> El email login es: ");
      out.print(email);
      out.write("</p>\n");
      out.write("\n");
      out.write("            <li><a id=\"registerUser\" href=\"UserDatajsp/RegisterUpdateUser.jsp?typeValue=1\">Registrarme</a></li> </br>\n");
      out.write("            <li><a id=\"deleteUser\" href=\"UserDatajsp/DeleteUser.jsp\">Borrar Usuario</a></li> </br>\n");
      out.write("            <li><a id=\"updateUser\" href=\"UserDatajsp/RegisterUpdateUser.jsp?typeValue=2\">Actualizar Usuario</a></li> </br>\n");
      out.write("            <br></br>\n");
      out.write("            <li><a id=\"updateUser\" href=\"Menusjsp/ContactUs.jsp\">Contactenos</a></li> </br>\n");
      out.write("\n");
      out.write("            <br></br>\n");
      out.write("            <li><a href=\"AdminData/AdminLogin.jsp\">Ingresar Administrador</a></li> </br>\n");
      out.write("\n");
      out.write("        </div> \n");
      out.write("\n");
      out.write("        <div id=\"startSesion\">\n");
      out.write("            <li><a id=\"loginUser\" href=\"UserDatajsp/UserLogin.jsp\">Ingresar Usuario</a></li> </br>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        ");
      out.write("<footer id=\"footer\">\n");
      out.write("    <h4 id=\"linksFooter\">\n");
      out.write("        <p> Copyright ©TRE Co. 2016 </p>\n");
      out.write("        <a href=\"https://www.facebook.com/\" style=\"text-decoration:none\">\n");
      out.write("            <img src=\"img/facebook.png\" width=\"40\" height=\"40\" alt=\"facebook-app\"/>\n");
      out.write("        </a>\n");
      out.write("        <span>&nbsp;&nbsp;</span>\n");
      out.write("        <a href=\"https://twitter.com/Ana2995Ana\" style=\"text-decoration:none\">\n");
      out.write("            <img src=\"img/twitter.png\" width=\"50\" height=\"40\" alt=\"twitter-app\"/>\n");
      out.write("        </a>\n");
      out.write("        <span>&nbsp;&nbsp;</span>\n");
      out.write("        <a href=\"https://plus.google.com/\" style=\"text-decoration:none\">\n");
      out.write("            <img src=\"img/google_plus.png\" width=\"40\" height=\"40\" alt=\"googleplus-app\"/>\n");
      out.write("        </a>\n");
      out.write("    </h4>\n");
      out.write("</footer>\n");
      out.write("\n");
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
