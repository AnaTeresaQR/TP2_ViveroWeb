<%-- 
    Document   : Usuario
    Created on : 10/06/2016, 03:11:25 PM
    Author     : Edgardo Quirós
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.2/jquery.min.js"></script>
        <script type="text/javascript" src="JavaScriptMenu.js"></script>
        <link rel="stylesheet" type="text/css" href="GlobalCSS.css">
        

        <title>JSP Page</title>
        <%@include file="header.jsp" %>    
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
            Crear una nueva cuenta: enlace a
            una página que contiene un formulario con nombres
            , apellidos, cédula, teléfono, correo electrónico y contraseña.
            Al crear el usuario correctamente se redirecciona
            a la página de inicio de sesión. ◦  

        </div> 

        <div id="startSesion">
            Iniciar sesión: enlace a una página para ingresar el correo y la contraseña. 
            Al ser autenticado se mostrará en lugar de este menú, un menú “Mi cuenta”
            con las opciones de modificar los datos personales, ver compras anteriores, 
            eliminar su cuenta y cerrar sesión. Para la modificación de los d
            atos aparecerá el mismo formulario que para la inscripción con 
            los datos del usuario y se mostrará un mensaje de éxito o fallido al
            realizar la operación. 

        </div>



    </body>
    <%@include file="footer.jsp"%>

</html>


