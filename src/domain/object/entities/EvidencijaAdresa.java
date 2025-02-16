/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain.object.entities;

import domain.object.DomainObject;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Kristina
 */
public class EvidencijaAdresa extends DomainObject{
    
    private Date datumPromeneAdrese;
    private LicnaKarta licnaKarta;
    private Broj broj;
    private Ulica ulica;
    private Mesto mesto;
    private Grad grad;
    private Long evidencijaid;

    public EvidencijaAdresa() {
    }

    public EvidencijaAdresa(Date datumPromeneAdrese, LicnaKarta licnaKarta, Broj broj, Ulica ulica, Mesto mesto, Grad grad, Long evidencijaId) {
        this.datumPromeneAdrese = datumPromeneAdrese;
        this.licnaKarta = licnaKarta;
        this.broj = broj;
        this.ulica = ulica;
        this.mesto = mesto;
        this.grad = grad;
        this.evidencijaid = evidencijaId;
    }

    public Long getEvidencijaid() {
        return evidencijaid;
    }

    public void setEvidencijaid(Long evidencijaid) {
        this.evidencijaid = evidencijaid;
    }
    
    

    public Date getDatumPromeneAdrese() {
        return datumPromeneAdrese;
    }

    public void setDatumPromeneAdrese(Date datumPromeneAdrese) {
        this.datumPromeneAdrese = datumPromeneAdrese;
    }

    public LicnaKarta getLicnaKarta() {
        return licnaKarta;
    }

    public void setLicnaKarta(LicnaKarta licnaKarta) {
        this.licnaKarta = licnaKarta;
    }

    public Broj getBroj() {
        return broj;
    }

    public void setBroj(Broj broj) {
        this.broj = broj;
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
    
    

    @Override
    public String getTableName() {
        return " evidencija_adresa ";
    }

    @Override
    public String getAllColumnNames() {
        return " * ";
    }

    @Override
    public String getAllInsertColumnNames() {
        return "evidencijaid, datumpromeneadrese, brojlicnekarte, brojid, ulicaid, mestoid, postanskibroj";
    }

    @Override
    public String getColumnValues() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        String datumString = datumPromeneAdrese != null ? "TO_DATE('" + sdf.format(datumPromeneAdrese) + "', 'dd-MM-yy')" : "NULL";
        return String.format("%d, %s, %d, %d, %d, %d, %d", evidencijaid, datumString,licnaKarta.getBrojLicneKarte(),
                broj.getBrojId(), ulica.getUlicaId(), mesto.getMestoid(), grad.getPostanskiBroj());
    }

    @Override
    public String getUpdateClause() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        String datumString = datumPromeneAdrese != null ? "TO_DATE('" + sdf.format(datumPromeneAdrese) + "', 'dd-MM-yy')" : "NULL";
        return String.format("evidencijaid = %d, datumpromeneadrese = %s, "
                + "brojlicnekarte = %d, brojid= %d, ulicaid = %d, mestoid= %d, postanskibroj = %d", evidencijaid, 
                datumString,licnaKarta.getBrojLicneKarte(),
                broj.getBrojId(), ulica.getUlicaId(), mesto.getMestoid(), grad.getPostanskiBroj());
    }

    @Override
    public String getWhereIdClause() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getUpdateWhereClause() {
        return String.format("evidencijaid = %d and brojlicnekarte = %d ", evidencijaid, licnaKarta.getBrojLicneKarte());
    }

    @Override
    public String getDeleteWhereClause() {
        return String.format("evidencijaid = %d and brojlicnekarte = %d ", evidencijaid, licnaKarta.getBrojLicneKarte());
    }

    @Override
    public List<DomainObject> getObjectsFromResultSet(ResultSet rs) throws SQLException {
        List<DomainObject> evidenicija = new LinkedList<>();
        while (rs.next()) {            
            Long evidencijaId= rs.getLong(1);
            Date datum = rs.getDate(2);
            Long brojLicne = rs.getLong(3);
            
            LicnaKarta lk = new LicnaKarta();
            lk.setBrojLicneKarte(brojLicne);
            
            Broj b = new Broj();
            b.setBrojId(rs.getLong(4));
            
            Ulica u = new Ulica();
            u.setUlicaId(rs.getLong(5));
            
            Mesto m = new Mesto();
            m.setMestoid(rs.getLong(6));
            
            Grad g = new Grad();
            g.setPostanskiBroj(rs.getLong(7));
            
            EvidencijaAdresa ea = new EvidencijaAdresa(datum, lk, b, u, m, g, evidencijaId);
            evidenicija.add(ea);
        }
        return evidenicija;
    }

    @Override
    public String getOrderByColumn() {
        return " evidencijaid ";
    }

    @Override
    public String alijas() {
        return " e "; 
    }

    @Override
    public String getJoin() {
        return "";
    }
    
}
