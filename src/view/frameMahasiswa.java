/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;
import javax.swing.table.DefaultTableModel;
import kelas.mahasiswa;
import org.json.JSONArray;
import org.json.JSONObject;
/**
 *
 * @author USER
 */
public class frameMahasiswa extends javax.swing.JFrame {

    public frameMahasiswa() {
        initComponents();
        loadTable();
       
    }
    
    void loadTable() {
        mahasiswa mhs = new mahasiswa();
        JSONObject obj = mhs.getMahasiswa();
        
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("NIM");
        model.addColumn("Nama");
        model.addColumn("JK");
        model.addColumn("Tempat Lahir");
        model.addColumn("Email");
        model.addColumn("HP");
        
        
         int rows = obj.getInt("rows");
        JSONArray results = obj.getJSONArray("results");
        mahasiswa.setDataMhs(results);
        if (rows !=0) {
            for (int i = 0; i < results.length(); i++) {
                JSONObject item = results.getJSONObject(i);
                model.addRow(new Object[] {
                item.getString("mhs_nim"),
                item.getString("mhs_nama"),
                item.getString("mhs_jk"),
                item.getString("mhs_tempatlahir"),
                item.getString("mhs_tanggallahir"),
                item.getString("mhs_email"),
                item.getString("mhs_hp"),
            });
 
            }
            tbMahasiswa.setModel(model);
         }
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
        tbMahasiswa = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        bclose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbMahasiswa.setModel(new javax.swing.table.DefaultTableModel(
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
        tbMahasiswa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbMahasiswaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbMahasiswa);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("DATA MAHASISWA");

        bclose.setText("close");
        bclose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bclose)
                .addGap(74, 74, 74))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                .addGap(36, 36, 36)
                .addComponent(bclose)
                .addGap(49, 49, 49))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bcloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcloseActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_bcloseActionPerformed

    private void tbMahasiswaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbMahasiswaMouseClicked
        // TODO add your handling code here:
        int baris = tbMahasiswa.rowAtPoint(evt.getPoint());
        mahasiswa.setBaris(baris);
        new frameProfil().setVisible(true);
        
    }//GEN-LAST:event_tbMahasiswaMouseClicked

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
            java.util.logging.Logger.getLogger(frameMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frameMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frameMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frameMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frameMahasiswa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bclose;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbMahasiswa;
    // End of variables declaration//GEN-END:variables
}
