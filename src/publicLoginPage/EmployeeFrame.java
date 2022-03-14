/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package publicLoginPage;

import deviceListener.LabelButtonListener;


import userFrame.employeeFrame.AddNewBus;
import userFrame.employeeFrame.EmpDashBoard;
import userFrame.employeeFrame.PassIDConfirm;
import userFrame.employeeFrame.PaymentConfirm;
import userFrame.employeeFrame.RefundOrCancel;
import userFrame.employeeFrame.TicketsSold;
import userFrame.employeeFrame.BusEdit;
import java.awt.Component;
import java.awt.MouseInfo;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import userFrame.employeeFrame.QueryReply;

/**
 *
 * @author cis101
 */
public class EmployeeFrame extends javax.swing.JFrame {

    /**
     * Creates new form UserFrame
     */
    public EmployeeFrame(Component parent) {
        this.parent = parent;
        parent.setVisible(true);
        initComponents();
        
      
        jLabel3.addMouseListener(new LabelButtonListener(jPanel4,jLabel3,jDesktopPane1){
            @Override
            public void mousePressed(MouseEvent me) {
                jDesktopPane1.removeAll();
                jDesktopPane1.add(new QueryReply());
                jDesktopPane1.revalidate();
            }
            
        });
        
      
        
        jDesktopPane1.add(new EmpDashBoard());
        jDesktopPane1.revalidate();
        jLabel2.addMouseListener(new LabelButtonListener(jPanel4,jLabel2,jDesktopPane1){
            @Override
            public void mousePressed(MouseEvent me) {
                jDesktopPane1.removeAll();
                jDesktopPane1.add(new EmpDashBoard());
                jDesktopPane1.revalidate();
            }
            
        });
        jLabel8.addMouseListener(new LabelButtonListener(jPanel4,jLabel8,jDesktopPane1){
            @Override
            public void mousePressed(MouseEvent me) {
                jDesktopPane1.removeAll();
                jDesktopPane1.add(new PassIDConfirm());
                jDesktopPane1.revalidate();
            }
        });
        jLabel4.addMouseListener(new LabelButtonListener(jPanel4,jLabel4,jDesktopPane1){
            @Override
            public void mousePressed(MouseEvent me) {
                jDesktopPane1.removeAll();
                jDesktopPane1.add(new AddNewBus());
                jDesktopPane1.revalidate();
            }
            
        });
        jLabel7.addMouseListener(new LabelButtonListener(jPanel4,jLabel7,jDesktopPane1){
            @Override
            public void mousePressed(MouseEvent me) {
                jDesktopPane1.removeAll();
                jDesktopPane1.add(new PaymentConfirm());
                jDesktopPane1.revalidate();
            }
            
        });
        
        jLabel5.addMouseListener(new LabelButtonListener(jPanel4,jLabel5,jDesktopPane1){
            @Override
            public void mousePressed(MouseEvent me) {
                jDesktopPane1.removeAll();
                jDesktopPane1.add(new RefundOrCancel());
                jDesktopPane1.revalidate();
            }
            
        });
        jLabel9.addMouseListener(new LabelButtonListener(jPanel4,jLabel9,jDesktopPane1){
            @Override
            public void mousePressed(MouseEvent me) {
                jDesktopPane1.removeAll();
                jDesktopPane1.add(new TicketsSold());
                jDesktopPane1.revalidate();
            }
            
        });
        jLabel10.addMouseListener(new LabelButtonListener(jPanel4,jLabel10,jDesktopPane1){
            @Override
            public void mousePressed(MouseEvent me) {
                jDesktopPane1.removeAll();
                jDesktopPane1.add(new BusEdit());
                jDesktopPane1.revalidate();
            }
            
        });
        
        jPanel5.addMouseMotionListener(new MouseMotionListener() {

            @Override
            public void mouseDragged(MouseEvent e) {
                owner.setLocation(MouseInfo.getPointerInfo().getLocation());
            }

            @Override
            public void mouseMoved(MouseEvent e) {
            }
        });
        jLabel1.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {                
            }

            @Override
            public void mousePressed(MouseEvent e) {
                owner.setVisible(false);
                owner.dispose();
                parent.setVisible(true);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(153, 102, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 149, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 60));

        jPanel4.setBackground(new java.awt.Color(153, 153, 255));
        jPanel4.setLayout(new java.awt.GridLayout(20, 0, 0, -3));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Dashboard");
        jLabel2.setOpaque(true);
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel2);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Add Bus ");
        jLabel4.setOpaque(true);
        jPanel4.add(jLabel4);

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Passenger ID Confirmation");
        jLabel8.setOpaque(true);
        jPanel4.add(jLabel8);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Payment Confirmation");
        jLabel7.setOpaque(true);
        jPanel4.add(jLabel7);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Query Reply");
        jLabel3.setOpaque(true);
        jPanel4.add(jLabel3);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Refund Ticket Request");
        jLabel5.setOpaque(true);
        jPanel4.add(jLabel5);

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Tickets Sold");
        jLabel9.setOpaque(true);
        jPanel4.add(jLabel9);

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Bus Edit");
        jLabel10.setOpaque(true);
        jPanel4.add(jLabel10);

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 150, 640));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 700));

        jDesktopPane1.setBackground(new java.awt.Color(0, 204, 204));
        jDesktopPane1.setLayout(new javax.swing.BoxLayout(jDesktopPane1, javax.swing.BoxLayout.LINE_AXIS));
        getContentPane().add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 850, 640));

        jPanel5.setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel1.setText("X");
        jLabel1.setToolTipText("");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(825, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 28, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 850, 60));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
       
    }//GEN-LAST:event_jLabel2MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        javax.swing.UIManager.getSystemLookAndFeelClassName();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeFrame(null).setVisible(true);
            }
        });
    }

    JFrame owner=this;
    Component parent;
    JInternalFrame temp;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
