/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xmlProducts;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author rosan
 */
public class ProductsListManager {

//    ProductsXmlManager productsXmlManager = new ProductsXmlManager();
//
//    public List<Product> getProductsList() {
//        return productsXmlManager.getAllProducts();
//    }

    public String listPlants(List<Product> list) {
        String plant = "";
        Iterator<Product> iterator = list.iterator();
        while (iterator.hasNext()) {
            plant += iterator.next() + "\n";
        }
        return plant;
    }

    public List<Product> getTopProducts(String route) {
        ProductsXmlManager productsXmlManager = new ProductsXmlManager(route);
        List<Product> topProducts = productsXmlManager.getAllProducts();
        Collections.sort(topProducts, new CompareProducts());
        return topProducts;
        
    }
}
