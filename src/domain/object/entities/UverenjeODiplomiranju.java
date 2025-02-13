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
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Kristina
 */
public class UverenjeODiplomiranju extends DomainObject {

    private Long redniBroj;
    private Date datum;
    private int godinaUpisa;
    private double prosecnaOcena;
    private int naplata;
    private Date datumZavrsetka;
    private Student student;
    private Zaposleni zaposleni;
    private StudijskiProgram program;
    private Fakultet fakultet;
    private String zvanje;

    public UverenjeODiplomiranju() {
    }

    public UverenjeODiplomiranju(Long redniBroj, Date datum, int godinaUpisa, double prosecnaOcena, int naplata, Date datumZavrsetka, Student student, Zaposleni zaposleni, StudijskiProgram program, Fakultet fakultet, String zvanje) {
        this.redniBroj = redniBroj;
        this.datum = datum;
        this.godinaUpisa = godinaUpisa;
        this.prosecnaOcena = prosecnaOcena;
        this.naplata = naplata;
        this.datumZavrsetka = datumZavrsetka;
        this.student = student;
        this.zaposleni = zaposleni;
        this.program = program;
        this.fakultet = fakultet;
        this.zvanje = zvanje;
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

    public int getGodinaUpisa() {
        return godinaUpisa;
    }

    public void setGodinaUpisa(int godinaUpisa) {
        this.godinaUpisa = godinaUpisa;
    }

    public double getProsecnaOcena() {
        return prosecnaOcena;
    }

    public void setProsecnaOcena(double prosecnaOcena) {
        this.prosecnaOcena = prosecnaOcena;
    }

    public int getNaplata() {
        return naplata;
    }

    public void setNaplata(int naplata) {
        this.naplata = naplata;
    }

    public Date getDatumZavrsetka() {
        return datumZavrsetka;
    }

    public void setDatumZavrsetka(Date datumZavrsetka) {
        this.datumZavrsetka = datumZavrsetka;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Zaposleni getZaposleni() {
        return zaposleni;
    }

    public void setZaposleni(Zaposleni zaposleni) {
        this.zaposleni = zaposleni;
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

    public String getZvanje() {
        return zvanje;
    }

    public void setZvanje(String zvanje) {
        this.zvanje = zvanje;
    }

    @Override
    public String getTableName() {
        return "uverenjeodiplomiranju";
    }

    @Override
    public String getAllColumnNames() {
        return " ud.*, s.ime, s.prezime ";
    }

    @Override
    public String getAllInsertColumnNames() {
        return "rednibroj, datum, godinaupisa, prosecnaocena, naplata, datumzavrsetka, jmbg, zaposleniid, programid, fakultetid, zvanje";
    }

    @Override
    public String getColumnValues() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        String datumString = datum != null ? "TO_DATE('" + sdf.format(datum) + "', 'dd-MM-yy')" : "NULL";
        String datumString2 = datumZavrsetka != null ? "TO_DATE('" + sdf.format(datumZavrsetka) + "', 'dd-MM-yy')" : "NULL";

        return String.format("%d, %s, %d, %4.2f, %d, %s, '%s', %d, %d, %d, '%s'", redniBroj, datumString, godinaUpisa,
                prosecnaOcena, naplata, datumString2, student.getJmbg(), zaposleni.getZaposleniId(),
                program.getProgramId(), fakultet.getFakultetId(), zvanje);
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
            Long redniBroj = rs.getLong(1);
            Date datum = rs.getDate(2);
            int godinaU = rs.getInt(3);
            double ocena = rs.getDouble(4);
            int naplata = rs.getInt(5);
            Date zavrsetka = rs.getDate(6);

            Student s = new Student();
            s.setJmbg(rs.getString(7));

            Zaposleni z = new Zaposleni();
            z.setZaposleniId(rs.getLong(8));

            StudijskiProgram sp = new StudijskiProgram();
            sp.setProgramId(rs.getLong(9));

            Fakultet fak = new Fakultet();
            fak.setFakultetId(rs.getLong(10));

            String zvanje = rs.getString(11);

            try {
                String ime = rs.getString(12);
                String prezime = rs.getString(13);
                s.setIme(ime);
                s.setPrezime(prezime);
            } catch (Exception e) {
                System.out.println("ne postoji ime i prezime");
            }

            UverenjeODiplomiranju ud = new UverenjeODiplomiranju(redniBroj, datum, godinaU,
                    ocena, naplata, zavrsetka, s, z, sp, fak, zvanje);
            uverenja.add(ud);
        }
        return uverenja;
    }

    @Override
    public String getOrderByColumn() {
        return " rednibroj ";
    }

    @Override
    public String alijas() {
        return " ud ";
    }

    @Override
    public String getJoin() {
        //return "";
        return "join student s on (s.jmbg = ud.jmbg)";
    }

}
