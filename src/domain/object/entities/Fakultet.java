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
public class Fakultet extends DomainObject{
    
    private Long fakultetId;
    private String naziv;
    private Univerzitet univerzitet;

    public Fakultet() {
    }

    public Fakultet(Long fakultetId, String naziv, Univerzitet univerzitet) {
        this.fakultetId = fakultetId;
        this.naziv = naziv;
        this.univerzitet = univerzitet;
    }
    
    

    public Long getFakultetId() {
        return fakultetId;
    }

    public void setFakultetId(Long fakultetId) {
        this.fakultetId = fakultetId;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public Univerzitet getUniverzitet() {
        return univerzitet;
    }

    public void setUniverzitet(Univerzitet univerzitet) {
        this.univerzitet = univerzitet;
    }
    
    

    @Override
    public String getTableName() {
        return "fakultet";
    }

    @Override
    public String getAllColumnNames() {
        return "*";
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
        return String.format("fakultetid = %d, naziv= '%s'", this.fakultetId, this.naziv);
    }

    @Override
    public String getWhereIdClause() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getUpdateWhereClause() {
        return String.format("fakultetid = %d", this.fakultetId);
    }

    @Override
    public String getDeleteWhereClause() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<DomainObject> getObjectsFromResultSet(ResultSet rs) throws SQLException {
        List<DomainObject> fakulteti = new ArrayList<>();
        while(rs.next()){
            
            String nazivU = rs.getString(5);
            Long univerzitetid = rs.getLong(4);
            
            Univerzitet univerzitet = new Univerzitet(univerzitetid, nazivU);
            
            Long fakultetid = rs.getLong("fakultetid");
            String naziv = rs.getString("naziv");
            
            
            Fakultet fakultet = new Fakultet(fakultetid, naziv, univerzitet);
            //System.out.println(fakultet);
            fakulteti.add(fakultet);
        }
        return fakulteti;
    }

    @Override
    public String getOrderByColumn() {
        return " fakultetid ";
    }

    @Override
    public String alijas() {
        return " f ";
    }

    @Override
    public String getJoin() {
        return "join univerzitet u on (f.univerzitetid = u.univerzitetid)";
    }
    
    
}
