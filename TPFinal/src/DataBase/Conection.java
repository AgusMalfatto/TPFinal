package DataBase;
import java.sql.*;
import java.util.logging.Level; 
import java.util.logging.Logger;

import javax.swing.JOptionPane;

import Products.Product; 

public class Conection {
    Statement sqlSt; // runs sql
    // String useSQL = new String("use prueba");
    String output;
    ResultSet result; // holds the output from sql
    String sql;
    private String dbURL = "jdbc:mysql://localhost:3306/marcianito";
    private Connection dbConnect;
    

    public Conection() throws Exception {
        System.out.println("Welcome to 'El Marcianito'");
        try{
         Class.forName("com.mysql.cj.jdbc.Driver");
         dbConnect = DriverManager.getConnection(dbURL, "root", "Racing.2010");
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
            result = sqlSt.executeQuery(sql);
            return result;
        }catch(SQLException ex){
            Logger.getLogger(Conection.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Could not connect to db");
            JOptionPane.showMessageDialog(null, "Something is wrong with the execution the query.");
        }
        return null;
    }

    public ResultSet getDataTable(String table){
        sql = "Select * from " + table + " order by id;";
        try {
            result = executeGetter(sql);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Something is wrong with the conection to dataBase.");
            e.printStackTrace();
        }
        return result;
    }

    public ResultSet getDataTableExpired(String date) {
        sql = "SELECT * FROM products WHERE expire <= CAST('" + date + "' AS datetime)";
        try {
            result = executeGetter(sql);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Something is wrong with the conection to dataBase.");
            e.printStackTrace();
        }
        return result;
    }

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

    public void delelteDB(String table, int id){
        sql = "Delete from " + table + " where id = " + id;
        try {
            executeConsult(sql);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Something is wrong with the conection to dataBase.");
            e.printStackTrace();
        }
    }
    
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

    public void updateDB(String table, String column, String newValue, int id){
        sql = "UPDATE " + table + " SET " + column + " = " + newValue + " WHERE id = " + id + ";";
        try {
            executeConsult(sql);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Something is wrong with the conection to dataBase.");
            e.printStackTrace();
        }
    }

    public void updateDBStock(String table, String column, int newValue, int id){
        sql = "UPDATE " + table + " SET " + column + " = " + column + " + " + newValue + " WHERE id = " + id + ";";
        try {
            executeConsult(sql);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Something is wrong with the conection to dataBase.");
            e.printStackTrace();
        }
    }
        
    public ResultSet searchProd(String table, String title) {
        sql = "Select * from " + table + " where Title LIKE '%" + title + "%' order by Title;";
        try {
            result = executeGetter(sql);
            return result;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Something is wrong with the conection to dataBase.");
            e.printStackTrace();
        }
        return null;
    }

    public ResultSet getDataTableOrderBy(String table, String column) {
        sql = "Select * from " + table + " order by " + column + ";";
        try {
            result = executeGetter(sql);
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Something is wrong with the conection to dataBase.");
            e.printStackTrace();
        }
        return result;
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

    
}
