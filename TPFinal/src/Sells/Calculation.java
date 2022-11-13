package Sells;

import java.util.ArrayList;

import Products.Product;

public class Calculation {
    public float finalPrice(ArrayList<Product> prod, ArrayList<Integer> amount) {
        float finalPrice = 0;
        for(int i = 0; i < prod.size(); i++) {
            finalPrice += (prod.get(i).getPrice() - (prod.get(i).getPrice() * prod.get(i).getDiscount() / 100)) * amount.get(i);
        }
        return finalPrice;        
    }
}