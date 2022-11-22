package DataBase;
import java.sql.*;
import java.util.logging.Level; 
import java.util.logging.Logger;

import javax.swing.JOptionPane;

import Products.Product; 

public class Conection {
    Statement sqlSt = null; // runs sql
    // String useSQL = new String("use prueba");
    String output;
    ResultSet result; // holds the output from sql
    String sql;
    private String dbURL = "jdbc:mysql://localhost:3306/marcianito";
    private Connection dbConnect;
    private String password = "password";
    private String user = "root";

    public Conection() throws Exception {
        System.out.println("Welcome to 'El Marcianito'");
        try{
         Class.forName("com.mysql.cj.jdbc.Driver");
         dbConnect = DriverManager.getConnection(dbURL, user, "Racing.2010");
         sqlSt = dbConnect.createStatement(); // allows SQL to be executed
         sqlSt.close();

        }catch(ClassNotFoundException ex){ //The jar doesn't load rigth
            Logger.getLogger(Conection.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Class not found, check the jar");
        }catch(SQLException ex){
            Logger.getLogger(Conection.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("SQL is badd!! " + ex.getMessage());
        }
    }
    
    private void executeConsult(String sql) throws SQLException {
        try{
            sqlSt = dbConnect.createStatement(); // allows SQL to be executed
            sqlSt.executeUpdate(sql);
        }catch(SQLException ex){
            Logger.getLogger(Conection.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Could not connect to db");
            JOptionPane.showMessageDialog(null, "Something is wrong with the execution the query.");
        }
    }
    
    private ResultSet executeGetter(String sql) throws SQLException{
        try{
            sqlSt = dbConnect.createStatement(); // allows SQL to be executed
            ResultSet res = sqlSt.executeQuery(sql);
            return res;
        }catch(SQLException ex){
            Logger.getLogger(Conection.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Could not connect to db");
            System.out.println("aca hay algo que no me andaaaaaa");
            JOptionPane.showMessageDialog(null, "Something is wrong with the execution the query.");
        }
        return null;
    }

    // Retorna todos los datos de una tabla pasada como parámetro
    public ResultSet getDataTable(String table){
        sql = "Select * from " + table;// + " order by id;";
        try {
            result = executeGetter(sql);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Something is wrong with the conection to dataBase.");
            e.printStackTrace();
            return null;
        }
        return result;
    }

    /* Retorna los datos de una tabla mayor o menor a una fecha 
     * condition: condición de comparación de la fecha (<, >, <= , >=, =)
     * date: fecha a evaluar 
    */
    public ResultSet getDataTableExpired(String condition, String date) {
        sql = "SELECT * FROM products WHERE expire " + condition + " CAST('" + date + "' AS datetime)";
        try {
            result = executeGetter(sql);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Something is wrong with the conection to dataBase.");
            e.printStackTrace();
        }
        return result;
    }

    // Retorna los datos de una tabla cuyo stock sea mayor a 0
    public ResultSet getStock(String table){
        sql = "SELECT * FROM " + table + " WHERE stock > 0 ORDER BY id;";
        try {
            result = executeGetter(sql);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Something is wrong with the conection to dataBase.");
            e.printStackTrace();
        }
        return result;
    }

    // Retorna todos los datos de una tabla de un producto con un determinado id
    public ResultSet getProd(String table, int id) {
        sql = "SELECT * FROM " + table + " WHERE id = " + id + ";";
        try {
            result = executeGetter(sql);
            return result;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return null;
    }

    // Elimina un row de una tabla de db con un id
    public void deleteDB(String table, int id){
        sql = "Delete from " + table + " where id = " + id;
        try {
            executeConsult(sql);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Something is wrong with the conection to dataBase.");
            e.printStackTrace();
        }
    }
    
    // Agrega un nuevo producto a la db
    public void addDBProd(Product prod){
        sql = "insert into products ( description, price, expire, stock, discount, sales) values ('" + 
        prod.getDescription() + "', '" + Float.toString(prod.getPrice()) + "', '" + prod.getExpiration() + "', '" + 
        Integer.toString(prod.getStock()) + "', '" + Integer.toString(prod.getDiscount())+ "', '" + Integer.toString(prod.getSales()) + "');";
        try {
            executeConsult(sql);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            JOptionPane.showMessageDialog(null, "Something is wrong with the conection to dataBase.");
            e.printStackTrace();
        }
    }
     
    // Modifica todos los datos de un producto con un determinado id
    public void modifyDBProd(Product prod, int id){
        sql = "update products set Description = '" + prod.getDescription() + "', Expire = '" + prod.getExpiration() + "', Stock = '" + prod.getStock() + "', Price = '" + prod.getPrice() +
            "', Discount = '" + prod.getDiscount()+ "' where id = " + id + ";";
        try {
            executeConsult(sql);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Something is wrong with the conection to dataBase.");
            e.printStackTrace();
        }
    }

    // Modifica todos los datos de un producto con un determinado id
    public void modifyDBCustomer(String name, String phone, String address, int id){
        sql = "UPDATE customers SET customer_name = '" + name + "', phone_number = '" + phone + "', direccion = '" + address + "' WHERE id = " + id + ";";
        try {
            executeConsult(sql);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Something is wrong with the conection to dataBase.");
            e.printStackTrace();
        }
    }

    /* Actualiza un dato en particular
     * table: tabla del dato a modificar
     * column: columna a modificar
     * newValue: valor actualizado
     * id: id del producto a modificar
     */
    public void updateDB(String table, String column, String newValue, int id){
        sql = "UPDATE " + table + " SET " + column + " = " + newValue + " WHERE id = " + id + ";";
        try {
            executeConsult(sql);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Something is wrong with the conection to dataBase.");
            e.printStackTrace();
        }
    }

    /* Adiciono un valor numérico
     * table: tabla del dato a modificar
     * column: columna a modificar
     * newValue: valor que se adiciona
     * id: id del producto a modificar
     */
    public void updateDBStock(String table, String column, int newValue, int id){
        sql = "UPDATE " + table + " SET " + column + " = " + column + " + " + newValue + " WHERE id = " + id + ";";
        try {
            executeConsult(sql);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Something is wrong with the conection to dataBase.");
            e.printStackTrace();
        }
    }
  
    /* Retorna los datos de la tabla que cumplan con una búsqueda
     * table: Tabla en la que se busca
     * column: Columna en la que se busca
     * value: Valor que se busca
     */
    public ResultSet search(String table, String column, String value) {
        sql = "SELECT * FROM " + table + " WHERE " + column + " LIKE '%" + value + "%' ORDER BY " + column + ";";
        try {
            this.result = executeGetter(sql);
            return this.result;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Something is wrong with the conection to dataBase.");
            e.printStackTrace();
        }
        return null;
    }

    /* Retorna todos los datos de una tabla ordenados
     * table: tabla que se desea ordenar
     * column: Columna como eje de ordenamiento
     * order: Tipo de ordenamiento (ASC, DESC)
     */
    public ResultSet getDataTableOrderBy(String table, String column, String order) {
        sql = "Select * from " + table + " order by " + column + " " + order + ";";
        try {
            result = executeGetter(sql);
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Something is wrong with the conection to dataBase.");
            e.printStackTrace();
        }
        return result;
    }

    // Agrego un nuevo cliente a la base de datos
    public void addClient(String name, String phone, String address) {
        sql = "insert into customers (customer_name, phone_number, direccion) values ('" + name + "', '" + phone + "', '" + address + "');";
        try {
            executeConsult(sql);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            JOptionPane.showMessageDialog(null, "Something is wrong with the conection to dataBase.");
            e.printStackTrace();
        }
    }

    public ResultSet getFinalPrice() {
		sql = "select SUM(c.subtotal) as total from (select ((price*amount)-(price*amount)*discount/100) as subtotal from cart ) as c;";
		try {
            this.result = executeGetter(sql);
            return this.result;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Something is wrong with the conection to dataBase.");
            e.printStackTrace();
        }
        return null;
	}

    public void addSale(int id, String name, String phone, double finalPrice) {
        sql = "INSERT INTO sales (id_customer, customer_name, phone_number, final_price) VALUES ('" + 
        id + "', '" + name + "', '" + phone + "', '" + finalPrice + "');";
        try {
            executeConsult(sql);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            JOptionPane.showMessageDialog(null, "Something is wrong with the conection to dataBase.");
            e.printStackTrace();
        }

    }

    public void showData() {
        try {
            result = executeGetter("select * from products");
            while(result.next()) {
                System.out.println(result.getString(1) + " - " + result.getString(2) + " - " + result.getString(3) + " - " + result.getString(4) + " - " + result.getString(5) + " - " + result.getString(6));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Something is wrong with the conection to dataBase.");
            e.printStackTrace();
        }

        
    }

    public void truncateTable(String nameTable){
        try{
            sql = "truncate " + nameTable;
            executeConsult(sql);
        } catch(Exception e){
            System.err.print(e.getMessage());
        }
    }

    public void addProductCart(Product productito, int amount){
        sql = "insert into cart ( id, description, price, expire, amount, discount) values (" + productito.getId() + ",'" + 
        productito.getDescription() + "', '" + Float.toString(productito.getPrice()) + "', '" + productito.getExpiration() + "', '" + 
        amount + "', '" + Integer.toString(productito.getDiscount())+ "') ON DUPLICATE KEY UPDATE amount = amount + " + amount + ";";
        try {
            executeConsult(sql);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            JOptionPane.showMessageDialog(null, "Something is wrong with the conection to dataBase.");
            e.printStackTrace();
        }
    }


    public float totalCart(){
        float total;

        sql = "select SUM(c.subtotal) as total from (select ((price*amount)-(price*amount)*discount/100) as subtotal from cart) as c";
        try{
            result = executeGetter(sql);
            total = result.getFloat("total");
            return total;
        }catch(Exception e){
            System.err.println(e.getMessage());
            return -1;
        }
    }

    
}
