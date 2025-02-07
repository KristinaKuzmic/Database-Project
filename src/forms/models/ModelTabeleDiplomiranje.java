/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package forms.models;

import controller.Controller;
import domain.object.entities.UverenjeODiplomiranju;
import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Kristina
 */
public class ModelTabeleDiplomiranje extends AbstractTableModel{
    
    private List<UverenjeODiplomiranju> diplomiranja;

    public List<UverenjeODiplomiranju> getDiplomiranja() {
        return diplomiranja;
    }

    public ModelTabeleDiplomiranje(List<UverenjeODiplomiranju> diplomiranja) {
        this.diplomiranja = diplomiranja;
    }
    
    

    @Override
    public int getRowCount() {
        if(diplomiranja == null) return 0;
        return diplomiranja.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        UverenjeODiplomiranju ud = diplomiranja.get(rowIndex);
        switch (columnIndex) {
            case 0:return ud.getRedniBroj();
            case 1: return ud.getStudent();
            case 2: return ud.getDatumZavrsetka();
            case 3:return ud.getZvanje();
            default:
                throw new AssertionError();
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0: return "Redni broj";
            case 1: return "Student";
            case 2: return "Datum zavrsetka";
            case 3: return "Zvanje steceno nakon diplomiranja";
            default:
                throw new AssertionError();
        }
    }

    public void osvezi() throws Exception{
        diplomiranja = Controller.getInstance().getAllDiplomiranja();
        fireTableDataChanged();
    }
    
    public void osvezi(String uslov) throws Exception{
        diplomiranja = Controller.getInstance().getAllParticion(uslov);
        fireTableDataChanged();
    }
    
    
    
}
