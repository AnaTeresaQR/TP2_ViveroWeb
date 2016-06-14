<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.2/jquery.min.js"></script>
        <script type="text/javascript" src="Registerjs/javaScriptJQueryMethod.js"></script>
        <script type="text/javascript" src="Registerjs/ValidateObjAttributes.js"></script>
        <title>Registro de Usuario</title>
    </head>
    <body>
        <%--  <% 
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
          %> --%>

        <%@include file="OptionUpdateRegister.jsp" %>

        <div id = "showRegisterForm">

            <a onclick="ocultarDiv('#showRegisterForm')">Cerrar</a>  

            <h1>Formulario de Registro</h1>

            <form id="registerUserForm" onsubmit=" return  confirmAction('#registerUserForm')" method="post" action="<%=urlAction%>" required>          

                <label>Nombre:&nbsp;&nbsp;</label> 
                <input type="text" id ="userName" name="userName" placeholder="Escriba su nombre" required oninput="validateName(this)"/>
                <br><br/>
                <label>Apellidos:</label>
                <input type="text" id="lastName" name="lastName" placeholder="Escriba sus apellidos" required oninput="validateLastName(this)"/>
                <br><br/>
                <label>Cédula:</label>
                <input type="text" id="schedule" name="schedule" placeholder="Siga el formato #0###0###" required oninput="validateShedule(this)"/>
                <br><br/>
                <label>Teléfono:</label>
                <input type="text" id="telephone"  name="telephone" placeholder="Máximo de 8 digitos" required oninput="validateTelephone(this)"/>
                <br><br/>
                <label>Email:</label>
                <input type="text" id="email"  name="email" placeholder="hola@ejemplo.com" required oninput="validateEmail(this)"/>
                <br><br/>
                <label>Email Password:</label>
                <input type="password" id="password" name="password"  placeholder="Escriba su contraseña" required oninput="validatePassword(this)"/>
                <br><br/>
                <input type="submit" value="<%=valueSubmit%>"/>
                <input type="reset" value="Vaciar Campos"/>

            </form>

        </div>
    </body>
</html>
