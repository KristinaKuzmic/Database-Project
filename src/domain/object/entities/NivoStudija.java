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
public class NivoStudija extends DomainObject{
    
    private Long nivoId;
    private String naziv;
    private String trajanje;
    private int espb;

    public NivoStudija() {
    }

    public NivoStudija(Long nivoId, String naziv, String trajanje, int espb) {
        this.nivoId = nivoId;
        this.naziv = naziv;
        this.trajanje = trajanje;
        this.espb = espb;
    }

    
    public Long getNivoId() {
        return nivoId;
    }

    public void setNivoId(Long nivoId) {
        this.nivoId = nivoId;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getTrajanje() {
        return trajanje;
    }

    public void setTrajanje(String trajanje) {
        this.trajanje = trajanje;
    }

    public int getEspb() {
        return espb;
    }

    public void setEspb(int espb) {
        this.espb = espb;
    }

    @Override
    public String toString() {
        return this.getNaziv();
    }
    
    

    @Override
    public String getTableName() {
        return " nivostudija ";
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
        List<DomainObject> nivoiStudija = new ArrayList<>();
        while(rs.next()){
            Long nivoId = rs.getLong(1);
            String naziv = rs.getString(2);
            String trajanje = rs.getString(3);
            int espb = rs.getInt(4);
            NivoStudija ns = new NivoStudija(nivoId, naziv, trajanje, espb);
            nivoiStudija.add(ns);
        }
        return nivoiStudija;
    }

    @Override
    public String getOrderByColumn() {
        return " nivoid ";
    }

    @Override
    public String alijas() {
        return " ns ";
    }

    @Override
    public String getJoin() {
        return "";
    }

    @Override
    public int hashCode() {
        int hash = 5;
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
        final NivoStudija other = (NivoStudija) obj;
        return Objects.equals(this.nivoId, other.nivoId);
    }
    
    
    
}
