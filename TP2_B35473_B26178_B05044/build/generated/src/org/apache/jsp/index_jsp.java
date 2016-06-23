package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import objectModel.UserModel;
import xmlProducts.Product;
import java.util.List;
import xmlProducts.ProductsXmlManager;
import xmlProducts.ProductsListManager;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(5);
    _jspx_dependants.add("/General/header.jsp");
    _jspx_dependants.add("/General/informationMenu.jsp");
    _jspx_dependants.add("/General/userMenu.jsp");
    _jspx_dependants.add("/ContentTop10.jsp");
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
      out.write("    <link href=\"../cssPrincipalViews/CssPrincipal.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    <link href=\"../cssPrincipalViews/FormCss.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
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
      out.write("    <a  href=\"../index.jsp\">Inicio</a>\n");
      out.write("    <a  href=\"../Menusjsp/infoMenu.jsp\">Quienes somos</a>\n");
      out.write("    <a  href=\"../Menusjsp/ContactUs.jsp\">Contáctenos</a>\n");
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
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div id=\"top10\">\n");
      out.write("    ");

        ProductsListManager ml = new ProductsListManager();
        List<Product> plantsList = ml.getTopProducts(getServletContext().getRealPath("products.xml"));
        for (int i = 0; i < 10; i++) {
            Product product = plantsList.get(i);
    
      out.write("\n");
      out.write("\n");
      out.write("    <p id=\"name\"> Nombre del producto= ");
      out.print(product.getName());
      out.write(" </p>        \n");
      out.write("    <p id=\"shortDescription\"> Descripcion= ");
      out.print(product.getShortDescription());
      out.write(" </p>        \n");
      out.write("    <p id=\"price\"> Precio= ");
      out.print(product.getPrice());
      out.write(" </p>\n");
      out.write("    <img src=\"");
      out.print( product.getUrlPicture1());
      out.write("\" width=\"250\" height=\"180\" alt=\"top\"/>\n");
      out.write("\n");
      out.write("    ");

        }
    
      out.write(" \n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <input type=\"hidden\" name=\"type\" value=\"1\">\n");
      out.write("\n");
      out.write("        <div id=\"newAccount\">\n");
      out.write("            ");
                String msj = "";
                String email;
                session.setAttribute("msj", msj);
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
