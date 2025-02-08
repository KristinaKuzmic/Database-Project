/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain.object.entities;

import domain.object.DomainObject;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Kristina
 */
public class UverenjeOStudiranjuOsnovno extends DomainObject{
    
    private Long redniBroj;
    private String skolskaGodina;
    private String status;
    private int brojPutaUpisa;
    private int godinaStuidja;
    private Student student;
    private NivoStudija nivoStudija;
    private StudijskiProgram program;
    private Fakultet fakultet;

    public UverenjeOStudiranjuOsnovno() {
    }

    public UverenjeOStudiranjuOsnovno(Long redniBroj, String skolskaGodina, String status, int brojPutaUpisa, int godinaStuidja, Student student, NivoStudija nivoStudija, StudijskiProgram program, Fakultet fakultet) {
        this.redniBroj = redniBroj;
        this.skolskaGodina = skolskaGodina;
        this.status = status;
        this.brojPutaUpisa = brojPutaUpisa;
        this.godinaStuidja = godinaStuidja;
        this.student = student;
        this.nivoStudija = nivoStudija;
        this.program = program;
        this.fakultet = fakultet;
    }
    
    

    public Long getRedniBroj() {
        return redniBroj;
    }

    public void setRedniBroj(Long redniBroj) {
        this.redniBroj = redniBroj;
    }

    public String getSkolskaGodina() {
        return skolskaGodina;
    }

    public void setSkolskaGodina(String skolskaGodina) {
        this.skolskaGodina = skolskaGodina;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getBrojPutaUpisa() {
        return brojPutaUpisa;
    }

    public void setBrojPutaUpisa(int brojPutaUpisa) {
        this.brojPutaUpisa = brojPutaUpisa;
    }

    public int getGodinaStuidja() {
        return godinaStuidja;
    }

    public void setGodinaStuidja(int godinaStuidja) {
        this.godinaStuidja = godinaStuidja;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public NivoStudija getNivoStudija() {
        return nivoStudija;
    }

    public void setNivoStudija(NivoStudija nivoStudija) {
        this.nivoStudija = nivoStudija;
    }

    public StudijskiProgram getProgram() {
        return program;
    }

    public void setProgram(StudijskiProgram program) {
        this.program = program;
    }

    public Fakultet getFakultet() {
        return fakultet;
    }

    public void setFakultet(Fakultet fakultet) {
        this.fakultet = fakultet;
    }
    
    

    @Override
    public String getTableName() {
        return " uverenjeostudiranju_osnovno ";
    }

    @Override
    public String getAllColumnNames() {
        return " uso.*, s.ime, s.prezime, ns.naziv ";
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
        List<DomainObject> uso = new LinkedList<>();
        while (rs.next()) {            
            Long id = rs.getLong(1);
            String skolskaGodina = rs.getString(2);
            String status = rs.getString(3);
            int brojPuta = rs.getInt(4);
            int godinaStudija = rs.getInt(5);
            
            Student s = new Student();
            s.setJmbg(rs.getString(6));
            
            NivoStudija ns = new NivoStudija();
            ns.setNivoId(rs.getLong(7));
            
            StudijskiProgram sp = new StudijskiProgram();
            sp.setProgramId(rs.getLong(8));
            
            Fakultet f = new Fakultet();
            f.setFakultetId(rs.getLong(9));
            
            String ime = rs.getString(10);
            String prezime = rs.getString(11);
            
            s.setIme(ime);
            s.setPrezime(prezime);
            
            String nivo = rs.getString(12);
            ns.setNaziv(nivo);
            
            UverenjeOStudiranjuOsnovno u = new UverenjeOStudiranjuOsnovno(id, skolskaGodina, status, 
                    brojPuta, godinaStudija, s, ns, sp, f);
            uso.add(u);
        }
        return uso;
    }

    @Override
    public String getOrderByColumn() {
        return " rednibroj ";
    }

    @Override
    public String alijas() {
        return " uso ";
    }

    @Override
    public String getJoin() {
        return " left join student s on (s.jmbg=uso.jmbg) left join nivostudija ns on (uso.nivoid = ns.nivoid)";
    }
    
}
