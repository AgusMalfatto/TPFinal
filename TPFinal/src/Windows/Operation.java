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
    public void setTable(JTable table, DefaultTableModel model) throws Exception {
        
               
        ResultSet data = con.getDataTable("products");
		
		//CleanTable(modelCd);

		if(data != null){
			try {
				while(data.next()){
					Object[] row = new Object[7];
					row[0] = data.getString("Id");
					row[1] = data.getString("description");
					row[2] = data.getString("price");
					row[3] = data.getString("expire");
					row[4] = data.getString("stock");
					row[5] = data.getString("discount");
					row[6] = data.getString("sales");
					
					model.addRow(row);
					}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
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
