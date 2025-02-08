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
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        EvidencijaAdresa ea = adrese.get(rowIndex);
        switch (columnIndex) {
            case 0: return ea.getEvidencijaid();
            case 1: return ea.getLicnaKarta();
            case 2: return ea.getDatumPromeneAdrese();
            default:
                throw new AssertionError();
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0: return "Evidencija id";
            case 1: return "Licna karta";
            case 2: return "Datum promene adrese";
            default:
                throw new AssertionError();
        }
    }
    
    
    
}
