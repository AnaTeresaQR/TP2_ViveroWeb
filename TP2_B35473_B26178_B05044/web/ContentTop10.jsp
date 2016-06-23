<%@page import="xmlProducts.Product"%>
<%@page import="java.util.List"%>
<%@page import="xmlProducts.ProductsXmlManager"%>
<%@page import="xmlProducts.ProductsListManager"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div id="top10">
    <%
        ProductsListManager ml = new ProductsListManager();
        List<Product> plantsList = ml.getTopProducts(getServletContext().getRealPath("products.xml"));
        for (int i = 0; i < 10; i++) {
            Product product = plantsList.get(i);
    %>

    <p id="name"> Nombre del producto= <%=product.getName()%> </p>        
    <p id="shortDescription"> Descripcion= <%=product.getShortDescription()%> </p>        
    <p id="price"> Precio= <%=product.getPrice()%> </p>
    <img src="<%= product.getUrlPicture1()%>" width="250" height="180" alt="top"/>

    <%
        }
    %> 
</div>
