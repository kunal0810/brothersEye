/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avishkar;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;

/**
 *
 * @author rohit
 */
public class treding extends javax.swing.JFrame {

    /**
     * Creates new form treding
     * @throws java.lang.ClassNotFoundException
     * @throws java.sql.SQLException
     */
    public treding() throws ClassNotFoundException, SQLException {
        initComponents();
        
        
        DefaultListModel model1 = new DefaultListModel();
        DefaultListModel model2 = new DefaultListModel();
        DefaultListModel model3 = new DefaultListModel();
        DefaultListModel model4 = new DefaultListModel();
        
        
        
       
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/avishkar", "root","rohit@dell1");
        PreparedStatement stmt1 = conn2.prepareStatement("select question from tspoj");
        ResultSet rs1 = stmt1.executeQuery();
        while(rs1.next())
        {
            model1.addElement(rs1.getString(1));
        }
        slist.setModel(model1);
        
        
        PreparedStatement stmt2 = conn2.prepareStatement("select question from tcodechef");
        ResultSet rs2 = stmt2.executeQuery();
        while(rs2.next())
        {
            model2.addElement(rs2.getString(1));
        }
        cclist.setModel(model2);
        
         PreparedStatement stmt3 = conn2.prepareStatement("select question from tcodeforce");
        ResultSet rs3 = stmt3.executeQuery();
        while(rs3.next())
        {
            model3.addElement(rs3.getString(1));
        }
        cflist.setModel(model3);
        
         PreparedStatement stmt4 = conn2.prepareStatement("select question from thackerrank");
        ResultSet rs4 = stmt4.executeQuery();
        while(rs4.next())
        {
            model4.addElement(rs4.getString(1));
        }
        hrlist.setModel(model4);
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
        slist = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        hrlist = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        cclist = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        cflist = new javax.swing.JList<>();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(slist);

        jScrollPane2.setViewportView(hrlist);

        jScrollPane3.setViewportView(cclist);

        jScrollPane4.setViewportView(cflist);

        back.setText("BACK");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(54, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(back)
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                    .addComponent(jScrollPane4))
                .addGap(45, 45, 45))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new treding().setVisible(true);
            } catch (IOException ex) {
                Logger.getLogger(user.class.getName()).log(Level.SEVERE, null, ex);
            }
            catch(SQLException e)
            {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JList<String> cclist;
    private javax.swing.JList<String> cflist;
    private javax.swing.JList<String> hrlist;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JList<String> slist;
    // End of variables declaration//GEN-END:variables
}