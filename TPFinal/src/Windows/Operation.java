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

	/* Ingresa los datos a una tabla
	 * data: datos de la db
	 * resul: información de las columnas
	 * model: modelo de la tabla que se quiera rellenar
	*/
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

	/* Busca los datos necesarios para mostrarlos por tabla 
	 * table: tabla en donde se mostrarán los resultados
	 * model: modelo de la tabla que se quiera rellenar
	 * db: tabla de la base de datos a la cual se quiere acceder
	*/
	public void setTable(JTable table, DefaultTableModel model, String tableDB) throws SQLException {
		try {
			ResultSet data = con.getDataTable(tableDB);
			java.sql.ResultSetMetaData resul = data.getMetaData();
			insertDataTable(data, resul, model);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Problems with the data base");
		}
	}

	// Limpia el modelo de tabla enviada como parámetro
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

	/* Modifica todos los datos de un producto
	 * prod: producto de tipo Product a modificar
	 * id: id del producto a modificar
	 * model: modelo de la tabla que se modifica 
	 */
	public void modifyProd(Product prod, int id, DefaultTableModel model) throws SQLException{
		if(prod != null) {
			con.modifyDBProd(prod, id);
			cleanTable(model);
			JOptionPane.showMessageDialog(null, "Data changed successfully.");
		}
		
		
	}

	/* Ordena una tabla
	 * name: nombre de la columna a ordenar
	 * model: modelo de la tabla que se ordena
	 * order: orden con el que se quiere ordenar (ASC, DESC)
	 */
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
