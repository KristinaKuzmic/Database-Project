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
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        LicnaKarta lk= licneKarte.get(rowIndex);
        switch (columnIndex) {
            case 0: return lk.getBrojLicneKarte();
            case 1: return lk.getStudent();
            case 2: return lk.getBrojPromeneAdrese();
            default:
                throw new AssertionError();
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0: return "Broj licne karte";
            case 1: return "Student";
            case 2: return "Broj promena Adrese";
            default:
                throw new AssertionError();
        }
    }
    
    
    
}
