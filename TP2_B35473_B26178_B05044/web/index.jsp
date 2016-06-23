<%@page import="objectModel.UserModel" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.2/jquery.min.js"></script>
        <script src="Menujs/JavaScriptMenu.js" type="text/javascript"></script>
        <link rel="stylesheet" type="text/css" href="cssPrincipalViews/CssPrincipal.css"></>
        <title>Sitio</title>
        <%@include file="General/header.jsp" %>    
    </head>
    <body>

        <%@include file="General/informationMenu.jsp"%>

        <%@include file="General/userMenu.jsp"%>

        <%@include file="ContentTop10.jsp"%>

        <input type="hidden" name="type" value="1">

        <div id="newAccount">
            <%                String msj = "";
                String email;
                session.setAttribute("msj", msj);
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
            <li><a id="updateUser" href="Menusjsp/ContactUs.jsp">Contactenos</a></li> </br>

            <br></br>
            <li><a href="AdminData/AdminLogin.jsp">Ingresar Administrador</a></li> </br>

        </div> 

        <div id="startSesion">
            <li><a id="loginUser" href="UserDatajsp/UserLogin.jsp">Ingresar Usuario</a></li> </br>

        </div>

        <%@include file="General/footer.jsp"%>
    </body>
</html>
