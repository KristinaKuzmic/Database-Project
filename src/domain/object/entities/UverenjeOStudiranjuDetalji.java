/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain.object.entities;

import domain.object.DomainObject;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Kristina
 */
public class UverenjeOStudiranjuDetalji extends DomainObject{
    
    private Long redniBroj;
    private Date datum;
    private String napomena;
    private Zaposleni zaposleni;

    public UverenjeOStudiranjuDetalji() {
    }

    public UverenjeOStudiranjuDetalji(Long redniBroj, Date datum, String napomena, Zaposleni zaposleni) {
        this.redniBroj = redniBroj;
        this.datum = datum;
        this.napomena = napomena;
        this.zaposleni = zaposleni;
    }
    
    

    public Long getRedniBroj() {
        return redniBroj;
    }

    public void setRedniBroj(Long redniBroj) {
        this.redniBroj = redniBroj;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public String getNapomena() {
        return napomena;
    }

    public void setNapomena(String napomena) {
        this.napomena = napomena;
    }

    public Zaposleni getZaposleni() {
        return zaposleni;
    }

    public void setZaposleni(Zaposleni zaposleni) {
        this.zaposleni = zaposleni;
    }
    
    

    @Override
    public String getTableName() {
        return " uverenjeostudiranju_detalji";
    }

    @Override
    public String getAllColumnNames() {
        return " usd.*, z.ime, z.prezime ";
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
        List<DomainObject> uverenja = new LinkedList<>();
        while (rs.next()) {            
            Long rbr = rs.getLong(1);
            Date datum = rs.getDate(2);
            String napomena = rs.getString(3);
            
            Zaposleni z = new Zaposleni();
            z.setZaposleniId(rs.getLong(4));
            z.setIme(rs.getString(5));
            z.setPrezime(rs.getString(6));
            
            UverenjeOStudiranjuDetalji usd = new UverenjeOStudiranjuDetalji(rbr, datum, napomena, z);
            uverenja.add(usd);
            
        }
        return uverenja;
    }

    @Override
    public String getOrderByColumn() {
        return " rednibroj ";
    }

    @Override
    public String alijas() {
        return " usd ";
    }

    @Override
    public String getJoin() {
        return " left join zaposleni z on (z.zaposleniid = usd.zaposleniid)";
    }
    
}
