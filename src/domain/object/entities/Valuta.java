/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain.object.entities;

import domain.object.DomainObject;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Kristina
 */
public class Valuta extends DomainObject{
    
    private Long valutaId;
    private String naziv;

    public Valuta() {
    }

    public Valuta(Long valutaId, String naziv) {
        this.valutaId = valutaId;
        this.naziv = naziv;
    }

    public Long getValutaId() {
        return valutaId;
    }

    public void setValutaId(Long valutaId) {
        this.valutaId = valutaId;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }
    
    

    @Override
    public String getTableName() {
        return " valuta ";
    }

    @Override
    public String getAllColumnNames() {
        return " * ";
    }

    @Override
    public String getAllInsertColumnNames() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getColumnValues() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getUpdateClause() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getWhereIdClause() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getUpdateWhereClause() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getDeleteWhereClause() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<DomainObject> getObjectsFromResultSet(ResultSet rs) throws SQLException {
        List<DomainObject> valute = new ArrayList<>();
        while (rs.next()) {            
            Long valutaid = rs.getLong(1);
            String naziv = rs.getString(2);
            Date datum = rs.getDate(3);
            
            Valuta v= new Valuta(valutaid, naziv);
            valute.add(v);
        }
        return valute;
    }

    @Override
    public String getOrderByColumn() {
        return " valutaid ";
    }

    @Override
    public String alijas() {
        return " v "; 
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
