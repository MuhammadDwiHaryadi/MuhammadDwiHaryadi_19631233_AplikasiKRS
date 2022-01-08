
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class profilmahasiswa extends javax.swing.JFrame {

    private void kosongkan_form(){
        txtNPM.setEditable(true);
        txtNPM.setText(null);
        txtNama.setText(null);
        cbJurusan.setSelectedItem(this);
        txtAlamat.setText(null);
        txtEmail.setText(null);
        txtTelp.setText(null);
    }
    
    private void tampilkan_data(){
        
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No.");
        model.addColumn("NPM");
        model.addColumn("Nama Mahasiswa");
        model.addColumn("Jurusan");
        model.addColumn("Alamat");
        model.addColumn("Email");
        model.addColumn("No.Telepon");
        
        try{
            int no = 1;
            String sql = "SELECT * FROM profilmahasiswa";
            java.sql.Connection conn = (Connection)konfig.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);                                                                                                                                            while(res.next()){
                model.addRow(new Object[]{no++,res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5),res.getString(6)});  
            }
            tabelMahasiswa.setModel(model);
        }catch (SQLException e){
            System.out.println("Error : " + e.getMessage());
            
        }
    }
    
    
    public profilmahasiswa() {
        initComponents();
        tampilkan_data();
        kosongkan_form();
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
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNPM = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        txtAlamat = new javax.swing.JTextField();
        cbJurusan = new javax.swing.JComboBox<>();
        txtEmail = new javax.swing.JTextField();
        txtTelp = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelMahasiswa = new javax.swing.JTable();
        tbTambah = new javax.swing.JButton();
        tbSimpan = new javax.swing.JButton();
        tbEdit = new javax.swing.JButton();
        tbHapus = new javax.swing.JButton();
        tbBatal = new javax.swing.JButton();
        tbKeluar = new javax.swing.JButton();
        btInput = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplikasi Pofil Mahasiswa (Input KRS)");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Pofil Mahasiswa");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 24, 220, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("NPM");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 71, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Nama Lengkap");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 109, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Jurusan");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 155, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Alamat");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 190, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Email");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 229, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("No Telepon");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 278, -1, -1));
        getContentPane().add(txtNPM, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 71, 136, -1));

        txtNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaActionPerformed(evt);
            }
        });
        getContentPane().add(txtNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 109, 216, -1));
        getContentPane().add(txtAlamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 187, 364, -1));

        cbJurusan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Teknik Informatika", "Sistem Informasi", "Administrasi Publik" }));
        getContentPane().add(cbJurusan, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 149, 171, -1));
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 229, 233, -1));
        getContentPane().add(txtTelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 278, 190, -1));

        tabelMahasiswa.setBackground(new java.awt.Color(102, 204, 255));
        tabelMahasiswa.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        tabelMahasiswa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabelMahasiswa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelMahasiswaMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tabelMahasiswa);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 621, 148));

        tbTambah.setBackground(new java.awt.Color(0, 51, 51));
        tbTambah.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tbTambah.setText("Tambah Data");
        tbTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbTambahActionPerformed(evt);
            }
        });
        getContentPane().add(tbTambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 333, -1, -1));

        tbSimpan.setBackground(new java.awt.Color(0, 153, 51));
        tbSimpan.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tbSimpan.setText("Simpan");
        tbSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbSimpanActionPerformed(evt);
            }
        });
        getContentPane().add(tbSimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 333, 87, -1));

        tbEdit.setBackground(new java.awt.Color(0, 255, 51));
        tbEdit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tbEdit.setText("Edit");
        tbEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbEditActionPerformed(evt);
            }
        });
        getContentPane().add(tbEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(277, 333, 70, -1));

        tbHapus.setBackground(new java.awt.Color(204, 255, 0));
        tbHapus.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tbHapus.setForeground(new java.awt.Color(102, 51, 0));
        tbHapus.setText("Hapus");
        tbHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbHapusActionPerformed(evt);
            }
        });
        getContentPane().add(tbHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 333, -1, -1));

        tbBatal.setBackground(new java.awt.Color(255, 255, 0));
        tbBatal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tbBatal.setText("Batal");
        tbBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbBatalActionPerformed(evt);
            }
        });
        getContentPane().add(tbBatal, new org.netbeans.lib.awtextra.AbsoluteConstraints(473, 333, -1, -1));

        tbKeluar.setBackground(new java.awt.Color(0, 153, 102));
        tbKeluar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tbKeluar.setText("Keluar");
        tbKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbKeluarActionPerformed(evt);
            }
        });
        getContentPane().add(tbKeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(567, 333, 92, -1));

        btInput.setBackground(new java.awt.Color(204, 255, 51));
        btInput.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btInput.setText("INPUT KRS");
        btInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInputActionPerformed(evt);
            }
        });
        getContentPane().add(btInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 263, 180, 40));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ANI.jpg"))); // NOI18N
        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1400, 0, 2180, 830));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaActionPerformed

    private void tbEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbEditActionPerformed
        // TODO add your handling code here:
        try{
            String sql = "UPDATE profilmahasiswa SET npm ='"+txtNPM.getText()+"',nama='"+txtNama.getText()+"',jurusan='"+cbJurusan.getSelectedItem()+"',alamat='"+txtAlamat.getText()+"',email='"+txtEmail.getText()+"',no_telp='"+txtTelp.getText()+"' WHERE npm = '"+txtNPM.getText()+"'";
            java.sql.Connection conn = (Connection)konfig.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "EDIT Data Berhasil.....");
        }catch (HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
    }//GEN-LAST:event_tbEditActionPerformed
    tampilkan_data();
    kosongkan_form();
    
    }
    private void tbHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbHapusActionPerformed
        // TODO add your handling code here:
        try{
        String sql = "DELETE FRROM profilmahasiswa WHERE npm='"+txtNPM.getText()+"'";
        java.sql.Connection conn = (Connection)konfig.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "HAPUS DAtA BERHASIL.....");
        }catch (HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
    }                                      
    tampilkan_data();
    kosongkan_form();
    }//GEN-LAST:event_tbHapusActionPerformed

    private void tbKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbKeluarActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_tbKeluarActionPerformed

    private void tbTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbTambahActionPerformed
        // TODO add your handling code here:
        kosongkan_form();
    }//GEN-LAST:event_tbTambahActionPerformed

    private void tbSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbSimpanActionPerformed
        // TODO add your handling code here:
        try{
            String sql = "INSERT INTO profilmahasiswa VALUES ('"+txtNPM.getText()+"','"+txtNama.getText()+"','"+cbJurusan.getSelectedItem()+"','"+txtAlamat.getText()+"','"+txtEmail.getText()+"','"+txtTelp.getText()+"')";
            java.sql.Connection conn = (Connection)konfig.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
             JOptionPane.showMessageDialog(null, "Proses Simpan Data Berhasil.....");
             tampilkan_data();
             kosongkan_form();
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }    
    }//GEN-LAST:event_tbSimpanActionPerformed

    private void tabelMahasiswaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMahasiswaMouseClicked
    
        int baris = tabelMahasiswa.rowAtPoint(evt.getPoint());
        String npm =tabelMahasiswa.getValueAt(baris, 1).toString();
        txtNPM.setText(npm);
        
        String nama =tabelMahasiswa.getValueAt(baris, 2).toString();
        txtNama.setText(nama);
        
        String jurusan =tabelMahasiswa.getValueAt(baris, 3).toString();
        cbJurusan.setSelectedItem(jurusan);
        
        String alamat =tabelMahasiswa.getValueAt(baris, 4).toString();
        txtAlamat.setText(alamat);
        
        String email =tabelMahasiswa.getValueAt(baris, 5).toString();
        txtEmail.setText(email);
        
        String no_telp =tabelMahasiswa.getValueAt(baris, 6).toString();
        txtTelp.setText(no_telp);
    }//GEN-LAST:event_tabelMahasiswaMouseClicked

    private void tbBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbBatalActionPerformed
        // TODO add your handling code here:
        kosongkan_form();
    }//GEN-LAST:event_tbBatalActionPerformed

    private void btInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInputActionPerformed
        // TODO add your handling code here:
          new PengisianKRS().setVisible(true);
            javax.swing.JOptionPane.showMessageDialog(null, "SILAHKAN AMBIL KRS");
            dispose();
    }//GEN-LAST:event_btInputActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(profilmahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(profilmahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(profilmahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(profilmahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new profilmahasiswa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btInput;
    private javax.swing.JComboBox<String> cbJurusan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable tabelMahasiswa;
    private javax.swing.JButton tbBatal;
    private javax.swing.JButton tbEdit;
    private javax.swing.JButton tbHapus;
    private javax.swing.JButton tbKeluar;
    private javax.swing.JButton tbSimpan;
    private javax.swing.JButton tbTambah;
    private javax.swing.JTextField txtAlamat;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNPM;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtTelp;
    // End of variables declaration//GEN-END:variables
}
