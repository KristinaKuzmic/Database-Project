/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain.object.entities;

import domain.object.DomainObject;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Kristina
 */
public class Uplatnica extends DomainObject{
    
    private Long uplatnicaId;
    private Date datum;
    private int iznos;
    private int pozivNaBroj;
    private int sifraPlacanja;
    private String Mesto;
    private int model;
    private String racunPlatioca;
    private String racunPrimaoca;
    private String svrhaUplate;
    private StudentskiCentar sc;
    private Student student;
    private Valuta valuta;
    private String nazivStudentskogCentra;

    public Uplatnica() {
    }

    public Uplatnica(Long uplatnicaId, Date datum, int iznos, int pozivNaBroj, int sifraPlacanja, String Mesto, int model, String racunPlatioca, String racunPrimaoca, String svrhaUplate, StudentskiCentar sc, Student student, Valuta valuta, String nazivStudentskogCentra) {
        this.uplatnicaId = uplatnicaId;
        this.datum = datum;
        this.iznos = iznos;
        this.pozivNaBroj = pozivNaBroj;
        this.sifraPlacanja = sifraPlacanja;
        this.Mesto = Mesto;
        this.model = model;
        this.racunPlatioca = racunPlatioca;
        this.racunPrimaoca = racunPrimaoca;
        this.svrhaUplate = svrhaUplate;
        this.sc = sc;
        this.student = student;
        this.valuta = valuta;
        this.nazivStudentskogCentra = nazivStudentskogCentra;
    }

    public String getNazivStudentskogCentra() {
        return nazivStudentskogCentra;
    }

    public void setNazivStudentskogCentra(String nazivStudentskogCentra) {
        this.nazivStudentskogCentra = nazivStudentskogCentra;
    }
    
    

    public Long getUplatnicaId() {
        return uplatnicaId;
    }

    public void setUplatnicaId(Long uplatnicaId) {
        this.uplatnicaId = uplatnicaId;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public int getIznos() {
        return iznos;
    }

    public void setIznos(int iznos) {
        this.iznos = iznos;
    }

    public int getPozivNaBroj() {
        return pozivNaBroj;
    }

    public void setPozivNaBroj(int pozivNaBroj) {
        this.pozivNaBroj = pozivNaBroj;
    }

    public int getSifraPlacanja() {
        return sifraPlacanja;
    }

    public void setSifraPlacanja(int sifraPlacanja) {
        this.sifraPlacanja = sifraPlacanja;
    }

    public String getMesto() {
        return Mesto;
    }

    public void setMesto(String Mesto) {
        this.Mesto = Mesto;
    }

    public int getModel1() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public String getRacunPlatioca() {
        return racunPlatioca;
    }

    public void setRacunPlatioca(String racunPlatioca) {
        this.racunPlatioca = racunPlatioca;
    }

    public String getRacunPrimaoca() {
        return racunPrimaoca;
    }

    public void setRacunPrimaoca(String racunPrimaoca) {
        this.racunPrimaoca = racunPrimaoca;
    }

    public String getSvrhaUplate() {
        return svrhaUplate;
    }

    public void setSvrhaUplate(String svrhaUplate) {
        this.svrhaUplate = svrhaUplate;
    }

    public StudentskiCentar getSc() {
        return sc;
    }

    public void setSc(StudentskiCentar sc) {
        this.sc = sc;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Valuta getValuta() {
        return valuta;
    }

    public void setValuta(Valuta valuta) {
        this.valuta = valuta;
    }
    
    

    @Override
    public String getTableName() {
        return " uplatnica ";
    }

    @Override
    public String getAllColumnNames() {
        return " * ";
    }

    @Override
    public String getAllInsertColumnNames() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yy");

        String datumString = datum != null ? "TO_DATE('" + sdf.format(datum) + "', 'DD-MM-YY')" : "NULL";
        
        return String.format("%d, '%s', %s, %d, %d, %d, '%s', '%s', %d, %d, '%s', '%s', %d", this.uplatnicaId, this.Mesto, datumString, this.iznos,
                this.model, this.pozivNaBroj, this.racunPlatioca, this.racunPrimaoca, this.sc.getScId(),
                this.sifraPlacanja,this.student.getJmbg(), this.svrhaUplate, this.valuta.getValutaId());
    }

    @Override
    public String getColumnValues() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yy");
        String datumString = datum != null ? "TO_DATE('" + sdf.format(datum) + "', 'DD-MM-YY')" : "NULL";
        return String.format("uplatnicaid = %d, mesto = '%s', datum = %s, iznos = %d, model = %d,"
                + "pozivNaBroj= %d, racunPlatioca = '%s', racunPrimaoca = '%s', scid = %d, sifraplacanja = %d, jmbg '%s', "
                + " svrhauplate = '%s', valutaid = %d", 
                this.uplatnicaId, this.Mesto, datumString, this.iznos,
                this.model, this.pozivNaBroj, this.racunPlatioca, this.racunPrimaoca, this.sc.getScId(),
                this.sifraPlacanja,this.student.getJmbg(), this.svrhaUplate, this.valuta.getValutaId());
        
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
        List<DomainObject> uplatnice = new ArrayList<>();
        while(rs.next()){
            SimpleDateFormat format = new SimpleDateFormat("dd-MM-yy");
            Long id = rs.getLong(1);
            Date datum = rs.getDate(2);
            int iznos = rs.getInt(3);
            int pozivNaBroj = rs.getInt(4);
            int sifraPlacanja = rs.getInt(5);
            String mesto = rs.getString(6);
            int mod = rs.getInt(7);
            String racunPlatioca = rs.getString(8);
            String racunPrimaoca = rs.getString(9);
            String svrhaUplate = rs.getString(10);
            
            StudentskiCentar sc = new StudentskiCentar();
            sc.setScId(rs.getLong(11));
            
            Student student = new Student();
            student.setJmbg(rs.getString(12));
            
            Valuta v = new Valuta();
            v.setValutaId(rs.getLong(13));
            
            String nazivSC = rs.getString(14);
            
            Uplatnica u = new Uplatnica(id, datum, iznos, pozivNaBroj, sifraPlacanja, 
                    mesto, mod, racunPlatioca, racunPrimaoca, svrhaUplate, sc, student, v, nazivSC);
            uplatnice.add(u);
            
        }
        
        return uplatnice;
    }

    @Override
    public String getOrderByColumn() {
        return "uplatnicaid";
    }

    @Override
    public String alijas() {
        return " u ";
    }

    @Override
    public String getJoin() {
        return "";
        //return " join studentskicentar sc on (u.scid = sc.scid) join student s on (u.jmbg = s.jmbg) join valuta v on (u.valutaid = v.valutaid)";
    }
    
}
