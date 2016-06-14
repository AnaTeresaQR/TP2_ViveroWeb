<%@page import="objectModel.UserModel" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Index</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>

    <body>

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
    <li><a id="loginUser" href="UserDatajsp/UserLogin.jsp">Ingresar Usuario</a></li> </br>
    <li><a id="deleteUser" href="UserDatajsp/DeleteUser.jsp">Borrar Usuario</a></li> </br>
    <li><a id="updateUser" href="UserDatajsp/RegisterUpdateUser.jsp?typeValue=2">Actualizar Usuario</a></li> </br>

    <br></br>
    <li><a href="AdminData/AdminLogin.jsp">Ingresar Administrador</a></li> </br>

</body>
</html>