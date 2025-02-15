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
public class Mesto extends DomainObject{
    
    private Long mestoid;
    private Grad grad;
    private String naziv;

    public Mesto() {
    }

    public Mesto(Long mestoid, Grad grad, String naziv) {
        this.mestoid = mestoid;
        this.grad = grad;
        this.naziv = naziv;
    }
    
    

    public Grad getGrad() {
        return grad;
    }

    public Long getMestoid() {
        return mestoid;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setGrad(Grad grad) {
        this.grad = grad;
    }

    public void setMestoid(Long mestoid) {
        this.mestoid = mestoid;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }
    
    

    @Override
    public String getTableName() {
        return " mesto ";
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
        List<DomainObject> mesta = new LinkedList<>();
        while (rs.next()) {            
            Long mestoid = rs.getLong(1);
            String naziv = rs.getString(2);
            
            Long gradid =rs.getLong(3);
            Grad g = new Grad();
            g.setPostanskiBroj(gradid);
            
            Mesto m = new Mesto(mestoid, g, naziv);
            mesta.add(m);
        }
        return mesta;
    }

    @Override
    public String getOrderByColumn() {
        return " mestoid ";
    }

    @Override
    public String alijas() {
        return " m ";
    }

    @Override
    public String getJoin() {
        return "";
    }

    @Override
    public String toString() {
        return naziv;
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
        final Mesto other = (Mesto) obj;
        return Objects.equals(this.mestoid, other.mestoid);
    }
    
    
    
}
