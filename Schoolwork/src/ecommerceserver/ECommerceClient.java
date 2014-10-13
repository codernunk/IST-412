/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ecommerceserver;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import javax.swing.JOptionPane;

/**
 * This class provides a GUI to interface with the Product server.
 * The user can enter a product ID and press a button
 * to get more information about the product.
 * @author Jesse
 * @date October 13, 2014
 */
public class ECommerceClient extends javax.swing.JFrame {

    // Variables
    private Socket mainSocket;
    private InputStream in;
    private OutputStream out;
    /**
     * Creates new form ECommerceClient
     */
    public ECommerceClient() {
        initComponents();
        
        /*try{
            //mainSocket = new Socket("localhost",1200);
            //in = mainSocket.getInputStream();
            //out = mainSocket.getOutputStream();
        }catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,"The application failed to connect to the product server.  The application will now terminate.");
            System.exit(0);
        }*/
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jtfQuery = new javax.swing.JTextField();
        jbtQuantity = new javax.swing.JButton();
        jbtName = new javax.swing.JButton();
        jbtExit = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaResult = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("ECommerce Client");

        jtfQuery.setToolTipText("");

        jbtQuantity.setText("Quantity");
        jbtQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtQuantityActionPerformed(evt);
            }
        });

        jbtName.setText("Name");
        jbtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtNameActionPerformed(evt);
            }
        });

        jbtExit.setText("Exit");
        jbtExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtExitActionPerformed(evt);
            }
        });

        jLabel2.setText("Enter a Product ID:");

        jLabel3.setText("The result:");

        jtaResult.setEditable(false);
        jtaResult.setColumns(20);
        jtaResult.setRows(5);
        jScrollPane1.setViewportView(jtaResult);

        jLabel4.setText("Now choose what to display: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(152, 152, 152))
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jbtName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbtQuantity)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jbtExit))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtfQuery, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 109, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfQuery, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtQuantity)
                    .addComponent(jbtName)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtExit)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtNameActionPerformed
        // Establish a connection and ask for the product name.
        try{
            // We have to instantiate the socket here because this server will
            // try to accept a new socket per transaction.
            mainSocket = new Socket("localhost",1200);
            in = mainSocket.getInputStream();
            out = mainSocket.getOutputStream();
            
            // Create the PrintWriter that will send the user's input over to the server.
            PrintWriter pw = new PrintWriter(out,true);
            
            String query = "I"+jtfQuery.getText();
            
            // Write the message
            pw.println(query);
            pw.flush();
            
            // Get the response
            BufferedReader bf = new BufferedReader(new InputStreamReader(in));    

            // Show the result to the user.
            String result = bf.readLine();
            
            if (result.equals("*"))
                result = "Error: Product not found.";            
            
            jtaResult.setText(result);
            
            // Finally, close the socket
            mainSocket.close();            
        }catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,"The application failed to connect to the product server.");           
        }
    }//GEN-LAST:event_jbtNameActionPerformed

    private void jbtQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtQuantityActionPerformed
        // Establish a connection and ask for the product quantity
        try{
            // We have to instantiate the socket here because this server will
            // try to accept a new socket per transaction.
            mainSocket = new Socket("localhost",1200);
            in = mainSocket.getInputStream();
            out = mainSocket.getOutputStream();
            
            // Create the PrintWriter that will send the user's input over to the server.
            PrintWriter pw = new PrintWriter(out,true);
            
            String query = "Q"+jtfQuery.getText();
            
            // Write the message
            pw.println(query);
            pw.flush();
            
            // Get the response
            BufferedReader bf = new BufferedReader(new InputStreamReader(in));            
            
            // Show the result to the user.
            String result = bf.readLine();
            
            if (result.equals("*"))
                result = "Error: Product not found.";            
            
            jtaResult.setText(result);
            
            // Finally, close the socket
            mainSocket.close();            
        }catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,"The application failed to connect to the product server.");           
        }
    }//GEN-LAST:event_jbtQuantityActionPerformed

    private void jbtExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtExitActionPerformed
        // Exit the application.
        System.exit(0);
    }//GEN-LAST:event_jbtExitActionPerformed

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
            java.util.logging.Logger.getLogger(ECommerceClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ECommerceClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ECommerceClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ECommerceClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ECommerceClient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtExit;
    private javax.swing.JButton jbtName;
    private javax.swing.JButton jbtQuantity;
    private javax.swing.JTextArea jtaResult;
    private javax.swing.JTextField jtfQuery;
    // End of variables declaration//GEN-END:variables
}