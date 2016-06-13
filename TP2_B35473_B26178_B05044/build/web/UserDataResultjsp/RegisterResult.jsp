<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="controller.PrincipalController"%>
<%@page import="objectModel.UserModel" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Resultado Registro</title>
    </head>
    <body>

        <jsp:useBean id="userModel" scope="session" class="objectModel.UserModel" />

        <jsp:setProperty name="userModel" property="userName" param="userName" />
        <jsp:setProperty name="userModel" property="lastName" param="lastName" />
        <jsp:setProperty name="userModel" property="schedule" param="schedule" />
        <jsp:setProperty name="userModel" property="telephone" param="telephone" />
        <jsp:setProperty name="userModel" property="email" param="email" />
        <jsp:setProperty name="userModel" property="password" param="password" />

        <%
            PrincipalController controller = new PrincipalController();
            controller.createUserModel(userModel);

            session.setAttribute("user", userModel);
        %>

        <a href="index.jsp">Inicio</a>

    </body>
</html>

