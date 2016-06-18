<%-- 
    Document   : ContactUs
    Created on : 17/06/2016, 03:38:13 PM
    Author     : Ana Teresa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
        <link href="../cssPrincipalViews/CssPrincipal.css" rel="stylesheet" type="text/css"/>
        <link href="../cssPrincipalViews/FormCss.css" rel="stylesheet" type="text/css"/>
        <title>Contactenos</title>
    </head>
    <body>
        <div id = "showConsultForm" class="formClass">

            <a onclick="ocultarDiv('#showConsultForm')">Cerrar</a>  

            <h1>Formulario de Consultas</h1>

            <form id="saveContultForm" method="post" action="ContactUsController.jsp" required>          

                <label>Nombre Completo:</label> 
                <input type="text" id ="completeName" name="completeName" placeholder="Escriba su nombre completo" required/>
                <label>Email:</label>
                <input type="text" id="email"  name="email" placeholder="hola@ejemplo.com" required/>
                <label>Message:</label>
                <textarea id ="message" name="message" placeholder="Escriba su consulta"  rows="10" cols="40" required></textarea>
                <br><br/>
                <input type="submit" value="Enviar"/>
                <input type="reset" value="Vaciar Campos"/>

            </form>

        </div>
    </body>
</html>
