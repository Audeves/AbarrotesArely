/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author itzel
 */
public class Render extends DefaultTableCellRenderer{

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value,
            boolean isSelected, boolean hasFocus, int row, int column) {
        
        if (value instanceof JButton) {
            JButton btn = (JButton)value;
            return btn;
        }
        if (value instanceof JSpinner) {
            JSpinner spinner = (JSpinner)value;
            return spinner;
        }
        
        return super.getTableCellRendererComponent(table, value, isSelected,
                hasFocus, row, column); //To change body of generated methods, choose Tools | Templates.
    }


    
}