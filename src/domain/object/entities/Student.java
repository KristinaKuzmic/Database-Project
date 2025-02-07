/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain.object.entities;

import domain.object.DomainObject;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Struct;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Kristina
 */
public class Student extends DomainObject {

    private String jmbg;
    private String ime;
    private String prezime;
    private String imeJednogRoditelja;
    private Date datumRodjenja;
    private String brojIndeksa;
    private String kontakt;
    private String mejl;
    private Fakultet fakultet;
    private Broj broj;
    private Ulica ulica;
    private Mesto mesto;
    private Grad grad;

    public Student() {
    }

    public Student(String jmbg, String ime, String prezime, String imeJednogRoditelja, Date datumRodjenja, String brojIndeksa, String kontakt, String mejl, Fakultet fakultet, Broj broj, Ulica ulica, Mesto mesto, Grad grad) {
        this.jmbg = jmbg;
        this.ime = ime;
        this.prezime = prezime;
        this.imeJednogRoditelja = imeJednogRoditelja;
        this.datumRodjenja = datumRodjenja;
        this.brojIndeksa = brojIndeksa;
        this.kontakt = kontakt;
        this.mejl = mejl;
        this.fakultet = fakultet;
        this.broj = broj;
        this.ulica = ulica;
        this.mesto = mesto;
        this.grad = grad;
    }

    public String getJmbg() {
        return jmbg;
    }

    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
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

    public String getImeJednogRoditelja() {
        return imeJednogRoditelja;
    }

    public void setImeJednogRoditelja(String imeJednogRoditelja) {
        this.imeJednogRoditelja = imeJednogRoditelja;
    }

    public Date getDatumRodjenja() {
        return datumRodjenja;
    }

    public void setDatumRodjenja(Date datumRodjenja) {
        this.datumRodjenja = datumRodjenja;
    }

    public String getBrojIndeksa() {
        return brojIndeksa;
    }

    public void setBrojIndeksa(String brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    public String getKontakt() {
        return kontakt;
    }

    public void setKontakt(String kontakt) {
        this.kontakt = kontakt;
    }

    public String getMejl() {
        return mejl;
    }

    public void setMejl(String mejl) {
        this.mejl = mejl;
    }

    public Fakultet getFakultet() {
        return fakultet;
    }

    public void setFakultet(Fakultet fakultet) {
        this.fakultet = fakultet;
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
        return " student ";
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
        List<DomainObject> studenti = new ArrayList<>();
        while (rs.next()) {
            SimpleDateFormat format = new SimpleDateFormat("dd-MM-yy");
            String jmbg = rs.getString(1);
            String ime = rs.getString(2);
            String prezime = rs.getString(3);
            String imeRoditelja = rs.getString(4);
            Date dat = rs.getDate(5);
            Struct struct = (Struct) rs.getObject(6);
            String kontakt = "";
            String mejl = "";
            if (struct != null) {
                Object[] attributes = struct.getAttributes();
                kontakt = (String) attributes[0];
                mejl = (String) attributes[1];
            }
            String brojIndeksa = rs.getString(7);

            Fakultet fak = new Fakultet();
            fak.setFakultetId(rs.getLong(8));

            Broj broj = new Broj();
            broj.setBrojId(rs.getLong(9));

            Ulica ulica = new Ulica();
            ulica.setUlicaId(rs.getLong(10));

            Mesto mesto = new Mesto();
            mesto.setMestoid(rs.getLong(11));

            Grad grad = new Grad();
            grad.setPostanskiBroj(rs.getLong(12));

            Student s = new Student(jmbg, ime, prezime, imeRoditelja, dat,
                    brojIndeksa, kontakt, mejl, fak, broj, ulica, mesto, grad);

            studenti.add(s);
        }
        return studenti;
    }

    @Override
    public String getOrderByColumn() {
        return " jmbg ";
    }

    @Override
    public String alijas() {
        return " s ";
    }

    @Override
    public String getJoin() {
        return "";
    }

    @Override
    public String toString() {
        return ime + " " + prezime;
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
        final Student other = (Student) obj;
        return Objects.equals(this.jmbg, other.jmbg);
    }

    

    
    
}
