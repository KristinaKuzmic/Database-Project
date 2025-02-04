/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package forms.models;

import domain.object.entities.Uplatnica;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Kristina
 */
public class ModelTabeleUplatnica extends AbstractTableModel {

    private List<Uplatnica> uplatnice;

    public List<Uplatnica> getUplatnice() {
        return uplatnice;
    }

    public ModelTabeleUplatnica(List<Uplatnica> uplatnice) {
        this.uplatnice = uplatnice;
    }

    @Override
    public int getRowCount() {
        if (uplatnice == null) {
            return 0;
        }
        return uplatnice.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Uplatnica u = uplatnice.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return u.getUplatnicaId();
            case 1:
                return u.getDatum();
            case 2:
                return u.getIznos();
            case 3:
                return u.getNazivStudentskogCentra();
            default:
                throw new AssertionError();
        }
    }
    
     @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Uplanica id";
            case 1:
                return "Datum";
            case 2:
                return "Iznos";
            case 3:
                return "Naziv studentskog centra";
            default:
                throw new AssertionError();
        }
    }
    
    /*public void osvezi(String ime) throws Exception{
         clanovi = Communication.getInstance().vratiClanove(ime);
         fireTableDataChanged();
    }*/

}
