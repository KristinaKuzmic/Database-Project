/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package forms.models;

import controller.Controller;
import domain.object.entities.UverenjeOStudiranjuDetalji;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Kristina
 */
public class ModelTabeleStudiranjeDetalji extends AbstractTableModel{
    
    List<UverenjeOStudiranjuDetalji> uverenje;

    public List<UverenjeOStudiranjuDetalji> getUverenje() {
        return uverenje;
    }

    public ModelTabeleStudiranjeDetalji(List<UverenjeOStudiranjuDetalji> uverenje) {
        this.uverenje = uverenje;
    }
    
    

    @Override
    public int getRowCount() {
        if(uverenje == null ) 
            return 0;
        return uverenje.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        UverenjeOStudiranjuDetalji usd = uverenje.get(rowIndex);
        switch (columnIndex) {
            case 0: return usd.getRedniBroj();
            case 1: return usd.getDatum();
            case 2: return usd.getNapomena();
            default:
                throw new AssertionError();
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0: return "Redni broj";
            case 1: return "Datum";
            case 2: return "Napomena";
            default:
                throw new AssertionError();
        }
    }
    
    public void osvezi() throws Exception{
        uverenje = Controller.getInstance().getAllUverenjeDetalji();
        fireTableDataChanged();
    }
    
    
    
}
