/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain.object.entities;

import domain.object.DomainObject;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Kristina
 */
public class Broj extends DomainObject{
    
    private Long brojId;
    private Ulica ulica;
    private Mesto mesto;
    private Grad grad;
    private int broj;

    public Broj() {
    }

    public Broj(Long brojId, Ulica ulica, Mesto mesto, Grad grad, int broj) {
        this.brojId = brojId;
        this.ulica = ulica;
        this.mesto = mesto;
        this.grad = grad;
        this.broj = broj;
    }
    

    public Long getBrojId() {
        return brojId;
    }

    public void setBrojId(Long brojId) {
        this.brojId = brojId;
    }

    public Ulica getUlica() {
        return ulica;
    }

    public void setUlica(Ulica ulica) {
        this.ulica = ulica;
    }

    public Mesto getMesto() {
        return mesto;
    }

    public void setMesto(Mesto mesto) {
        this.mesto = mesto;
    }

    public Grad getGrad() {
        return grad;
    }

    public void setGrad(Grad grad) {
        this.grad = grad;
    }

    public int getBroj() {
        return broj;
    }

    public void setBroj(int broj) {
        this.broj = broj;
    }
    
    

    @Override
    public String getTableName() {
        return " broj ";
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
        List<DomainObject> brojevi = new LinkedList<>();
        while (rs.next()) {            
            Long brojid = rs.getLong(1);
            int broj = rs.getInt(2);
            
            Long pbr = rs.getLong(3);
            Grad g = new Grad();
            g.setPostanskiBroj(pbr);
            
            Long mestoid = rs.getLong(4);
            Mesto m = new Mesto();
            m.setMestoid(mestoid);
            
            Long ulicaid = rs.getLong(5);
            Ulica u = new Ulica();
            u.setUlicaId(ulicaid);
            
            Broj b = new Broj(brojid, u, m, g, broj);
            brojevi.add(b);
           
        }
        return brojevi;
    }

    @Override
    public String getOrderByColumn() {
        return " brojid ";
    }

    @Override
    public String alijas() {
        return " b "; 
    }

    @Override
    public String getJoin() {
        return "";
    }

    @Override
    public String toString() {
        return broj+"";
    }

    @Override
    public int hashCode() {
        int hash = 7;
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
        final Broj other = (Broj) obj;
        return Objects.equals(this.brojId, other.brojId);
    }
    
    
    
    
}
