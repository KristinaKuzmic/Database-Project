/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package forms.models;

import controller.Controller;
import domain.object.entities.UverenjeOStudiranju;
import domain.object.entities.UverenjeOStudiranjuOsnovno;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Kristina
 */
public class ModelTabeleStudiranjeOsnovno extends AbstractTableModel{
    
    List<UverenjeOStudiranju> osnovno;

    public List<UverenjeOStudiranju> getOsnovno() {
        return osnovno;
    }

    public ModelTabeleStudiranjeOsnovno(List<UverenjeOStudiranju> osnovno) {
        this.osnovno = osnovno;
    }

    

    @Override
    public int getRowCount() {
        if(osnovno== null) return 0;
        return osnovno.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        UverenjeOStudiranju uso= osnovno.get(rowIndex);
        switch (columnIndex) {
            case 0: return uso.getRedniBroj();
            case 1: return uso.getStudent();
            case 2: return uso.getStatus();
            case 3: return uso.getGodinaStuidja();
            case 4: return uso.getNivoStudija();
            default:
                throw new AssertionError();
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0: return "Redni broj";
            case 1: return "Student";
            case 2: return "Status";
            case 3: return "Godina studija";
            case 4: return "Nivo studija";
            default:
                throw new AssertionError();
        }
    }
    
    public void osvezi() throws Exception{
        osnovno = Controller.getInstance().getAllUverenje();
        fireTableDataChanged();
    }
    
    
    
}
