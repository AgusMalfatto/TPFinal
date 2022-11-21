package Windows;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import com.mysql.cj.jdbc.result.ResultSetMetaData;

import DataBase.Conection;
import Products.Product;

public class Operation {

	Conection con;

	public Operation() throws Exception {
		con = new Conection(); 
	}

	public void setTable(JTable table, DefaultTableModel model, String db) throws SQLException {
		try {
			ResultSet data = con.getDataTable(db);
			java.sql.ResultSetMetaData resul = data.getMetaData();
			Object[] columns = new Object[resul.getColumnCount()];
			Object[] rows = new Object[resul.getColumnCount()];

			for(int i = 0; i < columns.length; i++) {
				columns[i] = resul.getColumnName(i + 1);
				System.out.println(columns[i]);
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

    
    
}
