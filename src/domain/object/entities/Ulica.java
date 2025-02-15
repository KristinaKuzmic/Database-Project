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
public class Ulica extends DomainObject{
    
    private Long ulicaId;
    private Mesto mesto;
    private Grad grad;
    private String nazivUlice;

    public Ulica() {
    }

    public Ulica(Long ulicaId, Mesto mesto, Grad grad, String nazivUlice) {
        this.ulicaId = ulicaId;
        this.mesto = mesto;
        this.grad = grad;
        this.nazivUlice = nazivUlice;
    }
    
    
    

    public Long getUlicaId() {
        return ulicaId;
    }

    public void setUlicaId(Long ulicaId) {
        this.ulicaId = ulicaId;
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

    public String getNazivUlice() {
        return nazivUlice;
    }

    public void setNazivUlice(String nazivUlice) {
        this.nazivUlice = nazivUlice;
    }
    

    @Override
    public String getTableName() {
        return " ulica ";
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
        List<DomainObject> ulice = new LinkedList<>();
        while (rs.next()) {            
            Long ulicaid = rs.getLong(1);
            String naziv = rs.getString(2);
            
            Long pbr = rs.getLong(3);
            Grad g = new Grad();
            g.setPostanskiBroj(pbr);
            
            Long mestoid = rs.getLong(4);
            Mesto m = new Mesto();
            m.setMestoid(mestoid);
            
            Ulica u = new Ulica(ulicaid, m, g, naziv);
            ulice.add(u);
        }
        return ulice;
    }

    @Override
    public String getOrderByColumn() {
        return " ulicaid ";
    }

    @Override
    public String alijas() {
        return " u ";
    }

    @Override
    public String getJoin() {
        return "";
    }

    @Override
    public String toString() {
        return nazivUlice;
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
        final Ulica other = (Ulica) obj;
        return Objects.equals(this.ulicaId, other.ulicaId);
    }
    
    
    
}
