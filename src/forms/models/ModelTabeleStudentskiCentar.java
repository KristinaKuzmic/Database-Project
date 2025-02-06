/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package forms.models;

import controller.Controller;
import domain.object.entities.StudentskiCentar;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Kristina
 */
public class ModelTabeleStudentskiCentar extends AbstractTableModel {

    private List<StudentskiCentar> studentskiCentri;

    public List<StudentskiCentar> getStudentskiCentri() {
        return studentskiCentri;
    }

    public ModelTabeleStudentskiCentar(List<StudentskiCentar> studentskiCentri) {
        this.studentskiCentri = studentskiCentri;
    }

    @Override
    public int getRowCount() {
        if (studentskiCentri != null) {
            return studentskiCentri.size();
        }
        return 0;
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        StudentskiCentar sc = studentskiCentri.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return sc.getScId();
            case 1:
                return sc.getNaziv();
            default:
                throw new AssertionError();
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Studentski centar id";
            case 1:
                return "Naziv studetskog centra";
            default:
                throw new AssertionError();
        }
    }

    
    public void osvezi() throws Exception {
        studentskiCentri = Controller.getInstance().getAllStudentskiCentar();
        fireTableDataChanged();
           
    }
    
            
}
