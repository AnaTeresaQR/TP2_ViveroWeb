<%@page import="xmlProducts.Product"%>
<%@page import="java.util.List"%>
<%@page import="xmlProducts.ProductsXmlManager"%>
<%@page import="xmlProducts.ProductsListManager"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista de productos</title>
    </head>
    <body>

        <%
            ProductsXmlManager mx = new ProductsXmlManager(getServletContext().getRealPath("products.xml"));
            List<Product> productsList = mx.getProductsByCategory("Servicio de jardineria");
            for (int i = 0; i < productsList.size(); i++) {
                Product product = productsList.get(i);
        %>

        <p id="name"> Nombre del producto= <%=product.getName()%> </p>        
        <p id="shortDescription"> Descripcion= <%=product.getShortDescription()%> </p>        
        <p id="price"> Precio= <%=product.getPrice()%> </p>
        <img src="<%= product.getUrlPicture1()%>" width="350" height="300" alt="top"/>

        <%
            }
        %>

    </body>
</html>

