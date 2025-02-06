/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dbbroker.DBBroker;
import domain.object.entities.Fakultet;
import domain.object.entities.NivoStudija;
import domain.object.entities.Student;
import domain.object.entities.StudentskiCentar;
import domain.object.entities.StudijskiProgram;
import domain.object.entities.Uplatnica;
import domain.object.entities.Valuta;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Kristina
 */
public class Controller {

    DBBroker dbBroker;
    private static Controller instance;

    private Controller() {
        dbBroker = new DBBroker();
    }

    public static Controller getInstance() {
        if (instance == null) {
            instance = new Controller();
        }
        return instance;
    }

    public List<Fakultet> getAllFakulteti() throws Exception {
        List<Fakultet> fakulteti = new LinkedList<>();
        dbBroker.connect();
        fakulteti = (List<Fakultet>) (Object) dbBroker.getAll(new Fakultet());
        dbBroker.disconnect();
        return fakulteti;
    }

    public List<Fakultet> findFakultet(String string) throws Exception {
        List<Fakultet> fakulteti = new LinkedList<>();
        dbBroker.connect();
        fakulteti = (List<Fakultet>) (Object) dbBroker.getAllWithWhere(new Fakultet(), string);
        dbBroker.disconnect();
        return fakulteti;
    }

    public List<StudijskiProgram> findProgrami(String string) throws Exception {
        List<StudijskiProgram> programi = new LinkedList<>();
        dbBroker.connect();
        programi = (List<StudijskiProgram>) (Object) dbBroker.getAllWithWhere(new StudijskiProgram(), string);
        dbBroker.disconnect();
        return programi;
    }

    public void updateFakultet(Fakultet fakultet) throws Exception {
        dbBroker.connect();
        dbBroker.update(fakultet);
        dbBroker.disconnect();
    }

    public void insertProgram(StudijskiProgram sp) throws Exception {
        dbBroker.connect();
        dbBroker.insert(sp);
        dbBroker.disconnect();

    }

    public void deleteProgram(StudijskiProgram sp) throws Exception {
        dbBroker.connect();
        dbBroker.delete(sp);
        dbBroker.disconnect();
    }

    public void updateProgram(StudijskiProgram sp, String setClause) throws Exception {
        dbBroker.connect();
        dbBroker.updatePartial(sp, setClause);
        dbBroker.disconnect();
    }

    public List<StudijskiProgram> getAllProgrami() throws Exception {
        dbBroker.connect();
        List<StudijskiProgram> sp = (List<StudijskiProgram>) (Object) dbBroker.getAll(new StudijskiProgram());
        dbBroker.disconnect();
        return sp;
    }

    public List<Uplatnica> getAllUplatnica() throws Exception {
        dbBroker.connect();
        List<Uplatnica> uplatnice = (List<Uplatnica>) (Object) dbBroker.getAll(new Uplatnica());
        dbBroker.disconnect();
        return uplatnice;
    }

    public List<StudentskiCentar> getAllStudentskiCentar() throws Exception {
        dbBroker.connect();
        List<StudentskiCentar> sc = (List<StudentskiCentar>) (Object) dbBroker.getAll(new StudentskiCentar());
        dbBroker.disconnect();
        return sc;
    }

    public List<Student> getAllStudent() throws Exception {
        dbBroker.connect();
        List<Student> studenti = (List<Student>) (Object) dbBroker.getAll(new Student());
        dbBroker.disconnect();
        return studenti;
    }

    public List<Valuta> getAllValuta() throws Exception {
        dbBroker.connect();
        List<Valuta> valute = (List<Valuta>) (Object) dbBroker.getAll(new Valuta());
        dbBroker.disconnect();
        return valute;
    }

    public List<StudentskiCentar> findCentar(String string) throws Exception {
        dbBroker.connect();
        List<StudentskiCentar> sc = (List<StudentskiCentar>) (Object) dbBroker.getAllWithWhere(new StudentskiCentar(), string);
        dbBroker.disconnect();
        return sc;
    }

    public void updateUplatnica(Uplatnica u, String setClause) throws Exception {
        dbBroker.connect();
        dbBroker.updatePartial(u, setClause);
        dbBroker.disconnect();
    }

    public void insertUplatnica(Uplatnica u) throws Exception {
        dbBroker.connect();
        dbBroker.insert(u);
        dbBroker.disconnect();
    }

    public void insertStudentskiCentar(StudentskiCentar sc) throws Exception {
        dbBroker.connect();
        dbBroker.insert(sc);
        dbBroker.disconnect();
    }

    public void updateStudentskiCentar(StudentskiCentar sc) throws Exception {
        dbBroker.connect();
        dbBroker.update(sc);
        dbBroker.disconnect();
    }

    public List<NivoStudija> getAllNivoStudija() throws Exception {
        dbBroker.connect();
        List<NivoStudija> ns = (List<NivoStudija>) (Object) dbBroker.getAll(new NivoStudija());
        dbBroker.disconnect();
        return ns;
    }

}
