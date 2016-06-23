/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package xmlProducts;

import java.util.Comparator;

/**
 *
 * @author Wendy
 */
public class CompareProducts implements Comparator<Product> {

    @Override
    public int compare(Product p1, Product p2) {
        if (p1.getProductSold() < p2.getProductSold()) {
            return 1;
        } else if (p1.getProductSold() > p2.getProductSold()) {
            return -1;
        } else { 
            return 0;
        }
    }
}
