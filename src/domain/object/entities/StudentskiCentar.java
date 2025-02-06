/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain.object.entities;

import domain.object.DomainObject;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kristina
 */
public class StudentskiCentar extends DomainObject{
    
    private Long scId;
    private String naziv;

    public StudentskiCentar() {
    }

    public StudentskiCentar(Long scId, String naziv) {
        this.scId = scId;
        this.naziv = naziv;
    }
    
    

    public String getNaziv() {
        return naziv;
    }

    public Long getScId() {
        return scId;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public void setScId(Long scId) {
        this.scId = scId;
    }
    
    

    @Override
    public String getTableName() {
        return " studentskicentar ";
    }

    @Override
    public String getAllColumnNames() {
        return " * ";
    }

    @Override
    public String getAllInsertColumnNames() {
        return " scid, naziv "; 
    }

    @Override
    public String getColumnValues() {
        return String.format("%d, '%s'", this.scId, this.naziv);
    }

    @Override
    public String getUpdateClause() {
        return String.format("scid = %d, naziv = '%s' ", this.getScId(), this.getNaziv());
    }

    @Override
    public String getWhereIdClause() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getUpdateWhereClause() {
        return String.format("scid = %d", this.getScId());
    }

    @Override
    public String getDeleteWhereClause() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<DomainObject> getObjectsFromResultSet(ResultSet rs) throws SQLException {
        List<DomainObject> sci = new ArrayList<>();
        while(rs.next()){
            Long id = rs.getLong(1);
            String naziv = rs.getString(2);
            StudentskiCentar sc= new StudentskiCentar(id, naziv);
            sci.add(sc);
        }
        return sci;
    }

    @Override
    public String getOrderByColumn() {
        return " scid ";
    }

    @Override
    public String alijas() {
        return " sc ";
    }

    @Override
    public String getJoin() {
        return "";

    }

    @Override
    public String toString() {
        return naziv;
    }
    
    
    
}
