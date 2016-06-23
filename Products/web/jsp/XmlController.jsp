<%@page import="java.util.List"%>
<%@page import="xmlProducts.Product"%>
<%@page import="xmlProducts.ProductsXmlManager"%>
<%!
    ProductsXmlManager mx = new ProductsXmlManager(getServletContext().getRealPath("products.xml"));

    public List<Product> getProducts(String category) {
       return  mx.getProductsByCategory(category);
    }
%>