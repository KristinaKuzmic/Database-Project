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
public class LicnaKarta extends DomainObject{
    
    private Long brojLicneKarte;
    private Date datumIzdavanja;
    private Date datumPrestanka;
    private Student student;
    private PolicijskaStanica policijskaStanica;
    private int brojPromeneAdrese;

    public LicnaKarta() {
    }

    public LicnaKarta(Long brojLicneKarte, Date datumIzdavanja, Date datumPrestanka, Student student, PolicijskaStanica policijskaStanica, int brojPromeneAdrese) {
        this.brojLicneKarte = brojLicneKarte;
        this.datumIzdavanja = datumIzdavanja;
        this.datumPrestanka = datumPrestanka;
        this.student = student;
        this.policijskaStanica = policijskaStanica;
        this.brojPromeneAdrese = brojPromeneAdrese;
    }

    public int getBrojPromeneAdrese() {
        return brojPromeneAdrese;
    }

    public void setBrojPromeneAdrese(int brojPromeneAdrese) {
        this.brojPromeneAdrese = brojPromeneAdrese;
    }

    @Override
    public String getJoin() {
        return " left join student s on (lk.jmbg = s.jmbg) ";
    }

    @Override
    public String alijas() {
        return " lk ";
    }
    
    

    public Long getBrojLicneKarte() {
        return brojLicneKarte;
    }

    public void setBrojLicneKarte(Long brojLicneKarte) {
        this.brojLicneKarte = brojLicneKarte;
    }

    public Date getDatumIzdavanja() {
        return datumIzdavanja;
    }

    public void setDatumIzdavanja(Date datumIzdavanja) {
        this.datumIzdavanja = datumIzdavanja;
    }

    public Date getDatumPrestanka() {
        return datumPrestanka;
    }

    public void setDatumPrestanka(Date datumPrestanka) {
        this.datumPrestanka = datumPrestanka;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public PolicijskaStanica getPolicijskaStanica() {
        return policijskaStanica;
    }

    public void setPolicijskaStanica(PolicijskaStanica policijskaStanica) {
        this.policijskaStanica = policijskaStanica;
    }
    
    

    @Override
    public String getTableName() {
        return " licna_karta ";
    }

    @Override
    public String getAllColumnNames() {
        return " lk.*, s.ime, s.prezime ";
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
        return String.format("ukupanbrojpromeneadresa= %d", brojPromeneAdrese);
    }

    @Override
    public String getWhereIdClause() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getUpdateWhereClause() {
        return String.format("brojlicnekarte = %d", brojLicneKarte);
    }

    @Override
    public String getDeleteWhereClause() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<DomainObject> getObjectsFromResultSet(ResultSet rs) throws SQLException {
        List<DomainObject> licneKarte = new LinkedList<>();
        while (rs.next()) {            
            Long brojLicneKarte = rs.getLong(1);
            Date datumI = rs.getDate(2);
            Date datumP = rs.getDate(3);
            int broj = rs.getInt(4);
            Student s = new Student();
            s.setJmbg(rs.getString(5));
            
            LicnaKarta lk = new LicnaKarta(brojLicneKarte, datumI, datumP, 
                    s, null, broj);
            licneKarte.add(lk);
        }
        return licneKarte;
    }

    @Override
    public String getOrderByColumn() {
        return " brojlicnekarte ";
    }

    @Override
    public String toString() {
        return brojLicneKarte+"";
    }
    
    
}
