/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package forms.models;

import domain.object.entities.EvidencijaAdresa;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Kristina
 */
public class ModelTabeleEvidencija extends AbstractTableModel{
    
    private List<EvidencijaAdresa> adrese;

    public List<EvidencijaAdresa> getAdrese() {
        return adrese;
    }

    public ModelTabeleEvidencija(List<EvidencijaAdresa> adrese) {
        this.adrese = adrese;
    }
    
    

    @Override
    public int getRowCount() {
        if(adrese == null) return 0;
        return adrese.size();
    }

    @Override
    public int getColumnCount() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
