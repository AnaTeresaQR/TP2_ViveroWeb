<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="controller.PrincipalController"%>
<%@page import="objectModel.UserModel" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Resultado de borrar un usuario</title>
    </head>
    <body>

        <jsp:useBean id="userModel" scope="session" class="objectModel.UserModel" />

        <%UserModel userSession = (UserModel) session.getAttribute("user");%>

        <jsp:setProperty name="userModel" property="email" param="email" />
        <jsp:setProperty name="userModel" property="password" param="password" />

        <%
            PrincipalController controller = new PrincipalController();
            boolean result = false;
            if (userModel.getEmail().equals(userSession.getEmail())) {
                result = controller.deleteUser(userModel);
            } else {
                result = false;
            }

            String resultDelete = "";
            if (result) {
                resultDelete += " EXITOSA ";
                session.removeAttribute("user");
                session.invalidate();
                //response.sendRedirect("index.jsp");
            } else {
                resultDelete += " FALLIDA, lo sentimos por favor intente de nuevo";
                session.setAttribute("user", userModel);
            }
        %>

        <p>
            El resultado de borrar su cuenta fue <%=resultDelete%>
        </p>
        <a href="../index.jsp">Inicio</a>
    </body>
</html>
