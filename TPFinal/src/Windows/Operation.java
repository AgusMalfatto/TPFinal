package Windows;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import DataBase.Conection;
import Products.Product;

public class Operation {

	Conection con;

	public Operation() throws Exception {
		con = new Conection(); 
	}

	public void insertDataTable(ResultSet data, java.sql.ResultSetMetaData resul, DefaultTableModel model) {
		Object[] columns;
		Object[] rows;
		try {
			columns = new Object[resul.getColumnCount()];
			rows = new Object[resul.getColumnCount()];
			for(int i = 0; i < columns.length; i++) {
				columns[i] = resul.getColumnName(i + 1);
			}
		
			if(data != null){
				try {
					while(data.next()){
	
						for(int i = 0; i < columns.length; i++) {
							rows[i] = data.getString(columns[i].toString());
						}
						model.addRow(rows);
					}				
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}	
	}

	public void setTable(JTable table, DefaultTableModel model, String db) throws SQLException {
		try {
			ResultSet data = con.getDataTable(db);
			java.sql.ResultSetMetaData resul = data.getMetaData();
			insertDataTable(data, resul, model);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Problems with the data base");
		}
	}

    public void cleanTable(DefaultTableModel model)
	{
		int rows = model.getRowCount();
		if(rows > 0)
		{
			for(int i = 0; i < rows; i++)
			{
				model.removeRow(0);
				
			}			
		}

	}

	public void modifyProd(Product prod, int id, DefaultTableModel model) throws SQLException{
		if(prod != null) {
			con.modifyDBProd(prod, id);
			cleanTable(model);
			JOptionPane.showMessageDialog(null, "Data changed successfully.");
		}
		
		
	}

	public void orderBy(String name, DefaultTableModel model, String order) {
		try {
			ResultSet data = con.getDataTableOrderBy("products", name, order);
			java.sql.ResultSetMetaData resul = data.getMetaData();
			cleanTable(model);
			insertDataTable(data, resul, model);
		} catch(SQLException e) {
			JOptionPane.showMessageDialog(null, "Something wrong just happened.");

		}
		

	}

    
    
}
