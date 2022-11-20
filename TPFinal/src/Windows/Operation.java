package Windows;

import javax.swing.table.DefaultTableModel;

public class Operation {

    public void setTableStock() {
        //jTableProducts

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Description");
        model.addColumn("Price");
        model.addColumn("Expire");
        model.addColumn("Stock");
        model.addColumn("Discount");
        model.addColumn("Sales");
    }
    
}
