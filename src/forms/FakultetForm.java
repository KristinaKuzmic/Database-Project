/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package forms;

import controller.Controller;
import domain.object.entities.Fakultet;
import domain.object.entities.NivoStudija;
import domain.object.entities.StudijskiProgram;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.plaf.basic.BasicListUI;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Kristina
 */
public class FakultetForm extends javax.swing.JFrame {

    List<Fakultet> fakulteti = new LinkedList<Fakultet>();
    List<Fakultet> pronadjeniFakulteti = new LinkedList<>();
    List<StudijskiProgram> studijskiProgrami = new LinkedList<>();
    List<StudijskiProgram> pronadjeniProgrami = new LinkedList<>();
    HashMap<Integer, String[]> orinalneVrednostiPrograma = new HashMap<>();

    /**
     * Creates new form FakultetForm
     */
    public FakultetForm() throws Exception {
        initComponents();
        setLocationRelativeTo(null);
        loadDataIntoForm();
        setUpTableListenerTblFakultet();
        setUpTableLiistenerTblStudijskiProgram();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblFakultet = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cmbNivo = new javax.swing.JComboBox<>();
        txtNaziv = new javax.swing.JTextField();
        txtProgramId = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNazivFakulteta = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnSacuvaj = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProgram = new javax.swing.JTable();
        btnIzmeniFakultet = new javax.swing.JButton();
        btnObrisi = new javax.swing.JButton();
        btnIzmeniProgram = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblFakultet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fakultet id", "Naziv"
            }
        ));
        jScrollPane1.setViewportView(tblFakultet);

        jLabel1.setText("Fakultet");

        jLabel2.setText("Program id");

        jLabel3.setText("Naziv studijskog programa");

        jLabel4.setText("Nivo studija");

        cmbNivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbNivoActionPerformed(evt);
            }
        });

        jLabel5.setText("Naziv fakulteta");

        jLabel6.setText("Studijski program");

        btnSacuvaj.setText("sacuvaj");
        btnSacuvaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSacuvajActionPerformed(evt);
            }
        });

        tblProgram.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Program id", "Fakultet id", "Naziv studijskog programa", "Nivo id", "Naziv fakulteta"
            }
        ));
        jScrollPane2.setViewportView(tblProgram);

        btnIzmeniFakultet.setText("izmeni");
        btnIzmeniFakultet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIzmeniFakultetActionPerformed(evt);
            }
        });

        btnObrisi.setText("obrisi");
        btnObrisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObrisiActionPerformed(evt);
            }
        });

        btnIzmeniProgram.setText("izmeni");
        btnIzmeniProgram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIzmeniProgramActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnSacuvaj)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cmbNivo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtNaziv)
                                            .addComponent(txtProgramId)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtNazivFakulteta, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)))))
                        .addContainerGap(382, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnIzmeniFakultet))
                            .addComponent(jScrollPane2)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnIzmeniProgram)
                                        .addGap(37, 37, 37)
                                        .addComponent(btnObrisi))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 788, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(19, 19, 19))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnIzmeniFakultet)
                .addGap(14, 14, 14)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtProgramId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmbNivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtNazivFakulteta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnSacuvaj)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIzmeniProgram)
                    .addComponent(btnObrisi))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIzmeniFakultetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzmeniFakultetActionPerformed
        try {
            // TODO add your handling code here:
            
            Fakultet fakultet = izabraniFakultet();
            Controller.getInstance().updateFakultet(fakultet);
            popuniTabeluProgramima(fakultet.getFakultetId());
        } catch (Exception ex) {
            Logger.getLogger(FakultetForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnIzmeniFakultetActionPerformed

    private void btnObrisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrisiActionPerformed
        try {
            // TODO add your handling code here:
            
            StudijskiProgram sp = izabraniProgram();
            Controller.getInstance().deleteProgram(sp);
            popuniTabeluProgramima(sp.getFakultet().getFakultetId());
        } catch (Exception ex) {
            Logger.getLogger(FakultetForm.class.getName()).log(Level.SEVERE, null, ex);
        }
                
    }//GEN-LAST:event_btnObrisiActionPerformed

    private void cmbNivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbNivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbNivoActionPerformed

    private void btnSacuvajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSacuvajActionPerformed
        try {
            // TODO add your handling code here:
            
            StudijskiProgram sp = preuzmiPodatke();
            
            Controller.getInstance().insertProgram(sp);
            
            StudijskiProgram studijskiProgram = izabraniProgram();
            
            popuniTabeluProgramima(studijskiProgram.getFakultet().getFakultetId());
        } catch (Exception ex) {
            Logger.getLogger(FakultetForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSacuvajActionPerformed

    private void btnIzmeniProgramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzmeniProgramActionPerformed
        // TODO add your handling code here:
        
        StudijskiProgram sp = izabraniProgram();
        String setClause = generisiSetClause(tblProgram,tblProgram.getSelectedRow());
        
        Controller.getInstance().updateProgram(sp, setClause);
        
        ucitajPrograme();
    }//GEN-LAST:event_btnIzmeniProgramActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIzmeniFakultet;
    private javax.swing.JButton btnIzmeniProgram;
    private javax.swing.JButton btnObrisi;
    private javax.swing.JButton btnSacuvaj;
    private javax.swing.JComboBox<Object> cmbNivo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblFakultet;
    private javax.swing.JTable tblProgram;
    private javax.swing.JTextField txtNaziv;
    private javax.swing.JTextField txtNazivFakulteta;
    private javax.swing.JTextField txtProgramId;
    // End of variables declaration//GEN-END:variables

    private void loadDataIntoForm() throws Exception {
        getAllFakultet();
    }

    private void getAllFakultet() throws Exception {
        DefaultTableModel dfm = (DefaultTableModel) tblFakultet.getModel();

        fakulteti = Controller.getInstance().getAllFakulteti();

        for (Fakultet fakultet : fakulteti) {
            dfm.addRow(new Object[]{fakultet.getFakultetId(), fakultet.getNaziv()});
        }

    }

    private Fakultet izabraniFakultet() {
        Long fakultetId = 0l;
        String naziv = "";
        if (tblFakultet.getSelectedRow() >= 0) {
            DefaultTableModel dtm = (DefaultTableModel) tblFakultet.getModel();
            fakultetId = (Long) dtm.getValueAt(tblFakultet.getSelectedRow(), 0);
            naziv = (String) dtm.getValueAt(tblFakultet.getSelectedRow(), 1);
        }
        Fakultet fakultet = new Fakultet();
        fakultet.setFakultetId(fakultetId);
        fakultet.setNaziv(naziv);

        return fakultet;
    }

    private void popuniTabeluProgramima(Long fakultetId) throws Exception {
        DefaultTableModel dfm = (DefaultTableModel) tblProgram.getModel();
        dfm.setRowCount(0);       
        studijskiProgrami = Controller.getInstance().findProgrami("fakultetid='" + String.valueOf(fakultetId) + "'");
        for (StudijskiProgram sp : studijskiProgrami) {
            dfm.addRow(new Object[]{sp.getProgramId(), sp.getFakultet().getFakultetId(), sp.getNaziv(), sp.getNivoStudija().getNaziv(), sp.getNazivFakulteta()});
        }
        //System.out.println(orinalneVrednostiPrograma);
    }

    private void sacuvajOriginalneVrednosti(JTable tblFakultet) {
        DefaultTableModel dfm = (DefaultTableModel) tblProgram.getModel();

        for (int i = 0; i < dfm.getRowCount(); i++) {
            Long programId = (Long) dfm.getValueAt(i, 0);
            Long fakultetId = (Long) dfm.getValueAt(i, 1);
            String nazivPrograma = (String) dfm.getValueAt(i, 2);
            String nazivNivoa = (String) dfm.getValueAt(i, 3);
            String nazivFakulteta = (String) dfm.getValueAt(i, 4);

            orinalneVrednostiPrograma.put(i, new String[]{String.valueOf(programId), String.valueOf(fakultetId),
                nazivPrograma, nazivNivoa, nazivFakulteta});

        }
    }

    private void setUpTableListenerTblFakultet() {
        tblFakultet.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    try {
                        Fakultet izabraniFakultet = izabraniFakultet();
                        pronadjeniFakulteti = Controller.getInstance().findFakultet("fakultetid='" + String.valueOf(izabraniFakultet.getFakultetId()) + "'");

                        if (pronadjeniFakulteti != null && !pronadjeniFakulteti.isEmpty()) {
                            izabraniFakultet = pronadjeniFakulteti.get(0);
                        }
                        //popunjavam tabelu studijski program
                        
                        popuniTabeluProgramima(izabraniFakultet.getFakultetId());
                        orinalneVrednostiPrograma.clear();
                        sacuvajOriginalneVrednosti(tblFakultet);
                        System.out.println(orinalneVrednostiPrograma);
                    } catch (Exception ex) {
                    }
                }
            }

        });
    }

    private StudijskiProgram izabraniProgram() {
        Long programid = 0l;
        Long fakultetid = 0l;
        String nazivP = null;
        String nivoS = null;
        String nazivFak = null;

        int izabraniP = tblProgram.getSelectedRow();
        if (izabraniP >= 0) {
            DefaultTableModel dfm = (DefaultTableModel) tblProgram.getModel();
            programid = (Long) dfm.getValueAt(izabraniP, 0);
            fakultetid = (Long) dfm.getValueAt(izabraniP, 1);
            nazivP = (String) dfm.getValueAt(izabraniP, 2);
            nivoS = (String) dfm.getValueAt(izabraniP, 3);
            nazivFak = (String) dfm.getValueAt(izabraniP, 4);
        }

        StudijskiProgram sp = new StudijskiProgram();
        sp.setProgramId(programid);
        sp.setNaziv(nazivP);
        sp.setNazivFakulteta(nazivFak);
        NivoStudija ns = new NivoStudija();
        ns.setNaziv(nivoS);
        sp.setNivoStudija(ns);
        return sp;
    }

    private void popuniFormuProgram(StudijskiProgram izabraniProgram) {
        txtProgramId.setText(String.valueOf(izabraniProgram.getProgramId()));
        txtNaziv.setText(izabraniProgram.getNaziv());
        txtNazivFakulteta.setText(izabraniProgram().getNazivFakulteta());
        cmbNivo.addItem(izabraniProgram.getNivoStudija().getNaziv());
        cmbNivo.setSelectedItem(izabraniProgram.getNivoStudija().getNaziv()); 
    }

    private void setUpTableLiistenerTblStudijskiProgram() {
        tblProgram.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    try {
                        StudijskiProgram izabraniProgram = izabraniProgram();
                        pronadjeniProgrami = Controller.getInstance().findProgrami("programid = '" + String.valueOf(izabraniProgram.getProgramId()) + "'");
                        if (pronadjeniProgrami != null && !pronadjeniProgrami.isEmpty()) {
                            izabraniProgram = pronadjeniProgrami.get(0);
                        }
                        //popunjavam formu sa podacima iz programa

                        popuniFormuProgram(izabraniProgram);
                    } catch (Exception ex) {
                    }
                }
            }

        });
    }
    
     private void reloadGridProgram(){
        tblProgram = new javax.swing.JTable();
        jScrollPane2.setViewportView(tblProgram);
        tblProgram.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Program id", "Fakultet id", "Naziv studijskog programa", "Nivo studija", "Naziv  fakulteta"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        this.setUpTableLiistenerTblStudijskiProgram();
    }

    private StudijskiProgram preuzmiPodatke() {
        Long programId = Long.parseLong(txtProgramId.getText());
        String nazivP = txtNaziv.getText();
        Long fakultetId = izabraniFakultet().getFakultetId();
        
        StudijskiProgram sp = new StudijskiProgram();
        sp.setProgramId(programId);
        sp.setNaziv(nazivP);
        sp.setFakultet(izabraniFakultet());
        return sp;
    }

    private String generisiSetClause(JTable tblProgram, int selectedRow) {
        DefaultTableModel dfm = (DefaultTableModel) tblProgram.getModel();
        StringBuilder stringBuilder = new StringBuilder(" ");
        
        Long fakultetId = (Long) dfm.getValueAt(selectedRow, 1);
        String nazivPrograma = (String) dfm.getValueAt(selectedRow, 2);
        String nazivFakulteta = (String) dfm.getValueAt(selectedRow, 4);
        
        String[] original = orinalneVrednostiPrograma.get(selectedRow);
        String orgFakultetid = original[1];
        String orgFakultetIdString = fakultetId.toString();
        
        String orgNaziv = original[2];
        String orgFakultetNaziv = original[4];
        
        boolean needComma = false;
        
         if(!orgFakultetIdString.equals(orgFakultetid)) {
            stringBuilder.append("fakultetid = '").append(orgFakultetIdString).append("' ");
            needComma = true;
        }
        if (!nazivPrograma.equals(orgNaziv)) {
            stringBuilder.append("NAZIV = '").append(nazivPrograma).append("'");
            needComma = true;
        }
        if (!nazivFakulteta.equals(orgFakultetNaziv)) {
            if (needComma) {
                stringBuilder.append(", ");
            }
            stringBuilder.append("naziv_fakulteta = '").append(nazivFakulteta).append("'");
        }
        
        return stringBuilder.toString();
    }

    private void ucitajPrograme() {
        DefaultTableModel dfm = (DefaultTableModel) tblProgram.getModel();
        
        studijskiProgrami = Controller.getInstance().getAllProgrami();
        
        for (StudijskiProgram sp : studijskiProgrami) {
            dfm.addRow(new Object[]{sp.getProgramId(), sp.getFakultet().getFakultetId(), sp.getNaziv(), sp.getNivoStudija().getNaziv(), sp.getNazivFakulteta()});
        }
    }
}
