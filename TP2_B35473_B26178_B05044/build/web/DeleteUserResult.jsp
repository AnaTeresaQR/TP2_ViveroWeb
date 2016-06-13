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

        <jsp:setProperty name="userModel" property="email" param="email" />
        <jsp:setProperty name="userModel" property="password" param="password" />

        <%
            PrincipalController controller = new PrincipalController();

            String emailSession = (String) session.getAttribute("email");
            boolean result = false;
            if (userModel.getEmail().equals(emailSession)) {
                result = controller.deleteUser(userModel);
            }

            String resultDelete = "";
            if (result) {
                resultDelete += " EXITOSA ";
                session.removeAttribute("email");
                session.invalidate();
                //F response.sendRedirect("index.jsp");
            } else {
                resultDelete += " FALLIDA, lo sentimos por favor intente de nuevo";

            }
        %>

        <p>
            El resultado de borrar su cuenta fue <%=resultDelete%>
        </p>
        <a href="index.jsp">Inicio</a>
    </body>
</html>
