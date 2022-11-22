package Sells;
import Products.*;
import DataBase.*;

public class Cart {

    Conection con;
    private int idDelete;

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

    public int getIdDelete() {
        return idDelete;
    }

    public void setIdDelete(int idDelete) {
        this.idDelete = idDelete;
    }

    

}
