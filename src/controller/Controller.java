/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dbbroker.DBBroker;
import domain.object.entities.Broj;
import domain.object.entities.EvidencijaAdresa;
import domain.object.entities.Fakultet;
import domain.object.entities.Grad;
import domain.object.entities.LicnaKarta;
import domain.object.entities.Mesto;
import domain.object.entities.NivoStudija;
import domain.object.entities.Student;
import domain.object.entities.StudentskiCentar;
import domain.object.entities.StudijskiProgram;
import domain.object.entities.Ulica;
import domain.object.entities.Uplatnica;
import domain.object.entities.UverenjeODiplomiranju;
import domain.object.entities.UverenjeOStudiranju;
import domain.object.entities.UverenjeOStudiranjuDetalji;
import domain.object.entities.UverenjeOStudiranjuOsnovno;
import domain.object.entities.Valuta;
import domain.object.entities.Zaposleni;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;

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
        try {
            dbBroker.updatePartial(sp, setClause);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
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
        try {
            dbBroker.updatePartial(u, setClause);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
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

    public List<UverenjeODiplomiranju> getAllDiplomiranja() throws Exception {
        dbBroker.connect();
        List<UverenjeODiplomiranju> uverenja = (List<UverenjeODiplomiranju>) (Object) dbBroker.getAll(new UverenjeODiplomiranju());
        dbBroker.disconnect();;
        return uverenja;
    }

    public List<UverenjeODiplomiranju> getAllParticion(String uslov) throws Exception {
        dbBroker.connect();
        List<UverenjeODiplomiranju> uverenja = (List<UverenjeODiplomiranju>) (Object) dbBroker.getPartition(new UverenjeODiplomiranju(), uslov);
        dbBroker.disconnect();
        return uverenja;
    }

    public List<Zaposleni> getAllZaposleni() throws Exception {
        dbBroker.connect();
        List<Zaposleni> zaposleni = (List<Zaposleni>) (Object) dbBroker.getAll(new Zaposleni());
        dbBroker.disconnect();
        return zaposleni;
    }

    public List<Zaposleni> findZaposleni(String string) throws Exception {
        dbBroker.connect();
        List<Zaposleni> z = (List<Zaposleni>) (Object) dbBroker.getAllWithWhere(new Zaposleni(), string);
        dbBroker.disconnect();
        return z;
    }

    public void insertUverenjeODiplomiranju(UverenjeODiplomiranju ud) throws Exception {
        dbBroker.connect();
        dbBroker.insert(ud);
        dbBroker.disconnect();
    }

    public List<UverenjeOStudiranjuOsnovno> getAllUverenjeOsnovno() throws Exception {
        dbBroker.connect();
        List<UverenjeOStudiranjuOsnovno> uso = (LinkedList<UverenjeOStudiranjuOsnovno>) (Object) dbBroker.getAll(new UverenjeOStudiranjuOsnovno());
        dbBroker.disconnect();
        return uso;
    }

    public List<UverenjeOStudiranju> getAllUverenje() throws Exception {
        dbBroker.connect();
        List<UverenjeOStudiranju> uos = (LinkedList<UverenjeOStudiranju>) (Object) dbBroker.getAll(new UverenjeOStudiranju());
        dbBroker.disconnect();
        return uos;
    }

    public List<UverenjeOStudiranjuDetalji> getAllUverenjeDetalji() throws Exception {
        dbBroker.connect();
        List<UverenjeOStudiranjuDetalji> uos = (LinkedList<UverenjeOStudiranjuDetalji>) (Object) dbBroker.getAll(new UverenjeOStudiranjuDetalji());
        dbBroker.disconnect();
        return uos;
    }

    public List<UverenjeOStudiranju> findUverenje(String string) throws Exception {
        dbBroker.connect();
        List<UverenjeOStudiranju> uverenja = (List<UverenjeOStudiranju>) (Object) dbBroker.getAllWithWhere(new UverenjeOStudiranju(), string);
        dbBroker.disconnect();
        return uverenja;
    }

    public List<LicnaKarta> getAllLicnaKarta() throws Exception {
        dbBroker.connect();
        List<LicnaKarta> lk = (List<LicnaKarta>) (Object) dbBroker.getAll(new LicnaKarta());
        dbBroker.disconnect();
        return lk;
    }

    public List<EvidencijaAdresa> findEvidencija(String string) throws Exception {
        dbBroker.connect();
        List<EvidencijaAdresa> evidencija = (List<EvidencijaAdresa>) (Object) dbBroker.getAllWithWhere(new EvidencijaAdresa(), string);
        dbBroker.disconnect();
        return evidencija;
    }

    public void insertUverenjePogled(UverenjeOStudiranju uos) throws Exception {
        dbBroker.connect();
        dbBroker.insert(uos);
        dbBroker.disconnect();
    }

    public void updateUverenjePogled(UverenjeOStudiranju uos) throws Exception {
        dbBroker.connect();
        dbBroker.update(uos);
        dbBroker.disconnect();
    }

    public void deleteUverenjePogled(UverenjeOStudiranju uos) throws Exception {
        dbBroker.connect();
        dbBroker.delete(uos);
        dbBroker.disconnect();
    }

    public List<Grad> getAllGrad() throws Exception {
        dbBroker.connect();
        List<Grad> gradovi = (LinkedList<Grad>) (Object) dbBroker.getAll(new Grad());
        dbBroker.disconnect();
        return gradovi;
    }

    public List<Mesto> findMesto(String string) throws Exception {
        dbBroker.connect();
        List<Mesto> mesta = (LinkedList<Mesto>) (Object) dbBroker.getAllWithWhere(new Mesto(), string);
        dbBroker.disconnect();
        return mesta;
    }

    public List<Ulica> findUlica(String string) throws Exception {
        dbBroker.connect();
        List<Ulica> ulice = (LinkedList<Ulica>) (Object) dbBroker.getAllWithWhere(new Ulica(), string);
        dbBroker.disconnect();
        return ulice;
    }

    public List<Broj> findBroj(String string) throws Exception {
        dbBroker.connect();
        List<Broj> broj = (LinkedList<Broj>) (Object) dbBroker.getAllWithWhere(new Broj(), string);
        dbBroker.disconnect();
        return broj;
    }

    public void insertEvidencija(EvidencijaAdresa ea) throws Exception {
        dbBroker.connect();
        dbBroker.insert(ea);
        dbBroker.disconnect();
    }

    public void updateEvidencija(EvidencijaAdresa ea) throws Exception {
        dbBroker.connect();
        dbBroker.update(ea);
        dbBroker.disconnect();
    }

    public void deleteEvidencija(EvidencijaAdresa ea) throws Exception {
        dbBroker.connect();
        dbBroker.delete(ea);
        dbBroker.disconnect();
    }

    public void updateLicnaKarta(LicnaKarta lk) throws Exception {
        dbBroker.connect();
        try {
            dbBroker.update(lk);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        dbBroker.disconnect();
       
    }

}
