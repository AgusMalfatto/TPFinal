package Sells;
import Products.*;
import java.util.ArrayList;

public class Cart {
    private ArrayList<Product> products;
    
    public void addProduct(Product productito){
        products.add(productito);
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void deleteProduct(){}
}
