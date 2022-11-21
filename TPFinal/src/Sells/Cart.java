package Sells;
import Products.*;
import java.util.ArrayList;
import DataBase.*;

public class Cart {

    Conection con;

	public Cart() throws Exception {
		con = new Conection(); 
	}

    public void addProduct(Product productito, int amount){
        con.addProductCart(productito, amount);
    }

    public void cleanCart(){
        con.truncateTable("cart");
    }

    public void deleteProduct(int id){
        con.deleteDB("cart", id);
    }
    
    public float calculateTotal(){
        return con.totalCart();
    }

}
