/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dbbroker.DBBroker;
import domain.object.entities.Fakultet;
import domain.object.entities.Student;
import domain.object.entities.StudentskiCentar;
import domain.object.entities.StudijskiProgram;
import domain.object.entities.Uplatnica;
import domain.object.entities.Valuta;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Kristina
 */
public class Controller {
    
    DBBroker dbBroker;
    private static Controller instance;
    
    private Controller(){
        dbBroker=new DBBroker();
    }

    public static Controller getInstance() {
        if(instance==null)
            instance = new Controller();
        return instance;
    }

    public List<Fakultet> getAllFakulteti() throws Exception {
        List<Fakultet> fakulteti = new LinkedList<>();
        dbBroker.connect();
        fakulteti = (List<Fakultet>)(Object)dbBroker.getAll(new Fakultet());
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

    public void insertProgram(StudijskiProgram sp) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void deleteProgram(StudijskiProgram sp) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void updateProgram(StudijskiProgram sp, String setClause) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public List<StudijskiProgram> getAllProgrami() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public List<Uplatnica> getAllUplatnica() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public List<StudentskiCentar> getAllStudentskiCentar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public List<Student> getAllStudent() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public List<Valuta> getAllValuta() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public List<StudentskiCentar> findCentar(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void updateUplatnica(Uplatnica u, String setClause) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void insertUplatnica(Uplatnica u) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void insertStudentskiCentar(StudentskiCentar sc) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void updateStudentskiCentar(StudentskiCentar sc) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


}
