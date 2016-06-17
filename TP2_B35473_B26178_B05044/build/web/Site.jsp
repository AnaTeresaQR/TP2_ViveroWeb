<%@page import="objectModel.UserModel" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.2/jquery.min.js"></script>
        <script type="text/javascript" src="JavaScriptMenu.js"></script>
        <link rel="stylesheet" type="text/css" href="cssPrincipalViews/CssPrincipal.css"></>
        <title>Sitio</title>
        <%@include file="General/header.jsp" %>    
    </head>
    <body>

        <%@include file="informationMenu.jsp" %>
        <%@include file="userMenu.jsp" %>

        <input type="hidden" name="type" value="1" />



        <div id="start">
            Inicio: enlace a la página inicial, la cual contiene el top 10 de los productos más vendidos 
            (siendo el primero el más vendido). El formato de la página será el mismo que para los productos de una
            categoría mencionado más adelante.  ◦ 

        </div>

        <div id="information"> 
            Quiénes somos: enlace a una página que contiene una reseña de la empresa,
            su misión y visión (deben tener sentido, investigar cómo se realiza). ◦
        </div>

        <div id="contact">
            Contáctenos: enlace a una página que
            contiene el correo electrónico, acceso a redes sociales y la opción de realizar una consulta que corresponde
            a un formulario con los campos de nombre completo, correo electrónico, área de texto para la redacción de la 
            consulta y el botón de enviar. Al presionar el botón se muestra un mensaje indicando que será contactado próximamente
            y se redirecciona a la página de inicio

        </div>

        <div id="newAccount">
            <%
                String email;
                UserModel sessionUser = (UserModel) session.getAttribute("user");
                if (sessionUser == null) {
                    email = "No hay login";
                } else {
                    email = sessionUser.getEmail();
                }
            %>
            <p> El email login es: <%=email%></p>

            <li><a id="registerUser" href="UserDatajsp/RegisterUpdateUser.jsp?typeValue=1">Registrarme</a></li> </br>
            <li><a id="deleteUser" href="UserDatajsp/DeleteUser.jsp">Borrar Usuario</a></li> </br>
            <li><a id="updateUser" href="UserDatajsp/RegisterUpdateUser.jsp?typeValue=2">Actualizar Usuario</a></li> </br>

            <br></br>
            <li><a href="AdminData/AdminLogin.jsp">Ingresar Administrador</a></li> </br>

        </div> 

        <div id="startSesion">
            <li><a id="loginUser" href="UserDatajsp/UserLogin.jsp">Ingresar Usuario</a></li> </br>

        </div>

        <%@include file="General/footer.jsp"%>
    </body>
</html>
