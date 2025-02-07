/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package forms.models;

import domain.object.entities.LicnaKarta;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Kristina
 */
public class ModelTabeleLicnaKarta  extends AbstractTableModel{
    
    private List<LicnaKarta> licneKarte;

    public List<LicnaKarta> getLicneKarte() {
        return licneKarte;
    }

    public ModelTabeleLicnaKarta(List<LicnaKarta> licneKarte) {
        this.licneKarte = licneKarte;
    }
    

    @Override
    public int getRowCount() {
        if(licneKarte== null) return  0;
        return licneKarte.size();
                
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
