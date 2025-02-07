/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain.object.entities;

import domain.object.DomainObject;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Kristina
 */
public class StudijskiProgram extends DomainObject {

    private Long programId;
    private Fakultet fakultet;
    private String naziv;
    private NivoStudija nivoStudija;
    private String nazivFakulteta;

    public String getNazivFakulteta() {
        return nazivFakulteta;
    }

    public void setNazivFakulteta(String nazivFakulteta) {
        this.nazivFakulteta = nazivFakulteta;
    }

    public StudijskiProgram() {
    }

    public StudijskiProgram(Long programId, Fakultet fakultet, String naziv, NivoStudija nivoStudija, String nazivFakulteta) {
        this.programId = programId;
        this.fakultet = fakultet;
        this.naziv = naziv;
        this.nivoStudija = nivoStudija;
        this.nazivFakulteta = nazivFakulteta;
    }

    public Long getProgramId() {
        return programId;
    }

    public void setProgramId(Long programId) {
        this.programId = programId;
    }

    public Fakultet getFakultet() {
        return fakultet;
    }

    public void setFakultet(Fakultet fakultet) {
        this.fakultet = fakultet;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public NivoStudija getNivoStudija() {
        return nivoStudija;
    }

    public void setNivoStudija(NivoStudija nivoStudija) {
        this.nivoStudija = nivoStudija;
    }

    @Override
    public String getTableName() {
        return " studijskiprogram ";
    }

    @Override
    public String getAllColumnNames() {
        return " * ";
    }

    @Override
    public String getAllInsertColumnNames() {
        return "fakultetid, programid, naziv, nivoid, naziv_fakulteta";
    }

    @Override
    public String getColumnValues() {
        return String.format("%d, %d, '%s', %d, '%s'",
                this.fakultet.getFakultetId(),
                this.programId,
                this.naziv,
                this.nivoStudija.getNivoId(),
                this.nazivFakulteta);
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
        return String.format("fakultetid=%d AND programid=%d", this.getFakultet().getFakultetId(), this.getProgramId());
    }

    @Override
    public String getDeleteWhereClause() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<DomainObject> getObjectsFromResultSet(ResultSet rs) throws SQLException {
        List<DomainObject> programi = new ArrayList<>();
        while (rs.next()) {
            Long programId = rs.getLong(1);
            Long fakultetId = rs.getLong(2);
            String nazivp = rs.getString(3);
            Long nivoid = rs.getLong(4);
            String nazivFak = rs.getString(5);
            String nazivNivo = rs.getString(7);
            String trajanje = rs.getString(8);
            int espb = rs.getInt(9);
            NivoStudija ns = new NivoStudija(nivoid, nazivNivo, trajanje, espb);
            Fakultet fakultet = new Fakultet();
            fakultet.setFakultetId(fakultetId);
            StudijskiProgram sp = new StudijskiProgram(programId, fakultet, nazivp, ns, nazivFak);
            System.out.println(sp.getNaziv());
            programi.add(sp);
        }
        return programi;
    }

    @Override
    public String getOrderByColumn() {
        return "programid";
    }

    @Override
    public String alijas() {
        return " sp ";
    }

    @Override
    public String getJoin() {
        return " join nivostudija ns on (sp.nivoid = ns.nivoid) ";
    }

    @Override
    public String toString() {
        return naziv;
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
        final StudijskiProgram other = (StudijskiProgram) obj;
        return Objects.equals(this.programId, other.programId);
    }

}
