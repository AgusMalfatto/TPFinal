package Sells;
import Products.*;
import DataBase.*;

public class Cart {

    Conection con;
    private int idDelete;
    private int amountDelete;

	public Cart() throws Exception {
		con = new Conection(); 
	}

    public void addProduct(Product productito, int amount){
        con.addProductCart(productito, amount);
    }

    public void cleanCart(){
        con.truncateTable("cart");
    }

    public void deleteProduct(int id, int amount){
        con.deleteProductCart(id,amount);
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

    public int getAmountDelete() {
        return amountDelete;
    }

    public void setAmountDelete(int amountDelete) {
        this.amountDelete = amountDelete;
    }

    

}
