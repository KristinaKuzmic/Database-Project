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
import java.util.Objects;

/**
 *
 * @author Kristina
 */
public class Zaposleni extends DomainObject{
    
    private Long zaposleniId;
    private String ime;
    private String prezime;
    private Fakultet fakultet;

    public Zaposleni() {
    }

    public Zaposleni(Long zaposleniId, String ime, String prezime, Fakultet fakultet) {
        this.zaposleniId = zaposleniId;
        this.ime = ime;
        this.prezime = prezime;
        this.fakultet = fakultet;
    }
    
    

    public Long getZaposleniId() {
        return zaposleniId;
    }

    public void setZaposleniId(Long zaposleniId) {
        this.zaposleniId = zaposleniId;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public Fakultet getFakultet() {
        return fakultet;
    }

    public void setFakultet(Fakultet fakultet) {
        this.fakultet = fakultet;
    }
    
    

    @Override
    public String getTableName() {
        return " zaposleni ";
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
        List<DomainObject> zaposleni = new ArrayList<>();
        while (rs.next()) {            
            Long id = rs.getLong(1);
            String ime = rs.getString(2);
            String prezime = rs.getString(3);
            Zaposleni z = new Zaposleni(id, ime, prezime, null);
            zaposleni.add(z);
        }
        return zaposleni;
    }

    @Override
    public String toString() {
        return ime + " " + prezime;
    }

    
    
    @Override
    public String getOrderByColumn() {
        return " zaposleniid ";
    }

    @Override
    public String alijas() {
        return " z ";
    }

    @Override
    public String getJoin() {
        return "";
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Zaposleni other = (Zaposleni) obj;
        return Objects.equals(this.zaposleniId, other.zaposleniId);
    }
    
}
