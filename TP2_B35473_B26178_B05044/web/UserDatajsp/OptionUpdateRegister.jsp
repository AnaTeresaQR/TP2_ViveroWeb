<%
    String strTypeValue = request.getParameter("typeValue");
    int typeValue = Integer.parseInt(strTypeValue);
    String urlAction = "";
    String valueSubmit = "";
    switch (typeValue) {
        case 1:
            urlAction = "RegisterResult.jsp";
            valueSubmit = "Registrar";
            break;
        case 2:
            urlAction = "UpdateUserResult.jsp";
            valueSubmit = "Actualizar";
            break;
        default:
    }
%>
