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
public class UverenjeOStudiranju extends DomainObject {

    private Long redniBroj;
    private String skolskaGodina;
    private String status;
    private int brojPutaUpisa;
    private int godinaStuidja;
    private Student student;
    private NivoStudija nivoStudija;
    private StudijskiProgram program;
    private Fakultet fakultet;
    private Date datum;
    private String napomena;
    private Zaposleni zaposleni;

    public UverenjeOStudiranju() {
    }

    public UverenjeOStudiranju(Long redniBroj, String skolskaGodina, String status, int brojPutaUpisa, int godinaStuidja, Student student, NivoStudija nivoStudija, StudijskiProgram program, Fakultet fakultet, Date datum, String napomena, Zaposleni zaposleni) {
        this.redniBroj = redniBroj;
        this.skolskaGodina = skolskaGodina;
        this.status = status;
        this.brojPutaUpisa = brojPutaUpisa;
        this.godinaStuidja = godinaStuidja;
        this.student = student;
        this.nivoStudija = nivoStudija;
        this.program = program;
        this.fakultet = fakultet;
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
        return " uverenje_O_Studiranju_pogled ";
    }

    @Override
    public String alijas() {
        return " uos ";
    }

    @Override
    public String getJoin() {
        return " left join student s on (s.jmbg=uos.jmbg) left join nivostudija ns on (uos.nivoid = ns.nivoid)";
    }

    @Override
    public String getAllColumnNames() {
        return " uos.*, s.ime, s.prezime, ns.naziv ";
    }

    @Override
    public String getAllInsertColumnNames() {
        return "rednibroj, skolskaGodina, status, brojPutaUpisa, jmbg, godinaStudija, nivoid,"
                + " programid, fakultetid, datum, napomena, zaposleniid";
    }

    @Override
    public String getColumnValues() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        String datumString = datum != null ? "TO_DATE('" + sdf.format(datum) + "', 'DD-MM-YY')" : "NULL";

        return String.format("%d, '%s', '%s', %d, '%s', %d, %d, %d, %d, %s, '%s', %d", redniBroj, skolskaGodina,
                status, brojPutaUpisa, student.getJmbg(),
                godinaStuidja, nivoStudija.getNivoId(), program.getProgramId(), fakultet.getFakultetId(), datumString,
                napomena, zaposleni.getZaposleniId());
    }

    @Override
    public String getUpdateClause() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        String datumString = datum != null ? "TO_DATE('" + sdf.format(datum) + "', 'DD-MM-YY')" : "NULL";

        return String.format("rednibroj = %d, skolskagodina = '%s', status = '%s', "
                + "brojputaupisa = %d, jmbg = '%s', godinastudija = %d, nivoid = %d, programid = %d, "
                + "fakultetid = %d, datum = %s, napomena = '%s', zaposleniid = %d", 
                redniBroj, skolskaGodina,
                status, brojPutaUpisa, student.getJmbg(),
                godinaStuidja, nivoStudija.getNivoId(), program.getProgramId(), fakultet.getFakultetId(), datumString,
                napomena, zaposleni.getZaposleniId());
    }

    @Override
    public String getWhereIdClause() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getUpdateWhereClause() {
        return String.format("redniBroj=%d", redniBroj);
    }

    @Override
    public String getDeleteWhereClause() {
        return String.format("redniBroj=%d", redniBroj);
    }

    @Override
    public List<DomainObject> getObjectsFromResultSet(ResultSet rs) throws SQLException {
        List<DomainObject> uso = new LinkedList<>();
        while (rs.next()) {
            Long id = rs.getLong(1);
            String skolskaGodina = rs.getString(2);
            String status = rs.getString(3);
            int brojPuta = rs.getInt(4);
            int godinaStudija = rs.getInt(6);

            Student s = new Student();
            s.setJmbg(rs.getString(5));

            NivoStudija ns = new NivoStudija();
            ns.setNivoId(rs.getLong(7));

            StudijskiProgram sp = new StudijskiProgram();
            sp.setProgramId(rs.getLong(8));

            Fakultet f = new Fakultet();
            f.setFakultetId(rs.getLong(9));

            Date datum = rs.getDate(10);
            String napomena = rs.getString(11);

            Zaposleni z = new Zaposleni();
            z.setZaposleniId(rs.getLong(12));

            String ime = rs.getString(13);
            String prezime = rs.getString(14);

            s.setIme(ime);
            s.setPrezime(prezime);

            String nivo = rs.getString(15);
            System.out.println(nivo);
            ns.setNaziv(nivo);
            UverenjeOStudiranju uos = new UverenjeOStudiranju(id, skolskaGodina, status, brojPuta,
                    godinaStudija, s, ns, sp, f, datum, napomena, z);
            uso.add(uos);
        }
        return uso;
    }

    @Override
    public String getOrderByColumn() {
        return " redniBroj ";
    }

}
