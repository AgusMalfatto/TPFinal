package Sells;

import java.util.ArrayList;

import Products.*;

public class Sell {
    ArrayList<Product> products;
    ArrayList<Integer> amount;
    Calculation calculate;
    private String name;
    private String phone;
    private float finalPrice;

    public Sell() {
        products = new ArrayList<>();
        amount = new ArrayList<>();
        calculate = new Calculation();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void add(Product prod, int amount) {
        products.add(prod);
        this.amount.add(amount);
    }

    public void remove(int index) {
        products.remove(index);
        amount.remove(index);
    }

    public void finalPrice() {
        this.finalPrice = calculate.finalPrice(products, amount);
    }

    public void addToDB() {
        // add the sell to the database in the sells table
    }
}
